package cn.redTrip.common;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.dto.ArticleVisit;
import cn.redTrip.mapper.VisitMapper;
import cn.redTrip.service.VisitService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author dzl
 * @date 2024/2/17 22:19
 */
@Configuration
public class RedisCacheForVisit {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Value("${Visit.expireTime}")
    private Long expireTime;

    @Value("${Visit.preFix}")
    private String preFix;

    @Resource
    private VisitMapper visitMapper;



    public void setVisit(ArticleVisit articleVisit){
        String visitPreFix = preFix + UserLocalThread.getThreadLocal();
        redisTemplate.opsForList().remove(visitPreFix,0,articleVisit);
        redisTemplate.opsForList().leftPush(visitPreFix,articleVisit);
        redisTemplate.opsForList().trim(visitPreFix,0,9);
        visitMapper.addVisit(articleVisit.getArticleId(),6,LocalDateTime.now().withSecond(0).withNano(0));



    }

    public CommonResult getVisit(){
        String visitPreFix = preFix + UserLocalThread.getThreadLocal();
        List<Object> objectList = redisTemplate.opsForList().range(visitPreFix, 0, -1);

        if (objectList.isEmpty()){
            List<ArticleVisit> articleVisits = visitMapper.queryVisit(UserLocalThread.getThreadLocal());
            redisTemplate.opsForList().leftPush(visitPreFix,articleVisits);
            return CommonResult.success(articleVisits);
        }
        return CommonResult.success(objectList);

    }


}

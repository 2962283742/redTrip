package cn.redTrip.common;

import cn.redTrip.entity.dto.ArticleVisit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.time.LocalDateTime;

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



    public void setVisit(ArticleVisit articleVisit){
        

    }


}

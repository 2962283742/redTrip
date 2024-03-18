package cn.redTrip.service.impl;

import cn.redTrip.common.RedisCacheForVisit;
import cn.redTrip.common.UserLocalThread;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.EnumObject;
import cn.redTrip.entity.dto.ArticleVisit;
import cn.redTrip.entity.dto.CommonArticleVo;
import cn.redTrip.service.VisitService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.CommonArticle;
import cn.redTrip.service.CommonArticleService;
import cn.redTrip.mapper.CommonArticleMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
* @author 29622
* @description 针对表【common_article】的数据库操作Service实现
* @createDate 2024-02-05 18:47:55
*/
@Service
@Transactional
public class CommonArticleServiceImpl extends ServiceImpl<CommonArticleMapper, CommonArticle>
    implements CommonArticleService{

    @Resource
    private CommonArticleMapper commonArticleMapper;


    @Value("${hotArticle.expireTime}")
    private Long expireTime;


    @Value("${hotArticle.preFix}")
    private String preFix;


    @Value("${hotArticle.RandomMin}")
    private Long min;

    @Value("${hotArticle.RandomMax}")
    private Long max;
    @Resource
    private RedisTemplate<String, CommonArticle> redisTemplate;

    @Resource
    private CommonArticleService commonArticleService;

    @Resource
    private VisitService visitService;



    @Override
    public CommonResult queryDetail(Integer id){

        CommonArticle commonArticle = (CommonArticle)this.redisTemplate.opsForValue().get(this.preFix + id);
        if (ObjectUtils.isEmpty(commonArticle)) {
            commonArticle = (CommonArticle)this.commonArticleService.getById(id);
            this.redisTemplate.opsForValue().set(this.preFix + id, commonArticle, this.expireTime, TimeUnit.SECONDS);
        }

        return CommonResult.success(commonArticle);


    }

    @Override
    public CommonResult queryList(Integer type,Integer page,Integer size) {

        Integer offset = (page - 1) * size;

        List<CommonArticle> commonArticles = commonArticleMapper.queryList(UserLocalThread.getThreadLocal(), 0, size, offset);


        ArrayList<CommonArticleVo> commonArticleVos = new ArrayList<>();
        for (CommonArticle a:commonArticles
             ) {
            CommonArticleVo commonArticleVo = new CommonArticleVo();
            BeanUtils.copyProperties(a,commonArticleVo);
            commonArticleVos.add(commonArticleVo);

        }

        return CommonResult.success(commonArticleVos);


    }

    @Override
    public CommonResult searchArticle(String keyword) {

        LambdaQueryWrapper<CommonArticle> commonArticleLambdaQueryWrapper = new LambdaQueryWrapper<>();
        commonArticleLambdaQueryWrapper.like(CommonArticle::getContent,keyword);
        List<CommonArticle> list = commonArticleService.list(commonArticleLambdaQueryWrapper);
        return CommonResult.success(list);
    }
}





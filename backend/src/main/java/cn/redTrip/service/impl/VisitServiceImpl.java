package cn.redTrip.service.impl;

import cn.redTrip.common.RedisCacheForVisit;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.Visit;
import cn.redTrip.entity.dto.ArticleVisit;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.service.VisitService;
import cn.redTrip.mapper.VisitMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 29622
* @description 针对表【visit】的数据库操作Service实现
* @createDate 2024-02-17 22:33:45
*/
@Service
public class VisitServiceImpl extends ServiceImpl<VisitMapper, Visit>
    implements VisitService{

    @Resource
    private VisitService visitService;

    @Resource
    private VisitMapper visitMapper;

    @Resource
    private RedisCacheForVisit redisCacheForVisit;

    @Override
    public CommonResult queryVisit() {

        return CommonResult.success(redisCacheForVisit.getVisit());

    }

    @Override
    public CommonResult addVisit(Integer articleId) {
        ArticleVisit articleVisit = visitMapper.queryAllByArticleIdArticleVisit(articleId);
        redisCacheForVisit.setVisit(articleVisit);


        return CommonResult.success("保存访问记录成功");
    }


}





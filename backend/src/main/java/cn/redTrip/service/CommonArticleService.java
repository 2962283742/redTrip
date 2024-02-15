package cn.redTrip.service;

import cn.redTrip.entity.CommonArticle;
import cn.redTrip.entity.CommonResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 29622
* @description 针对表【common_article】的数据库操作Service
* @createDate 2024-02-05 18:47:55
*/
public interface CommonArticleService extends IService<CommonArticle> {

    CommonResult queryDetail(Integer id);

    CommonResult queryList(Integer type,Integer page,Integer size);

    CommonResult searchArticle(String keyword);
}

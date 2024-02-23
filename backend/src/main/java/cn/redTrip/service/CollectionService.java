package cn.redTrip.service;

import cn.redTrip.entity.Collection;
import cn.redTrip.entity.CommonResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 29622
* @description 针对表【collection】的数据库操作Service
* @createDate 2024-02-17 20:27:17
*/
public interface CollectionService extends IService<Collection> {

    CommonResult addCollection(Collection collection);

    CommonResult queryCollection();

    CommonResult deleteCollection(Integer articleId);
}

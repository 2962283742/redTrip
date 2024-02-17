package cn.redTrip.service;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.Like;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 29622
* @description 针对表【like】的数据库操作Service
* @createDate 2024-02-17 21:18:53
*/
public interface LikeService extends IService<Like> {

    CommonResult addLike(Integer articleId);

    CommonResult queryLike();

    CommonResult deleteLike(Integer articleId);
}

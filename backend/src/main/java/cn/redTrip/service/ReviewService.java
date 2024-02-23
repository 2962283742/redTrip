package cn.redTrip.service;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.Review;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 29622
* @description 针对表【review】的数据库操作Service
* @createDate 2024-02-19 15:39:30
*/
public interface ReviewService extends IService<Review> {

    CommonResult addReview(Integer articleId, String content);

    CommonResult queryReview(Integer articleId);

    CommonResult starReview(Integer reviewId);
}

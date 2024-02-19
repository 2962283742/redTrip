package cn.redTrip.service.impl;

import cn.redTrip.common.UserLocalThread;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.ReviewUser;
import cn.redTrip.entity.dto.ReviewDto;
import cn.redTrip.entity.dto.ReviewResult;
import cn.redTrip.mapper.ReviewUserMapper;
import cn.redTrip.service.ReviewUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.Review;
import cn.redTrip.service.ReviewService;
import cn.redTrip.mapper.ReviewMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
* @author 29622
* @description 针对表【review】的数据库操作Service实现
* @createDate 2024-02-19 15:39:30
*/
@Service
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review>
    implements ReviewService{


    @Resource
    private ReviewService reviewService;

    @Resource
    private ReviewMapper reviewMapper;

    @Resource
    private ReviewUserMapper reviewUserMapper;

    @Resource
    private ReviewUserService reviewUserService;

    @Transactional(rollbackFor ={Exception.class})
    @Override
    public CommonResult addReview(Integer articleId, String content) {

        Review review = new Review();

        review.setReview(content);
        reviewService.save(review);
        ReviewUser reviewUser = new ReviewUser();
        reviewUser.setArticleId(articleId);
        BeanUtils.copyProperties(review,reviewUser);
        reviewUser.setUserId(UserLocalThread.getThreadLocal());
        reviewUserService.save(reviewUser);
        return CommonResult.success("评论成功");
    }

    @Override
    public CommonResult queryReview(Integer articleId) {
        List<ReviewResult> reviewResults = reviewUserMapper.queryReviewList(articleId, UserLocalThread.getThreadLocal());
        return CommonResult.success(reviewResults);
    }

    @Override
    public CommonResult starReview(Integer reviewId) {
        reviewMapper.starReview(reviewId);
        return CommonResult.success("点赞成功");
    }




}





package cn.redTrip.mapper;

import cn.redTrip.entity.ReviewUser;
import cn.redTrip.entity.dto.ReviewResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 29622
* @description 针对表【review_user】的数据库操作Mapper
* @createDate 2024-02-19 15:40:35
* @Entity cn.redTrip.entity.ReviewUser
*/
public interface ReviewUserMapper extends BaseMapper<ReviewUser> {
    
    
    @Select("SELECT `user`.avatar, `user`.nickname, review_temp.review, review_temp.starCount, review_temp.createTime \n" +
            "FROM `user` \n" +
            "LEFT JOIN (\n" +
            "    SELECT review.reviewId, review.review, review.starCount, review.createTime, review_user.userId \n" +
            "    FROM review \n" +
            "    LEFT JOIN review_user ON review.reviewId = review_user.reviewId WHERE review_user.userId=#{userId} and review_user.articleId = #{articleId}\n" +
            ") AS review_temp ON review_temp.userId = `user`.userId;")
    public List<ReviewResult> queryReviewList(Integer articleId,Integer userId);

    

}





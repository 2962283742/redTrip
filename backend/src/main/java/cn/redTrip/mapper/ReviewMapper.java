package cn.redTrip.mapper;

import cn.redTrip.entity.Review;
import cn.redTrip.entity.dto.ReviewDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
* @author 29622
* @description 针对表【review】的数据库操作Mapper
* @createDate 2024-02-19 15:39:30
* @Entity cn.redTrip.entity.Review
*/
@Mapper
public interface ReviewMapper extends BaseMapper<Review> {


    @Update("update review set starCount = starCount+1 where reviewId = #{reviewId}")
    void starReview(Integer reviewId);
}





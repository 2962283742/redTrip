package cn.redTrip.mapper;

import cn.redTrip.entity.CommonArticle;
import cn.redTrip.entity.Like;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author 29622
* @description 针对表【like】的数据库操作Mapper
* @createDate 2024-02-17 21:18:53
* @Entity cn.redTrip.entity.Like
*/
@Mapper
public interface LikeMapper extends BaseMapper<Like> {
    @Insert("INSERT INTO `like`  ( articleId, userId, createTime )  VALUES  ( #{articleId}, #{userId}, #{createTime})")
    public void addLike(Integer articleId, Integer userId, LocalDateTime createTime);


    @Select("SELECT * FROM common_article WHERE common_article.articleId IN (SELECT `like`.articleId from `like` WHERE `like`.userId=#{userId})")
    public List<CommonArticle> queryLike(Integer userId);

    @Delete("delete from `like` where articleId = #{articleId} and userId = #{userId}")
    public void deleteLike(Integer userId,Integer articleId);

}





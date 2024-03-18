package cn.redTrip.mapper;

import cn.redTrip.entity.CommonArticle;
import cn.redTrip.entity.dto.CommonArticleVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @author 29622
* @description 针对表【common_article】的数据库操作Mapper
* @createDate 2024-02-05 18:47:55
* @Entity cn.redTrip.entity.CommonArticle
*/
@Mapper
public interface CommonArticleMapper extends BaseMapper<CommonArticle> {

    /**
    * 查询文章
    * **/


    @Select("SELECT \n" +
            "    CASE WHEN EXISTS(SELECT 1 FROM `like` WHERE userId=#{userId} AND articleId = #{articleId}) THEN TRUE ELSE FALSE END as likeStatus,\n" +
            "    CASE WHEN EXISTS(SELECT 1 FROM collection WHERE userId=#{userId} AND articleId = #{articleId}) THEN TRUE ELSE FALSE END as collectionStatus,\n" +
            "    CASE WHEN EXISTS(SELECT 1 FROM article_star WHERE userId=#{userId} AND articleId = #{articleId}) THEN TRUE ELSE FALSE END as starStatus;")
    public CommonArticleVo queryUserAndArticle(Integer userId,Integer articleId);

    @Update("update common_article set `view` = `view` + 1,`hot` = `hot`+1 where articleId = #{id}")
    public void updateArticleHotAndView(Integer id);


    @Select("SELECT common_article.*,   \n" +
            "       CASE WHEN article_star.articleId IS NOT NULL THEN true ELSE FALSE END AS star_status,\n" +
            "\t\t\t CASE WHEN `like`.articleId IS not NULL THEN true ELSE FALSE END as like_status,\n" +
            "\t\t\t CASE WHEN collection.articleId is not NULL THEN true ELSE FALSE END as collection_status\n" +
            "FROM common_article\n" +
            "LEFT JOIN (SELECT * from article_star where userId = #{userId}) as article_star ON common_article.articleId = article_star.articleId\n" +
            "left JOIN (SELECT * FROM `like` where userId = #{userId}) as `like` ON common_article.articleId = `like`.articleId\n" +
            "left JOIN (SELECT * FROM collection where userId = #{userId}) as collection ON common_article.articleId = `collection`.articleId\n" +
            "where `type` = #{commonType}\n" +
            "LIMIT #{offset}, #{size}")
    public List<CommonArticle> queryList(Integer userId,Integer commonType,Integer size,Integer offset);



}





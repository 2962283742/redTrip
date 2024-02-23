package cn.redTrip.mapper;

import cn.redTrip.entity.Visit;
import cn.redTrip.entity.dto.ArticleVisit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author 29622
* @description 针对表【visit】的数据库操作Mapper
* @createDate 2024-02-17 22:33:45
* @Entity cn.redTrip.entity.Visit
*/
@Mapper
public interface VisitMapper extends BaseMapper<Visit> {



    @Select("SELECT common_article.articleId,common_article.avatar,common_article.title from common_article WHERE articleId IN (SELECT visit.articleId from visit where visit.userId = #{userId} ORDER BY createTime) limit 0,10")
    public List<ArticleVisit> queryVisit(Integer userId);

    @Select("SELECT common_article.articleId,common_article.avatar,common_article.title from common_article WHERE articleId = #{articleId}")
    public ArticleVisit queryAllByArticleIdArticleVisit(Integer articleId);


    @Insert("insert into visit (articleId,userId,createTime) values (#{articleId},#{userId},#{createTime})")
    public void addVisit(Integer articleId, Integer userId, LocalDateTime createTime);


}





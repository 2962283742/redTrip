package cn.redTrip.mapper;

import cn.redTrip.entity.Collection;
import cn.redTrip.entity.CommonArticle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 29622
* @description 针对表【collection】的数据库操作Mapper
* @createDate 2024-02-17 20:27:17
* @Entity cn.redTrip.entity.Collection
*/
@Mapper
public interface CollectionMapper extends BaseMapper<Collection> {

    @Select("SELECT * FROM common_article WHERE common_article.articleId IN (SELECT collection.articleId from collection WHERE collection.userId=#{userId})")
    public List<CommonArticle> queryColletction(Integer userId);


    public void deleteCollection(Integer userId,Integer articleId);

}





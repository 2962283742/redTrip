package cn.redTrip.mapper;

import cn.redTrip.entity.CommonArticle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    @Select("select * from common_article where articleId = #{id}")
    public CommonArticle queryDetail(Integer id);

    @Update("update common_article set `view` = `view` + 1,`hot` = `hot`+1 where articleId = #{id}")
    public void updateArticleHotAndView(Integer id);



}





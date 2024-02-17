package cn.redTrip.mapper;

import cn.redTrip.entity.Visit;
import cn.redTrip.entity.dto.ArticleVisit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author 29622
* @description 针对表【visit】的数据库操作Mapper
* @createDate 2024-02-17 22:33:45
* @Entity cn.redTrip.entity.Visit
*/
@Mapper
public interface VisitMapper extends BaseMapper<Visit> {
    @Select("select articleId,title,avatar from common_article where articleId= #{articleId}")
    public ArticleVisit selectById(Integer articleId);
}





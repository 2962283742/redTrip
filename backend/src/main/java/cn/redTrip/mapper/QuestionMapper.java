package cn.redTrip.mapper;

import cn.redTrip.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 29622
* @description 针对表【question】的数据库操作Mapper
* @createDate 2024-02-04 20:23:44
* @Entity cn.redTrip.entity.Question
*/
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {

}





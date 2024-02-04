package cn.redTrip.mapper;

import cn.redTrip.entity.UserQuestion;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 29622
* @description 针对表【user_question】的数据库操作Mapper
* @createDate 2024-02-04 22:01:23
* @Entity cn.redTrip.entity.UserQuestion
*/
@Mapper
public interface UserQuestionMapper extends BaseMapper<UserQuestion> {


    /**
     * 删除答题记录接口
     *
     * **/
    @Delete("delete from user_question where id=#{id}")
    public void deleteRecord(Integer id);

}





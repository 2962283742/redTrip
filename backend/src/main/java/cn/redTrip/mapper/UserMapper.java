package cn.redTrip.mapper;

import cn.redTrip.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
* @author 29622
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-02-02 16:12:39
* @Entity cn.redTrip.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Update("update user set avatar = #{avatar},nickname = #{nickname},sex = #{sex}, brithday = #{brithday} where userId = #{userId}")
    public void updateUserInfo(User user);

}





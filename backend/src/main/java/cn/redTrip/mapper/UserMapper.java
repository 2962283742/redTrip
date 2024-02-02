package cn.redTrip.mapper;

import cn.redTrip.entity.User;
import cn.redTrip.entity.dto.UserRegister;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;

/**
* @author 29622
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-02-02 16:12:39
* @Entity cn.redTrip.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {



}





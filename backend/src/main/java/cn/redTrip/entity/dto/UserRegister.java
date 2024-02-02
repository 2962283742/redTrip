package cn.redTrip.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author dzl
 * @date 2024/2/2 17:06
 */
@TableName(value ="user")
@Data
public class UserRegister {
    @TableField(value = "number")
    private String number;

    /**
     *
     */
    @TableField(value = "password")
    private String password;


}

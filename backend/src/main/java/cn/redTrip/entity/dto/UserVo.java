package cn.redTrip.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author dzl
 * @date 2024/2/2 17:06
 */

@Data
public class UserVo implements Serializable {

    private String number;
    private String avatar;
    private String nickname;
    private Integer sex;
    private Date brithday;

}

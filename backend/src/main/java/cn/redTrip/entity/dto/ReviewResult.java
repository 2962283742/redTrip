package cn.redTrip.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

/**
 * @author dzl
 * @date 2024/2/19 16:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResult {
    @TableField(exist = false)
    private Integer reviewId;
    @TableField(exist = false)
    private Integer starCount;
    @TableField(exist = false)
    private String avatar;
    @TableField(exist = false)
    private LocalDateTime createTime;
    @TableField(exist = false)
    private String nickname;
    @TableField(exist = false)
    private String review;

}

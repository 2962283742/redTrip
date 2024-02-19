package cn.redTrip.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author dzl
 * @date 2024/2/19 15:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

    @TableField(exist = false)
    private String review;

    @TableField(exist = false)
    private LocalDateTime createTime;


    @TableField(exist = false)
    private Integer userId;

    @TableField(exist = false)
    private Integer articleId;


}

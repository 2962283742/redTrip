package cn.redTrip.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dzl
 * @date 2024/2/17 22:29
 */
@Data
public class ArticleVisit implements Serializable {

    @TableField(exist = false)
    private Integer articleId;

    @TableField(exist = false)
    private String title;

    @TableField(exist = false)
    private String avatar;
}

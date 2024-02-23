package cn.redTrip.entity.dto;

import lombok.Data;

/**
 * @author dzl
 * @date 2024/2/5 19:26
 */
@Data
public class CommonArticleVo {
    private Integer articleId;
    private String title;
    private String avatar;
    private Integer star;
    private Integer hot;
    private Integer view;
    private boolean starStatus;

    private boolean likeStatus;

    private boolean collectionStatus;


}

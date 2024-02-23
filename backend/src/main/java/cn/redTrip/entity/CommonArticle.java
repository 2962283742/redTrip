package cn.redTrip.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Arrays;
import lombok.Data;

/**
 * 
 * @TableName common_article
 */
@TableName(value ="common_article")
@Data
public class CommonArticle implements Serializable {
    /**
     * 
     */
    @TableId(value = "articleId", type = IdType.AUTO)
    private Integer articleId;

    /**
     * 
     */
    @TableField(value = "content")
    private String content;

    /**
     * 
     */
    @TableField(value = "title")
    private String title;

    /**
     * 
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 
     */
    @TableField(value = "star")
    private Integer star;

    /**
     * 
     */
    @TableField(value = "articleType")
    private Integer articleType;

    /**
     * 
     */
    @TableField(value = "`type`")
    private Integer type;

    /**
     * 热度
     */
    @TableField(value = "hot")
    private Integer hot;

    /**
     * 浏览
     */
    @TableField(value = "view")
    private Integer view;

    /**
     * 军记史书
     */
    @TableField(value = "historyBook")
    private byte[] historyBook;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableField(exist = false)
    private boolean starStatus;
    @TableField(exist = false)
    private boolean likeStatus;
    @TableField(exist = false)
    private boolean collectionStatus;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommonArticle other = (CommonArticle) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getStar() == null ? other.getStar() == null : this.getStar().equals(other.getStar()))
            && (this.getArticleType() == null ? other.getArticleType() == null : this.getArticleType().equals(other.getArticleType()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getHot() == null ? other.getHot() == null : this.getHot().equals(other.getHot()))
            && (this.getView() == null ? other.getView() == null : this.getView().equals(other.getView()))
            && (Arrays.equals(this.getHistoryBook(), other.getHistoryBook()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getStar() == null) ? 0 : getStar().hashCode());
        result = prime * result + ((getArticleType() == null) ? 0 : getArticleType().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getHot() == null) ? 0 : getHot().hashCode());
        result = prime * result + ((getView() == null) ? 0 : getView().hashCode());
        result = prime * result + (Arrays.hashCode(getHistoryBook()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", content=").append(content);
        sb.append(", title=").append(title);
        sb.append(", avatar=").append(avatar);
        sb.append(", star=").append(star);
        sb.append(", articleType=").append(articleType);
        sb.append(", type=").append(type);
        sb.append(", hot=").append(hot);
        sb.append(", view=").append(view);
        sb.append(", historyBook=").append(historyBook);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
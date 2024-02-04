package cn.redTrip.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName question
 */
@TableName(value ="question")
@Data
public class Question implements Serializable {
    /**
     * 
     */
    @TableId(value = "questionId", type = IdType.AUTO)
    private Integer questionId;

    /**
     * 
     */
    @TableField(value = "statement")
    private String statement;

    /**
     * 
     */
    @TableField(value = "optionA")
    private String optionA;

    /**
     * 
     */
    @TableField(value = "optionB")
    private String optionB;

    /**
     * 
     */
    @TableField(value = "optionC")
    private String optionC;

    /**
     * 
     */
    @TableField(value = "optionD")
    private String optionD;

    /**
     * 
     */
    @TableField(value = "belong")
    private Integer belong;

    /**
     * 
     */
    @TableField(value = "statementType")
    private Integer statementType;

    /**
     * 
     */
    @TableField(value = "`right`")
    private String right;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        Question other = (Question) that;
        return (this.getQuestionId() == null ? other.getQuestionId() == null : this.getQuestionId().equals(other.getQuestionId()))
            && (this.getStatement() == null ? other.getStatement() == null : this.getStatement().equals(other.getStatement()))
            && (this.getOptionA() == null ? other.getOptionA() == null : this.getOptionA().equals(other.getOptionA()))
            && (this.getOptionB() == null ? other.getOptionB() == null : this.getOptionB().equals(other.getOptionB()))
            && (this.getOptionC() == null ? other.getOptionC() == null : this.getOptionC().equals(other.getOptionC()))
            && (this.getOptionD() == null ? other.getOptionD() == null : this.getOptionD().equals(other.getOptionD()))
            && (this.getBelong() == null ? other.getBelong() == null : this.getBelong().equals(other.getBelong()))
            && (this.getStatementType() == null ? other.getStatementType() == null : this.getStatementType().equals(other.getStatementType()))
            && (this.getRight() == null ? other.getRight() == null : this.getRight().equals(other.getRight()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getStatement() == null) ? 0 : getStatement().hashCode());
        result = prime * result + ((getOptionA() == null) ? 0 : getOptionA().hashCode());
        result = prime * result + ((getOptionB() == null) ? 0 : getOptionB().hashCode());
        result = prime * result + ((getOptionC() == null) ? 0 : getOptionC().hashCode());
        result = prime * result + ((getOptionD() == null) ? 0 : getOptionD().hashCode());
        result = prime * result + ((getBelong() == null) ? 0 : getBelong().hashCode());
        result = prime * result + ((getStatementType() == null) ? 0 : getStatementType().hashCode());
        result = prime * result + ((getRight() == null) ? 0 : getRight().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", statement=").append(statement);
        sb.append(", optionA=").append(optionA);
        sb.append(", optionB=").append(optionB);
        sb.append(", optionC=").append(optionC);
        sb.append(", optionD=").append(optionD);
        sb.append(", belong=").append(belong);
        sb.append(", statementType=").append(statementType);
        sb.append(", right=").append(right);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
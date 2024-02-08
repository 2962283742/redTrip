package cn.redTrip.entity.dto;

import lombok.Data;

/**
 * @author dzl
 * @date 2024/2/4 21:25
 */
@Data
public class QuestionVo {
    private Integer questionId;
    private String statement;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

}

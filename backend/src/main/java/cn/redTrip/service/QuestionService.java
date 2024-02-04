package cn.redTrip.service;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.Question;
import cn.redTrip.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author 29622
* @description 针对表【question】的数据库操作Service
* @createDate 2024-02-04 20:23:44
*/

public interface QuestionService extends IService<Question> {

    CommonResult getQuestions(Integer type);

    CommonResult justiceOption(Integer questionId,String option);

    CommonResult generateRecord(Integer type);

    CommonResult queryRecord();



    CommonResult deleteRecord(Integer id);
}

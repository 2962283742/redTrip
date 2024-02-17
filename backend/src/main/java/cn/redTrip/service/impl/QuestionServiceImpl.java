package cn.redTrip.service.impl;

import cn.redTrip.common.UserLocalThread;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.User;
import cn.redTrip.entity.UserQuestion;
import cn.redTrip.entity.dto.QuestionVo;
import cn.redTrip.mapper.UserQuestionMapper;
import cn.redTrip.service.UserQuestionService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.Question;
import cn.redTrip.service.QuestionService;
import cn.redTrip.mapper.QuestionMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
* @author 29622
* @description 针对表【question】的数据库操作Service实现
* @createDate 2024-02-04 20:23:44
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionMapper questionMapper;


    @Resource
    private UserQuestionService userQuestionService;


    @Resource
    private UserQuestionMapper userQuestionMapper;



    @Override
    public CommonResult getQuestions(Integer type) {
        LambdaQueryWrapper<Question> questionLambdaQueryWrapper = new LambdaQueryWrapper<>();
        questionLambdaQueryWrapper
                .eq(Question::getBelong,type);
        Page<Question> questionPage = new Page<>(1,5);
        questionMapper.selectPage(questionPage,questionLambdaQueryWrapper);
        ArrayList<QuestionVo> questionVos = new ArrayList<>();
        for (Question q:questionPage.getRecords()
             ) {
            QuestionVo questionVo = new QuestionVo();
            BeanUtils.copyProperties(q,questionVo);
            questionVos.add(questionVo);

        }


        return CommonResult.success(questionVos);

    }

    @Override
    public CommonResult justiceOption(Integer questionId,String option) {
        LambdaQueryWrapper<Question> questionLambdaQueryWrapper = new LambdaQueryWrapper<>();
        questionLambdaQueryWrapper.eq(Question::getQuestionId,questionId);
        Question one = questionService.getOne(questionLambdaQueryWrapper);
        if (one.getRight()==option){
            return CommonResult.success(true);
        }else{
            return CommonResult.success(false);
        }



    }

    @Override
    public CommonResult generateRecord(Integer type) {
        UserQuestion userQuestion = new UserQuestion();
        userQuestion.setQuestionType(type);
//        userQuestion.setCreateTime(LocalDateTime.now().withSecond(0).withNano(0));
        userQuestion.setUserId(UserLocalThread.getThreadLocal());
        userQuestionService.save(userQuestion);
        return CommonResult.success("答题结束");


    }

    @Override
    public CommonResult queryRecord() {


        LambdaQueryWrapper<UserQuestion> userQuestionLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userQuestionLambdaQueryWrapper.eq(UserQuestion::getUserId,UserLocalThread.getThreadLocal());

        return CommonResult.success(userQuestionService.list(userQuestionLambdaQueryWrapper));
    }


    @Override
    public CommonResult deleteRecord(Integer id) {
        userQuestionMapper.deleteRecord(id);
        return CommonResult.success("删除成功");
    }
}





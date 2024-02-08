package cn.redTrip.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.UserQuestion;
import cn.redTrip.service.UserQuestionService;
import cn.redTrip.mapper.UserQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author 29622
* @description 针对表【user_question】的数据库操作Service实现
* @createDate 2024-02-04 22:01:23
*/
@Service
public class UserQuestionServiceImpl extends ServiceImpl<UserQuestionMapper, UserQuestion>
    implements UserQuestionService{

}





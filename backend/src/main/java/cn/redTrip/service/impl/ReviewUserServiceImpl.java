package cn.redTrip.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.ReviewUser;
import cn.redTrip.service.ReviewUserService;
import cn.redTrip.mapper.ReviewUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 29622
* @description 针对表【review_user】的数据库操作Service实现
* @createDate 2024-02-19 15:40:35
*/
@Service
public class ReviewUserServiceImpl extends ServiceImpl<ReviewUserMapper, ReviewUser>
    implements ReviewUserService{

}





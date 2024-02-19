package cn.redTrip.service;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.Visit;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 29622
* @description 针对表【visit】的数据库操作Service
* @createDate 2024-02-17 22:33:45
*/
public interface VisitService extends IService<Visit> {

    CommonResult queryVisit();

    CommonResult addVisit(Integer articleId);
}

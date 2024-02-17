package cn.redTrip.service.impl;

import cn.redTrip.common.UserLocalThread;
import cn.redTrip.entity.CommonArticle;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.exceptions.LikeException;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.Like;
import cn.redTrip.service.LikeService;
import cn.redTrip.mapper.LikeMapper;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
* @author 29622
* @description 针对表【like】的数据库操作Service实现
* @createDate 2024-02-17 21:18:53
*/
@Service
public class LikeServiceImpl extends ServiceImpl<LikeMapper, Like>
    implements LikeService{


    @Resource
    private LikeService likeService;

    @Resource
    private LikeMapper likeMapper;

    @Override
    public CommonResult addLike(Integer articleId) {
       try {
           likeMapper.addLike(articleId,UserLocalThread.getThreadLocal(),LocalDateTime.now().withSecond(0).withNano(0));
       }catch (DataIntegrityViolationException dataIntegrityViolationException){
           throw new LikeException("已经收藏过了");
       }
        return CommonResult.success("操作成功");
    }

    @Override
    public CommonResult queryLike() {
        List<CommonArticle> commonArticles = likeMapper.queryLike(UserLocalThread.getThreadLocal());
        return CommonResult.success(commonArticles);
    }

    @Override
    public CommonResult deleteLike(Integer articleId) {
        likeMapper.deleteLike(UserLocalThread.getThreadLocal(),articleId);
        return CommonResult.success("操作成功");
    }
}





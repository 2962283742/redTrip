package cn.redTrip.service.impl;

import cn.redTrip.common.UserLocalThread;
import cn.redTrip.entity.CommonArticle;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.exceptions.CollectionException;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.Collection;
import cn.redTrip.service.CollectionService;
import cn.redTrip.mapper.CollectionMapper;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 29622
* @description 针对表【collection】的数据库操作Service实现
* @createDate 2024-02-17 20:27:17
*/
@Service
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection>
    implements CollectionService{

    @Resource
    private CollectionService collectionService;


    @Resource
    private CollectionMapper collectionMapper;
    @Override
    public CommonResult addCollection(Collection collection) {
        try{
            collection.setUserId(UserLocalThread.getThreadLocal());
            collectionService.save(collection);
            return CommonResult.success("收藏成功");
        }catch (DataIntegrityViolationException dataIntegrityViolationException){
            throw new CollectionException("重复收藏");
        }
    }

    @Override
    public CommonResult queryCollection() {
        List<CommonArticle> commonArticles = collectionMapper.queryColletction(UserLocalThread.getThreadLocal());
        return CommonResult.success(commonArticles);

    }

    @Override
    public CommonResult deleteCollection(Integer articleId) {
        collectionMapper.deleteCollection(UserLocalThread.getThreadLocal(),articleId);
        return CommonResult.success("操作成功");
    }
}





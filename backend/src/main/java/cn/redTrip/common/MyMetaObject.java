package cn.redTrip.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

/**
 * @author dzl
 * @date 2024/2/17 20:37
 */
@Configuration
public class MyMetaObject implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("createTime",LocalDateTime.now().withSecond(0).withNano(0));
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}

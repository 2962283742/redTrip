package cn.redTrip.exceptionHandler;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.EnumObject;
import cn.redTrip.exception.NullException;
import cn.redTrip.exception.WithoutTokenException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author dzl
 * @date 2024/2/3 23:45
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(NumberFormatException.class)
    public CommonResult withoutTokenExceptionHandler(NumberFormatException numberFormatException){
        return CommonResult.fail("用户未登录", EnumObject.USER_NOT_LOGIN);
    }

    @ExceptionHandler(NullException.class)
    public CommonResult nullException(NullException nullException){
        return CommonResult.fail("用户注册失败", EnumObject.REGISTER_FAIL);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public CommonResult sqlIntegrityConstraintViolationException(DataIntegrityViolationException dataIntegrityViolationException){
        return CommonResult.fail("手机号重复注册",EnumObject.NUMBER_ERROR);
    }



}

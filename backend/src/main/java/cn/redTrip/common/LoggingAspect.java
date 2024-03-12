package cn.redTrip.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author dzl
 * @date 2024/3/6 14:36
 */

@Aspect
@Component
public class LoggingAspect {
    public static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


    @Resource
    private AopLogging aopLogging;

    @Before("execution(* cn.redTrip.service..*.*(..))")
    public void LoggingBefore(JoinPoint joinPoint) throws IOException {
        aopLogging.write("调用了"+joinPoint.getSignature().getName());


    }

    @AfterReturning(value = "execution(* cn.redTrip.service..*.*(..))",returning = "returnValue")
    public void LoggingAfter(JoinPoint joinPoint,Object returnValue) throws IOException {
        aopLogging.write("执行完了"+joinPoint.getSignature().getName()+"返回值为"+returnValue);
    }

    @AfterThrowing(throwing = "throwable",pointcut = "execution(* cn.redTrip.*..*.*(..))")
    public void LoggingThrow(JoinPoint joinPoint,Throwable throwable) throws IOException {
        aopLogging.write("执行"+ joinPoint.getSignature().getName()+"时，抛出异常"+throwable.toString());

    }





}

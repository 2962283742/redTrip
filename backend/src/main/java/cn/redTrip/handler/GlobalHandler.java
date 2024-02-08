package cn.redTrip.handler;

import cn.dev33.satoken.stp.StpUtil;
import cn.redTrip.common.UserLocalThread;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author dzl
 * @date 2024/2/2 16:08
 */
@Component
@Order(1)
public class GlobalHandler implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(request.getMethod().equals(HttpMethod.OPTIONS.name())){
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        try{
            String token = request.getHeader("Token");
            Object loginId = StpUtil.getLoginIdByToken(token);
            UserLocalThread.setThreadLocal(loginId);
        }catch (NumberFormatException numberFormatException){
            throw new NumberFormatException();
        }


        return true;
    }
}
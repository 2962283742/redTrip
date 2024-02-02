package cn.redTrip.config;

import cn.redTrip.handler.GlobalHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author dzl
 * @date 2024/2/2 16:07
 */
@Configuration
@Order(1)
public class CorsConfig implements WebMvcConfigurer {

    @Resource
    GlobalHandler globalHandler;
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 覆盖所有请求
        registry.addMapping("/**")

                // 允许发送 Cookie
                .allowCredentials(true)
                // 放行哪些域名（必须用 patterns，否则 * 会和 allowCredentials 冲突）
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .exposedHeaders("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        ArrayList<String> urls = new ArrayList<>(
                Arrays.asList(
                        "/user/login",
                        "/user/register"

                )
        );


        registry.addInterceptor(globalHandler)
                .addPathPatterns("/**")
                .excludePathPatterns(urls);
    }
}
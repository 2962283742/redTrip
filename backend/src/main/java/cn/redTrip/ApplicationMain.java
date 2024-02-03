package cn.redTrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author dzl
 * @date 2024/1/26 19:41
 */
@SpringBootApplication
@EnableCaching
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class,args);
    }
}

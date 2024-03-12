package cn.redTrip;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import sun.awt.AppContext;

/**
 * @author dzl
 * @date 2024/1/26 19:41
 */
@SpringBootApplication
@EnableCaching
public class ApplicationMain {
    public static void main(String[] args) {

//        ConfigurableApplicationContext run = SpringApplication.run(ApplicationMain.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String s:beanDefinitionNames
//             ) {
//            System.out.println(s);
//        }

        SpringApplication.run(ApplicationMain.class,args);
    }

}

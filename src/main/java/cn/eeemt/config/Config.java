package cn.eeemt.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/30/030 <br/>
 * time: 22:45 <br/>
 * description: 配置类
 */
@EntityScan(basePackages = "cn.eeemt.entity")
@EnableTransactionManagement
@ComponentScan(basePackages = "cn.eeemt.controller")
@Configuration
public class Config {
    // @Bean
    // DispatcherServlet dispatcherServlet () {
    //     DispatcherServlet ds = new DispatcherServlet();
    //     ds.setThrowExceptionIfNoHandlerFound(true);
    //     return ds;
    // }
}

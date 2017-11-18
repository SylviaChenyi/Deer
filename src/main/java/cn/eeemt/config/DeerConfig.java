package cn.eeemt.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.text.SimpleDateFormat;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/30/030 <br/>
 * time: 22:45 <br/>
 * description: 配置类
 */
@EntityScan(basePackages = "cn.eeemt.entity")
@EnableTransactionManagement
@Configuration
@EnableConfigurationProperties
public class DeerConfig {
    // @Bean
    // DispatcherServlet dispatcherServlet () {
    //     DispatcherServlet ds = new DispatcherServlet();
    //     ds.setThrowExceptionIfNoHandlerFound(true);
    //     return ds;
    // }

    @Bean
    @Primary
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
        // ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        ObjectMapper objectMapper = new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule())
                ;
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
        return objectMapper;
    }

}

package cn.eeemt.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/30/030 <br/>
 * time: 22:45 <br/>
 * description: 配置类
 */
@EntityScan(basePackages = "cn.eeemt.entity")
@EnableTransactionManagement
@Configuration
@EnableConfigurationProperties(DeerProperties.class)
public class DeerConfig {
    private static final DateTimeFormatter BASIC_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter BASIC_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    // @Bean
    // DispatcherServlet dispatcherServlet () {
    //     DispatcherServlet ds = new DispatcherServlet();
    //     ds.setThrowExceptionIfNoHandlerFound(true);
    //     return ds;
    // }

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        // ObjectMapper objectMapper = Jackson2ObjectMapperBuilder.createXmlMapper(false).build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.CHINESE));
        objectMapper.registerModule(new SimpleModule("webApiConverters")
                .addDeserializer(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
                    @Override
                    public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
                        return LocalDateTime.parse(p.getValueAsString(), BASIC_DATE_TIME_FORMATTER);
                    }
                })
                .addDeserializer(LocalDate.class, new JsonDeserializer<LocalDate>() {
                    @Override
                    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
                        return LocalDate.parse(p.getValueAsString(), BASIC_DATE_FORMATTER);
                    }
                })
                .addSerializer(LocalDateTime.class, new JsonSerializer<LocalDateTime>() {
                    @Override
                    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
                        gen.writeString(value.format(BASIC_DATE_TIME_FORMATTER));
                    }
                })
                .addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
                    @Override
                    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
                        gen.writeString(value.format(BASIC_DATE_FORMATTER));
                    }
                })
        );
        return objectMapper;
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplateBuilder templateBuilder = new RestTemplateBuilder();
        return templateBuilder.build();
    }

}

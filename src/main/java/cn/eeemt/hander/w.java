// package cn.eeemt.hander;
//
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.SerializationFeature;
// import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
// import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
// import org.springframework.stereotype.Service;
//
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
//
// /**
//  * author: HuangXiquan <br/>
//  * date: 2017/11/12/012 <br/>
//  * time: 19:34 <br/>
//  * description:
//  */
// @Service
// @Provider
// public class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {
//     private final ObjectMapper mapper;
//
//     public ObjectMapperContextResolver() {
//         mapper = new ObjectMapper();
//         JavaTimeModule javaTimeModule=new JavaTimeModule();
//         // Hack time module to allow 'Z' at the end of string (i.e. javascript json's)
//         javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateTimeFormatter.ISO_DATE_TIME));
//         mapper.registerModule(javaTimeModule);
//         mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//     }
//
//     @Override
//     public ObjectMapper getContext(Class<?> type) {
//         return mapper;
//     }
// }
package deer.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/30/030 <br/>
 * time: 22:45 <br/>
 * description: 配置类
 */
@EntityScan(basePackages = "deer/dao")
@EnableTransactionManagement
// @ComponentScan(basePackages = "deer")
@Configuration
public class Config {
}

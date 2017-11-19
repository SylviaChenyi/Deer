package cn.eeemt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/09/009 <br/>
 * time: 22:04 <br/>
 * description:
 */
@ConfigurationProperties(prefix = "configs")
public class DeerProperties {
    private String test;
}

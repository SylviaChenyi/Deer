package cn.eeemt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/30/030 <br/>
 * time: 22:53 <br/>
 * description:
 */
@RestController
@RequestMapping("/")
// @EnableConfigurationProperties(DeerProperties.class)
public class Hello {

    @Value("${deer.test}")
    private String aa;

    @GetMapping
    public String hello(HttpServletRequest request) {
        return "hello";
    }

    @PostConstruct
    public void test(){
        System.out.println(aa);
    }
}

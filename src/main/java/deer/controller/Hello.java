package deer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/30/030 <br/>
 * time: 22:53 <br/>
 * description:
 */
@RestController
@RequestMapping("/")
public class Hello {

    @GetMapping
    public String hello() {
        return "hello";
    }
}

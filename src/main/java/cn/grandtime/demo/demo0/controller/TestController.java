package cn.grandtime.demo.demo0.controller;

import cn.grandtime.demo.demo0.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试
 *
 * @author 赖伟佳
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public List hello() {
        log.info("请求了接口/hello");

        return testService.hello();

    }

    @GetMapping("/error")
    public String error() {
        log.info("请求了接口/error");

        String str = null;
        try {
            log.info(String.valueOf(str.charAt(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return str;

    }
}

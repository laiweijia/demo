package cn.grandtime.demo.demo0.controller;

import cn.grandtime.demo.demo0.service.TestService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class TestControllerTest {

    @Autowired
    private TestService testService;

    @Test
    void hello() {
        log.info(JSON.toJSONString(testService.hello()));
    }
}
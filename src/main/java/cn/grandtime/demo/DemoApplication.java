package cn.grandtime.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"cn.grandtime.demo.*.dao"})
@SpringBootApplication
//@EnableDiscoveryClient
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("====================================================================================================================\n" +
                "\n" +
                "                    启动成功，测试地址：http://localhost:8080/test/hello\n" +
                "\n" +
                "====================================================================================================================");
    }

}

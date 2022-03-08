package cn.grandtime.demo.demo0.service;


import cn.grandtime.demo.demo0.entity.TestEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface TestService extends IService<TestEntity> {

    List<TestEntity> hello();
}

package cn.grandtime.demo.demo0.service.impl;

import cn.grandtime.demo.demo0.dao.TestDao;
import cn.grandtime.demo.demo0.entity.TestEntity;
import cn.grandtime.demo.demo0.service.TestService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class TestServiceImpl extends ServiceImpl<TestDao, TestEntity> implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<TestEntity> hello() {

        return list(new LambdaQueryWrapper(TestEntity.class));
        // return testDao.hello();
    }
}

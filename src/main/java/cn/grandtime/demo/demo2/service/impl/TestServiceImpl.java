package cn.grandtime.demo.demo2.service.impl;

import cn.grandtime.demo.demo2.dao.TestDao;
import cn.grandtime.demo.demo2.entity.TestEntity;
import cn.grandtime.demo.demo2.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServiceImpl extends ServiceImpl<TestDao, TestEntity> implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<TestEntity> hello() {
        return testDao.hello();
    }
}

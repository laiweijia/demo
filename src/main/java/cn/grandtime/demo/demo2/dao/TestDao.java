package cn.grandtime.demo.demo2.dao;

import cn.grandtime.demo.demo2.entity.TestEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao extends BaseMapper<TestEntity> {

    List<TestEntity> hello();
}

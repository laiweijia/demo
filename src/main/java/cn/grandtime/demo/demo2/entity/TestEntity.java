package cn.grandtime.demo.demo2.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("test")
public class TestEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
}

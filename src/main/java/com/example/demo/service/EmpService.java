package com.example.demo.service;

import com.example.demo.entity.Emp;
import com.example.demo.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 必须加上 @Service 注解，声明这是一个服务类
public class EmpService {

    @Autowired
    private EmpMapper empMapper; // 注入 EmpMapper

    public List<Emp> list() {
        return empMapper.selectAll();
    }

    // 你可以后续在这里添加 add, update, delete 等方法

    // =====> 在这里添加新方法 <=====
    public int add(Emp emp) {
        return empMapper.insert(emp);
    }

    // =====> 在这里添加“更新”方法 <=====
    public int update(Emp emp) {
        return empMapper.update(emp);
    }

    // =====> 在这里添加“删除”方法 <=====
    public int delete(Integer id) {
        return empMapper.delete(id);
    }
}
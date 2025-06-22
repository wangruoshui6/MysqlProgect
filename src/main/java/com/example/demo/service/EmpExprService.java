package com.example.demo.service;

import com.example.demo.entity.EmpExpr;
import com.example.demo.mapper.EmpExprMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 必须加上 @Service 注解
public class EmpExprService {

    @Autowired
    private EmpExprMapper empExprMapper; // 注入 EmpExprMapper

    public List<EmpExpr> list() {
        return empExprMapper.selectAll();
    }

    // 你可以后续在这里添加 add, update, delete 等方法

    // =====> 在这里添加新方法 <=====
    public int add(EmpExpr empExpr) {
        return empExprMapper.insert(empExpr);
    }

    public int update(EmpExpr empExpr) {
        return empExprMapper.update(empExpr);
    }

    public int delete(Integer id) {
        return empExprMapper.delete(id);
    }
}
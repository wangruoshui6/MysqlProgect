package com.example.demo.service;

import com.example.demo.entity.Dept;
import com.example.demo.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> list() { return deptMapper.selectAll(); }
    public int add(Dept dept) { return deptMapper.insert(dept); }
    public int delete(Integer id) { return deptMapper.delete(id); }
    public int update(Dept dept) { return deptMapper.update(dept); }
}
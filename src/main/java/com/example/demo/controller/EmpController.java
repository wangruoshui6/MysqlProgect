package com.example.demo.controller;

import com.example.demo.entity.Emp;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/emp") // 确保这里的地址是 "/api/emp"
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public List<Emp> list() {
        return empService.list();
    }

    // =====> 在这里添加新方法 <=====
    @PostMapping
    public int add(@RequestBody Emp emp) {
        // 通常创建时间由后端设置，以保证准确性
        emp.setCreateTime(new Date());
        return empService.add(emp);
    }

    // =====> 在这里添加“更新”方法 <=====
    @PutMapping
    public int update(@RequestBody Emp emp) {
        // 更新时间由数据库自动处理
        return empService.update(emp);
    }

    // =====> 在这里添加“删除”方法 <=====
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return empService.delete(id);
    }

    // 省略了 post, put, delete 等方法，你可以后续添加
}
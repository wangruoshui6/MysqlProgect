package com.example.demo.controller;

import com.example.demo.entity.EmpExpr;
import com.example.demo.service.EmpExprService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/emp_expr") // 确保这里的地址是 "/api/emp_expr"
public class EmpExprController {

    @Autowired
    private EmpExprService empExprService;

    @GetMapping
    public List<EmpExpr> list() {
        return empExprService.list();
    }

    // 省略了 post, put, delete 等方法

    // =====> 在这里添加新方法 <=====
    @PostMapping
    public int add(@RequestBody EmpExpr empExpr) {
        empExpr.setCreateTime(new Date());
        return empExprService.add(empExpr);
    }

    @PutMapping
    public int update(@RequestBody EmpExpr empExpr) {
        return empExprService.update(empExpr);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return empExprService.delete(id);
    }
}
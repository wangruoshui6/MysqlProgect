package com.example.demo.controller;

import com.example.demo.entity.Dept;
import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public List<Dept> list() { return deptService.list(); }

    @PostMapping
    public int add(@RequestBody Dept dept) { return deptService.add(dept); }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) { return deptService.delete(id); }

    @PutMapping
    public int update(@RequestBody Dept dept) { return deptService.update(dept); }
}
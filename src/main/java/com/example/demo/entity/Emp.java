package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer gender; // 1:男，2:女
    private String phone;
    private Integer position; // 职位，1:班主任，2:讲师...
    private Integer salary;
    private String image;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") // <--- 在日期字段上添加注解
    private Date hireDate;
    private Integer deptId;
    private Date createTime;
    private Date updateTime;


}
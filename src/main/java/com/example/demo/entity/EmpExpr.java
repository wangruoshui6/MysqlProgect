package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class EmpExpr {
    private Integer id;
    private Integer empId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") // <--- 在日期字段上添加注解
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") // <--- 在日期字段上添加注解
    private Date endDate;
    private String company;
    private String position;
    private String description;
    private Date createTime;
}
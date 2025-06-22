package com.example.demo.mapper;

import com.example.demo.entity.EmpExpr;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 必须加上 @Mapper 注解
public interface EmpExprMapper {

    @Select("SELECT * FROM emp_expr")
    List<EmpExpr> selectAll();

    // 如果需要，你可以在这里添加其他SQL操作

    // =====> 在这里添加新的SQL方法 <=====
    @Insert("INSERT INTO emp_expr(emp_id, start_date, end_date, company, position, description, create_time) " +
            "VALUES(#{empId}, #{startDate}, #{endDate}, #{company}, #{position}, #{description}, #{createTime})")
    int insert(EmpExpr empExpr);

    @Update("UPDATE emp_expr SET " +
            "emp_id = #{empId}, " +
            "start_date = #{startDate}, " +
            "end_date = #{endDate}, " +
            "company = #{company}, " +
            "position = #{position}, " +
            "description = #{description} " +
            "WHERE id = #{id}")
    int update(EmpExpr empExpr);

    @Delete("DELETE FROM emp_expr WHERE id = #{id}")
    int delete(Integer id);
}
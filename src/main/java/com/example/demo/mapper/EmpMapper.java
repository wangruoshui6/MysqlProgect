package com.example.demo.mapper;

import com.example.demo.entity.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 必须加上 @Mapper 注解，让MyBatis扫描到它
public interface EmpMapper {

    @Select("SELECT * FROM emp")
    List<Emp> selectAll();

    // 如果需要，你可以在这里添加 @Insert, @Update, @Delete 等注解来定义其他SQL操作

    // =====> 在这里添加新方法 <=====
    // 注意：SQL语句很长，确保没有拼写错误
    @Insert("INSERT INTO emp(username, name, gender, phone, position, salary, hire_date, dept_id, create_time, password, image) " +
            "VALUES(#{username}, #{name}, #{gender}, #{phone}, #{position}, #{salary}, #{hireDate}, #{deptId}, #{createTime}, #{password}, #{image})")
    int insert(Emp emp);


    // =====> 在这里添加“更新”的SQL <=====
    @Update("UPDATE emp SET " +
            "username = #{username}, " +
            "name = #{name}, " +
            "gender = #{gender}, " +
            "phone = #{phone}, " +
            "position = #{position}, " +
            "salary = #{salary}, " +
            "hire_date = #{hireDate}, " +
            "dept_id = #{deptId}, " +
            "image = #{image} " + // 假设密码不在此更新
            "WHERE id = #{id}")
    int update(Emp emp);

    // =====> 在这里添加“删除”的SQL <=====
    @Delete("DELETE FROM emp WHERE id = #{id}")
    int delete(Integer id);


}

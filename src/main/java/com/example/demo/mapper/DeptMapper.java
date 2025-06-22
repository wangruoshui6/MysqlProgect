package com.example.demo.mapper;

import com.example.demo.entity.Dept;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("SELECT * FROM dept")
    List<Dept> selectAll();

    @Insert("INSERT INTO dept(name) VALUES(#{name})")
    int insert(Dept dept);

    @Delete("DELETE FROM dept WHERE id=#{id}")
    int delete(Integer id);

    @Update("UPDATE dept SET name=#{name} WHERE id=#{id}")
    int update(Dept dept);
}
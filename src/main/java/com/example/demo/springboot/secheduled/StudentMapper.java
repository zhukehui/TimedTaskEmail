package com.example.demo.springboot.secheduled;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author eternity
 * @create 2020-09-06 13:58
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> selectStudentList();
}

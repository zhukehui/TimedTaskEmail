package com.example.demo.springboot.secheduled;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author eternity
 * @create 2020-08-29 14:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    private String name;

    private String birth;

    private String sex;

    private String studentStatus;

    public Boolean isSex(String sex){
        if ("男".equals(sex)){
            return true;
        }
        return false;
    }
}

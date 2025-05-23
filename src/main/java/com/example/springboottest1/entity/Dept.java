package com.example.springboottest1.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Bruce
 * @since 2025-05-23
 */
@Getter
@Setter
//@ToString
@TableName("DEPT")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("deptno")
    private Integer deptno;

    private String dname;

    private String loc;


    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}

package com.example.springboottest1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest1.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Bruce
 * @since 2025-05-23
 */
@Mapper
@Repository
public interface DeptMapper extends BaseMapper<Dept> {

}

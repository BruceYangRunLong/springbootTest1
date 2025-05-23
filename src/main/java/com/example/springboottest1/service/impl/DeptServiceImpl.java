package com.example.springboottest1.service.impl;

import com.example.springboottest1.entity.Dept;
import com.example.springboottest1.mapper.DeptMapper;
import com.example.springboottest1.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Bruce
 * @since 2025-05-23
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}

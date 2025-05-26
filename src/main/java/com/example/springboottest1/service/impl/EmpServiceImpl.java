package com.example.springboottest1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.springboottest1.entity.Emp;
import com.example.springboottest1.mapper.EmpMapper;
import com.example.springboottest1.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Bruce
 * @since 2025-05-23
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

    @Autowired
    EmpMapper empMapper;

    //select * from EMP where job = 'MANAGER'
    public List<Emp> getEmpByJob (String job) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("job", job);
        return empMapper.selectList(queryWrapper);
    }

    //select * from EMP where sal>3000
    public List<Emp> getEmpBySal (double sal) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("sal", sal);
        return empMapper.selectList(queryWrapper);
    }

    //select * from EMP where ename like '%T%'
    public List<Emp> getEmpByEname (String ename) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("ename", ename);
        return empMapper.selectList(queryWrapper);
    }

    //update emp set sal = sal*1.2 where deptno = 10
    public int updateEmpSalByDeptno (int deptno,double alpha) {
        UpdateWrapper<Emp> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("deptno", deptno);
        updateWrapper.setSql("sal = sal * " + alpha);
        return empMapper.update(updateWrapper);
    }

}

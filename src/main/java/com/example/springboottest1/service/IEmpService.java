package com.example.springboottest1.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboottest1.entity.Emp;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Bruce
 * @since 2025-05-23
 */
public interface IEmpService extends IService<Emp> {

    public List<Emp> getEmpByJob (String job) ;
    public List<Emp> getEmpBySal (double sal) ;
    public List<Emp> getEmpByEname (String ename) ;
    public int updateEmpSalByDeptno (int deptno,double alpha) ;
    public IPage<Emp> getAllEmpsByPageCondition(int pageNum, int pageSize) ;


}

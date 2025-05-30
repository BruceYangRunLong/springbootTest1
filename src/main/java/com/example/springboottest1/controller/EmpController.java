package com.example.springboottest1.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboottest1.entity.Emp;
import com.example.springboottest1.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Bruce
 * @since 2025-05-23
 */

@CrossOrigin

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    IEmpService empService;







    @GetMapping("/getEmpBYEmpno")
    public Emp getEmpBYEmpno(int empno) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("empno", empno);
        Emp emp = empService.getOne(queryWrapper);

        return emp;

    }

    @PostMapping("/updateEmpByEmpno")
    public boolean updateEmpByEmpno(@RequestBody Emp emp) {
        System.out.println(emp.toString());

        UpdateWrapper updateWrapper = new UpdateWrapper();
        updateWrapper.eq("empno", emp.getEmpno());
        updateWrapper.set("ename", emp.getEname());
        updateWrapper.set("job", emp.getJob());
        updateWrapper.set("mgr", emp.getMgr());
        updateWrapper.set("hiredate", emp.getHiredate());
        updateWrapper.set("sal", emp.getSal());
        updateWrapper.set("comm", emp.getComm());
        updateWrapper.set("deptno", emp.getDeptno());


        boolean ok = empService.update(updateWrapper);

        return ok;
    }



    @GetMapping("/deleteEmpByEmpno")
    public boolean deleteEmpByEmpno(int empno) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("empno", empno);
        boolean ok = empService.remove(queryWrapper);
        return ok;
    }


    @GetMapping("/getAllEmpsByPageCondition")
    public IPage<Emp> getAllEmpsByPageCondition(int pageNum, int pageSize) {

        return empService.getAllEmpsByPageCondition(pageNum, pageSize);
    }

    @GetMapping("getAllEmps")
    public List<Emp> getAllEmps(){
        return empService.list();
    }

    @GetMapping("/getEmpByJob")
    List<Emp> getEmpByJob (String job) {
        return empService.getEmpByJob(job);
    }

//    String getEmpByJob (String job) {
//
//        return empService.getEmpByJob(job).toString();
//    }

    @GetMapping("/getEmpBySal")
    List<Emp> getEmpBySal (double sal) {
        return empService.getEmpBySal(sal);

    }
//    String getEmpBySal (double sal) {
//        return empService.getEmpBySal(sal).toString();
//    }




}

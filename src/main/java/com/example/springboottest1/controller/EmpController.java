package com.example.springboottest1.controller;

import com.example.springboottest1.entity.Emp;
import com.example.springboottest1.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Bruce
 * @since 2025-05-23
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    IEmpService empService;

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

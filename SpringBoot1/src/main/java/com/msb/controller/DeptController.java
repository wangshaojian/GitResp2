package com.msb.controller;

import com.msb.pojo.Dept;
import com.msb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    public DeptService getDeptService() {
        return deptService;
    }

    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }

    @RequestMapping("/getall")
    @ResponseBody
    public List<Dept> getall(){
        return deptService.findAll();
    }
}

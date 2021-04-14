package com.msb.service.impl;

import com.msb.mapper.DeptMapper;
import com.msb.pojo.Dept;
import com.msb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public DeptMapper getDeptMapper() {
        return deptMapper;
    }

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    public List<Dept> findAll(){
        return deptMapper.selectAll();
    }

}

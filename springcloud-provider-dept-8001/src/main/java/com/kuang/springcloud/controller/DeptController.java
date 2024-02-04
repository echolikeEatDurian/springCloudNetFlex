package com.kuang.springcloud.controller;


import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService service;


    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept) {
        return service.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable long id) {
        return service.queryById(id);
    }

    @GetMapping("/list")
    public List<Dept> getAll() {
        return service.queryAll();
    }

}

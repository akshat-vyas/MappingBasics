package com.mappingsBasics.mappingsAndJpa.controllers;

import com.mappingsBasics.mappingsAndJpa.entities.DepartmentEntity;
import com.mappingsBasics.mappingsAndJpa.repositories.DepartmentRepository;
import com.mappingsBasics.mappingsAndJpa.services.DepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@RestController
@RequestMapping(path="departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }
    @GetMapping(path = "/{departmentId}")
    public DepartmentEntity getDepartmentById(@PathVariable Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping
    public DepartmentEntity createNewDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.createNewDepartment(departmentEntity);
    }

}

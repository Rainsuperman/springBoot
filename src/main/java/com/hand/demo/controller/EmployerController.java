package com.hand.demo.controller;

import com.hand.demo.entity.Employer;
import com.hand.demo.service.EmployerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmployerController {
    @Resource
    private EmployerService employerService;
    @GetMapping(value = "/employer")
    public List<Employer> findAllEmployer(){
        List<Employer> employers = employerService.findAllEmployer();
        return employers;
    }
}

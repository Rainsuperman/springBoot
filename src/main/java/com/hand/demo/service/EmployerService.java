package com.hand.demo.service;

import com.hand.demo.entity.Employer;
import com.hand.demo.mapper.EmployerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployerService {
    @Resource
    private EmployerMapper employerMapper;
    public List<Employer> findAllEmployer(){
        List<Employer> employers = employerMapper.findAllEmployer();
        return employers;
    }

}

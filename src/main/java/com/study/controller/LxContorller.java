package com.study.controller;



import com.study.pojo.Classgrade;
import com.study.service.LxServrce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lx")
public class LxContorller {
    @Autowired
    LxServrce lxServrce;
    @GetMapping
    public List<Classgrade> classgrades(){
        List<Classgrade> classgrades = lxServrce.selectAll();
        System.out.println(classgrades.get(0).getStudentsByCgid().get(0).getGradesByStid());
        return classgrades;
    }
}

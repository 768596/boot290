package com.study.service;

import com.example.tr02005.Pojo.Subject;
import com.example.tr02005.model.Mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SubjectServer {

    @Autowired
    SubjectMapper subjectMapper;

    public List<Subject> SelectAll(){
      return   subjectMapper.SelectAll();
    }

}

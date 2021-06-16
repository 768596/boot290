package com.study.service;


import com.study.model.dao.StudentDao;
import com.study.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentServer {

    @Autowired
    StudentDao studentDao;

    public Page<Student> page(Pageable pageable){
       return studentDao.findAllByBanji(pageable);
    }

}

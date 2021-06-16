package com.study.model.dao;


import com.study.pojo.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
    @Query("select u from Student u  where u.banji.bid=1")
    Page<Student> findAllByBanji(Pageable pageable);
}

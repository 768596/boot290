package com.study.pojo;

import com.example.tr02005.Pojo.Banji;
import com.example.tr02005.Pojo.Student;
import com.example.tr02005.model.Dao.BanjiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanjiServer {

    @Autowired
    BanjiDao banjiDao;

    public Banji selectbyID(Integer id){
        return banjiDao.findById(id).get();
    }

    public Page Select(Pageable pageable){
        return banjiDao.findAll(pageable);
    }



}

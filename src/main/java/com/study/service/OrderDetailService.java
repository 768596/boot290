package com.study.service;

import com.study.model.dao.OrderDAO;
import com.study.model.dao.OrderDetailDAO;
import com.study.pojo.Orders;
import com.study.pojo.Ordetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:52
 */
@Service
@Transactional
public class OrderDetailService {
    @Autowired
    private OrderDetailDAO detailDAO;

}

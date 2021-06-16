package com.study.model.dao;

import com.study.pojo.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:33
 */
@Repository
public interface OrderDAO extends CrudRepository<Orders,Integer> {
}

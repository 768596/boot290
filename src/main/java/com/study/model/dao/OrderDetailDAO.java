package com.study.model.dao;

import com.study.pojo.Ordetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:34
 */
@Repository
public interface OrderDetailDAO extends CrudRepository<Ordetails,Integer> {
    //订单详情是非常重要的主控方
    //包含两个外键字段，所以需要维护两处关系（产品和订单）
}

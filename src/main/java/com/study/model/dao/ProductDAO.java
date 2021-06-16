package com.study.model.dao;

import com.study.pojo.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:31
 */
@Repository
public interface ProductDAO extends CrudRepository<Product,Integer> {
    //产品表有一个外键cid，关联的类别表
    //新增的时候不能指定cid，只能转换成关系字段 Category实体类对象
}

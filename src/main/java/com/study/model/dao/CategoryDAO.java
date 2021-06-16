package com.study.model.dao;

import com.study.pojo.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:40
 */
@Repository
public interface CategoryDAO extends CrudRepository<Category,Integer> {
    //保留了外键字段pid
    //关系字段child只和查询有关，增删改不受影响（增删改都是单表模式）
    //关系字段products只和查询有关
}

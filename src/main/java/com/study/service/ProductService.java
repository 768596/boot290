package com.study.service;

import com.study.model.dao.ProductDAO;
import com.study.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:43
 */
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductDAO dao;

    /** 产品新增/修改。类别编号只能以实体类的主键形式添加进来
     * @param product
     * @return
     */
    public Integer doInsert(Product product){
        product = dao.save(product);
        return product.getId();//返回新增的主键编号
    }

    public Integer doDelete(Integer pid){
        dao.deleteById(pid);
        return 1;
    }


}

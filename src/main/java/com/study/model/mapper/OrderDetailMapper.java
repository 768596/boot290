package com.study.model.mapper;

import com.study.pojo.Ordetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 * @author SMILE.Huang
 * @date 2021-06-08 16:14
 */
@Mapper
public interface OrderDetailMapper {
    List<Ordetails> selectByOid(Integer oid);
}

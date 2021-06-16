package com.study.model.mapper;

import com.study.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 19:07
 */
@Mapper
public interface UserMapper {
    /**根据用户名获取用户信息
     * @param username
     * @return
     */
    User loadUserByUsername(String username);
}

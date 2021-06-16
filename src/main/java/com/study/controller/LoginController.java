package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import com.study.utils.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 19:18
 */
@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
    @Autowired
    private UserService us;
    @PostMapping
    public MyResult login(@RequestParam("username") String name,
                          @RequestParam("password") String pwd) {
        //根据用户名查询用户数据
        User u = us.loginCheck(name);
        if(u==null) {
            return MyResult.FAILURE("用户名错误！！");
        }else {
            if(u.getPassword().equals(pwd.trim())) {
                if(u.isEnabled()) {
                    return MyResult.SUCCESS_Object(u);
                }
                return MyResult.FAILURE("该用户已经禁用，请联系系统管理员！！");
            }else {
                return MyResult.FAILURE("密码错误！！");
            }
        }
    }
}

package com.storm.service.impl;

import com.storm.domain.User;
import com.storm.domain.UserExample;
import com.storm.mapper.UserMapper;
import com.storm.service.UserService;
import com.storm.utils.MD5Utils;
import com.storm.utils.StormResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * Created by Rian on 2019/1/27.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    public StormResult login(User user,  String checkCode, String  key) {


        if (!StringUtils.isEmpty(checkCode) && checkCode.equals(key)) {
            Subject subject = SecurityUtils.getSubject();
            String password = MD5Utils.md5(user.getPassword());
            AuthenticationToken token = new UsernamePasswordToken(user.getUserName(), password);
            try {
                subject.login(token);
            } catch (UnknownAccountException e) {
                e.printStackTrace();
                return StormResult.build(401, "用户名或密码不正确");

            } catch (Exception e) {
                e.printStackTrace();
                return StormResult.build(400, "登陆失败");
            }

            return StormResult.ok();

        } else {
            return StormResult.build(401, "验证码错误");
        }
    }
}

package com.storm.web;

import com.storm.domain.User;
import com.storm.service.UserService;
import com.storm.utils.CookieUtils;
import com.storm.utils.StormResult;
import com.storm.web.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * Created by Rian on 2019/1/27.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class UserContRoller {
    @Value("${TOKEN_KEY}")
    private String TOKEN_KEY ;
    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/login", method= RequestMethod.POST)
    @ResponseBody
    public StormResult login(HttpServletRequest request, HttpServletResponse response, @RequestBody LoginVo loginVo){
        String key = (String) request.getSession().getAttribute("key");
        StormResult result = userService.login(loginVo,loginVo.getCheckCode(),key);
        if(result.getStatus()==200){
            String token = UUID.randomUUID().toString();
            request.getSession().setAttribute(TOKEN_KEY+":"+token,loginVo);
            CookieUtils.setCookie(request,response,TOKEN_KEY,token);
        }

        return result;
    }


}

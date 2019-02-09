package com.storm.service;

import com.storm.domain.User;
import com.storm.utils.StormResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Rian on 2019/1/27.
 * Copyright © 2018 Rian. All rights reserved
 */
public interface UserService {

    /**
     * 
     * @param user
     * @param checkcode
     * @param key
     * @return
     */
    StormResult login(User user,String checkcode, String key );
}

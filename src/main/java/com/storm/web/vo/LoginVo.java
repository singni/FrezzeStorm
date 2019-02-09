package com.storm.web.vo;

import com.storm.domain.User;

/**
 * Created by Rian on 2019/2/7.
 * Copyright © 2018 Rian. All rights reserved
 */
public class LoginVo extends User {


    private String checkCode;

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}

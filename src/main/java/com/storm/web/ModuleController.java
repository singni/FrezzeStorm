package com.storm.web;

import com.storm.domain.Module;
import com.storm.service.ModuleService;
import com.storm.utils.StormResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Rian on 2019/2/10.
 * Copyright © 2018 Rian. All rights reserved
 */
@Controller
public class ModuleController {

    @Autowired
    private ModuleService moduleService;


    @RequestMapping("/module/findAll")
    @ResponseBody
    public StormResult findAll(){
        List<Module> list = moduleService.findAll();

        return StormResult.ok(list);
    }

}

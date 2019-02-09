package com.storm.service.impl;

import com.storm.domain.Module;
import com.storm.mapper.ModuleMapper;
import com.storm.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rian on 2019/2/9.
 * Copyright © 2018 Rian. All rights reserved
 */
@Service
public class MosuleServiceImpl  implements ModuleService{
    @Autowired
    private ModuleMapper moduleMapper;

    public List<Module> findAll() {
        return moduleMapper.findAll();
    }
}

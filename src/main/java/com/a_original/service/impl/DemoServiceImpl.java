package com.a_original.service.impl;

import com.a_original.bean.BeanFactory;
import com.a_original.dao.DemoDao;
import com.a_original.dao.impl.DemoDaoImpl;
import com.a_original.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        for (int i = 0; i < 5; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
        return demoDao.findAll();
    }
}

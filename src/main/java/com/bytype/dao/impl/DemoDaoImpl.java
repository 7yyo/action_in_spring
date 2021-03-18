package com.bytype.dao.impl;

import com.bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("aa", "bb", "cc");
    }

}

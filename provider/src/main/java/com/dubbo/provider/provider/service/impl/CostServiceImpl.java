package com.dubbo.provider.provider.service.impl;

import com.dubbo.api.api.service.CostService;

import com.alibaba.dubbo.config.annotation.Service;
/***
 * @author author
 * @Description
 * @Date Created in 14:59 2019/12/4
 */
@Service
public class CostServiceImpl implements CostService {
    private final Integer totalCost = 1000;
    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}

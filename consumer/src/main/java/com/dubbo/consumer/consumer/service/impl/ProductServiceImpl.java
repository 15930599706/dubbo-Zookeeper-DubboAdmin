package com.dubbo.consumer.consumer.service.impl;


import com.dubbo.api.api.service.CostService;
import com.dubbo.consumer.consumer.service.ProductService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/***
 * @author author
 * @Description
 * @Date Created in 14:20 2019/12/4
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    /**
     * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference
    private CostService costService;
    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}

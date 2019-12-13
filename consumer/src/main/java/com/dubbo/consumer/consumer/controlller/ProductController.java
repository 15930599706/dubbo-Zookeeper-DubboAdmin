package com.dubbo.consumer.consumer.controlller;

import com.dubbo.consumer.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author author
 * @Description
 * @Date Created in 14:22 2019/12/4
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/add/{money}")
    public String getCost(@PathVariable Integer money){
        return "该产品总共消费 ："+productService.getCost(money);
    }
}

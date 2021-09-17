package com.neco.springcloud.controller;

import com.neco.springcloud.entities.CommonResult;
import com.neco.springcloud.entity.Order;
import com.neco.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liangyt
 * @create 2021-09-17 10:58
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}

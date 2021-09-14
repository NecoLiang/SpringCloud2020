package com.neco.springcloud;

import com.neco.springcloud.entities.CommonResult;
import com.neco.springcloud.entities.Payment;
import com.neco.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author liangyt
 * @create 2021-07-02 22:08
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverport;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果："+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功,serverPort:"+serverport,result);

        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }

    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果："+payment);
        if (payment!=null){
            return new CommonResult(200,"查询数据库成功,serverPort:"+serverport,payment);

        }else {
            return new CommonResult(444,"查询数据库失败，查询id为："+id,null);
        }

    }
    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("=====service: "+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getInstanceId()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }


    @GetMapping(value = "/payment/timeout")
    public String openFeignTimeOut(){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e){
            e.printStackTrace();
        }
        return serverport;
    }

    @GetMapping(value = "/payment/lb")
    public String lb(){
        return serverport;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am paymentzipkin server fall back，welcome to here, O(∩_∩)O哈哈~";
    }
}

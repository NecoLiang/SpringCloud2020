package com.neco.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangyt
 * @create 2021-09-15 14:26
 */
@RestController
@Slf4j
public class FlowLimitController {

        @GetMapping("/testA")
        public String testA ()
        {
            return "------testA";
        }

        @GetMapping("/testB")
        public String testB ()
        {
            log.info(Thread.currentThread().getName() + "\t" + "...testB");
            return "------testB";
        }

        @GetMapping("/testHotKey")
        @SentinelResource(value = "testHotKey",blockHandler ="default_back" )
        public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                                 @RequestParam(value = "p2",required = false) String p2){
            return "----------fangwenzhong !";

        }
        public String default_back(String p1, String p2, BlockException expection){
            return "wuwuuwuwuwuuwuwu挂了";
        }


}

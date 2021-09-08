package com.neco.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liangyt
 * @create 2021-09-07 17:16
 */
@Configuration
@Slf4j
public class MySelfRule {
    @Bean
    public IRule iRule(){
        return new RandomRule();//随机
    }
}

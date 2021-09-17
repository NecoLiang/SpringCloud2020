package com.neco.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liangyt
 * @create 2021-09-17 11:00
 */
@Configuration
@MapperScan({"com.neco.springcloud.mapper"})
public class MyBatisConfig {
}

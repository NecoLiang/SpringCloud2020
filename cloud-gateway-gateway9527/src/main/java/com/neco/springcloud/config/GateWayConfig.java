package com.neco.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liangyt
 * @create 2021-09-13 11:23
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("payment_neco1",r ->r.path("/douga").uri("https://www.bilibili.com/v/douga/?spm_id_from=333.851.b_7072696d6172794368616e6e656c4d656e75.1"));
        return routes.build();
    }
}

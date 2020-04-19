package com.mineok.springcloud.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        // 访问http://localhost:9527/guonei将转发到http://news.baidu.com/guonei
        routes.route("path_route_mineok",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"));
        return routes.build();
    }

}

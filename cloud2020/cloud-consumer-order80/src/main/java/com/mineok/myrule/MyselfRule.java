package com.mineok.myrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
  配置自定义负载均衡算法,注意不能与主启动类所在包相同(为避免@ComponentScan)
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        // 负载均衡算法:随机
        return new RandomRule();
    }
}

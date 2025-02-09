package com.config;

import com.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //这个也会被spring容器托管，注册到容器中，因为他本来就是一个@Component
@ComponentScan("com.pojo") //可以不写
@Import(Config2.class)//导入其他类的配置
public class   MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}

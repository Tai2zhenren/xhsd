package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 应用程序配置类，用于定义Spring Bean。
 */
@Configuration
public class AppConfig {
    @Bean
    public String exampleBean() {
        return "This is an example bean";
    }
}

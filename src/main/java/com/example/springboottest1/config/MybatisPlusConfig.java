package com.example.springboottest1.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;


//pom引入        <dependency>
//            <groupId>com.baomidou</groupId>
//            <artifactId>mybatis-plus-jsqlparser</artifactId>
//            <version>3.5.11</version>
//        </dependency>
//不然报错PaginationInnerInterceptor

@Configuration
@MapperScan("com.example.springboottest1.mapper")

public class MybatisPlusConfig {
    // MyBatis-Plus 配置类
    // 这里可以添加其他 MyBatis-Plus 的配置，例如分页插件等
    // 目前没有额外的配置，所以这个类是空的

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 可以在这里添加其他插件，例如分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

//    @Bean
//    public ConfigurationCustomizer configurationCustomizer() {
//        return configuration -> configuration.setUseDeprecatedExecutor(false);
//    }

}
package com.kafeim.mybatis.join.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.kafeim.mybatisplus.join.config.JoinInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liubo
 * @Project Name: mybatis-plus-join-test
 * @File Name: MybatisConfig
 * @Createtime: 2022-01-07 15:51
 * @Description:
 */
@Configuration
public class MybatisConfig {

    @Bean
    ConfigurationCustomizer mybatisConfigurationCustomizer() {
        return new ConfigurationCustomizer() {

            @Override
            public void customize(MybatisConfiguration configuration) {
                // 分页插件
                MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
                interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
                configuration.addInterceptor(interceptor);

                // 连表拦截器
                configuration.addInterceptor(new JoinInterceptor());
            }
        };
    }

    // 最新版
//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor() {
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//
//        return interceptor;
//    }
}

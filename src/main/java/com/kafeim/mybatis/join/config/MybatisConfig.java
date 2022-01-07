package com.kafeim.mybatis.join.config;

import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
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
                configuration.addInterceptor(new TestInterceptor());
            }
        };
    }
}

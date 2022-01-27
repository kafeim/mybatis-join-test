package com.kafeim.mybatis.join;

import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.Table;
import cn.org.atool.generator.annotation.Tables;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusJoinTestApplicationTests {

    @Test
    void contextLoads() {
    }

    public static final String url = "jdbc:log4jdbc:mysql://47.92.67.120:3306/kafeim?serverTimezone=Asia/Shanghai&characterEncoding=utf8&useSSL=false";

    @Test
    public void generate() throws Exception {
        FileGenerator.build(Empty.class);
    }


    @Tables(
            // 设置数据库连接信息
            url = url, username = "kafeim", password = "dL7W2HBSGYcFjPNS",
            // 设置entity类生成src目录, 相对于 user.dir
            srcDir = "src/main/java",
            // 设置entity类的package值
            basePack = "com.kafeim.mybatis.join.fluent",
            // 设置dao接口和实现的src目录, 相对于 user.dir
            daoDir = "src/main/java",
            // 设置哪些表要生成Entity文件
            tables = {@Table(value = {"kf_article"})}
    )
    static class Empty {
    }

}

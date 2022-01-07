package com.kafeim.mybatis.join.comtroller;

import com.kafeim.mybatis.join.mapper.ArticleMapper;
import com.kafeim.mybatis.join.mapper.UserMapper;
import com.kafeim.mybatis.join.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liubo
 * @Project Name: mybatis-plus-join-test
 * @File Name: TestController
 * @Createtime: 2022-01-06 09:47
 * @Description:
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {


    private final ArticleMapper articleMapper;

    private final UserMapper userMapper;

    private final UserService userService;

    @RequestMapping("/query")
    public Object query(){


        return userMapper.oneToOne();
    }

}

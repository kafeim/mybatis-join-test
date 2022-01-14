package com.kafeim.mybatis.join.comtroller;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kafeim.mybatis.join.entity.Article;
import com.kafeim.mybatis.join.mapper.ArticleMapper;
import com.kafeim.mybatis.join.mapper.UserMapper;
import com.kafeim.mybatis.join.query.UserQuery;
import com.kafeim.mybatis.join.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/query/one")
    public Object queryOne(){

        UserQuery query = new UserQuery();
        query.setUserId("1");
        return articleMapper.connectedTableQueryOne(query);
    }


//    @RequestMapping("/query/list")
//    public Object queryList(){
//
//
//        return articleMapper.connectedTableQueryList();
//    }
//
//    @RequestMapping("/query/page")
//    public Object queryPage(@RequestParam int page){
//
//
//        return articleMapper.connectedTableQueryPage(new Page(page , 10)).getRecords();
//    }

}

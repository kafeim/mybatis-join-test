package com.kafeim.mybatis.join.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kafeim.mybatis.join.entity.User;
import com.kafeim.mybatis.join.service.UserService;
import com.kafeim.mybatis.join.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}





package com.kafeim.mybatis.join.query;

import com.kafeim.mybatisplus.join.annotation.JoinOrder;
import com.kafeim.mybatisplus.join.annotation.JoinWhere;
import com.kafeim.mybatisplus.join.conditions.Condition;
import com.kafeim.mybatisplus.join.enums.JoinSort;
import com.kafeim.mybatisplus.join.enums.Where;
import com.kafeim.mybatisplus.join.enums.WhereTyep;
import lombok.Data;

/**
 * @Project Name: mybatis-join-test
 * @File Name: UserQuery
 * @Author: kafeim
 * @Createtime: 2022-01-09 21:42
 * @Description:
 */
@Data
public class UserQuery extends Condition {

    @JoinWhere(where = Where.EQ , whereType = WhereTyep.AND)
    @JoinOrder(sort = JoinSort.DESC)
    private String userId;

}

package com.kafeim.mybatis.join.query;

import com.kafeim.mybatisplus.join.annotation.JoinWhere;
import com.kafeim.mybatisplus.join.conditions.Condition;
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
public class ArticleQuery extends Condition {

    @JoinWhere(where = Where.EQ , whereType = WhereTyep.AND)
    private String userId;

    @JoinWhere(where = Where.EQ , whereType = WhereTyep.AND)
    private String title;

}

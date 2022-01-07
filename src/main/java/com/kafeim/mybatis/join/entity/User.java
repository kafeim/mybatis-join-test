package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.kafeim.mybatisplus.join.annotation.OneToMany;
import com.kafeim.mybatisplus.join.enums.JoinType;
import com.kafeim.mybatisplus.join.object.Entity;
import lombok.Data;

/**
 * 用户
 * @TableName kf_user
 */
@TableName(value ="kf_user")
@Data
public class User implements Serializable {

    @OneToMany(join = JoinType.LEFT , joinEntity = Article.class , foreignKey = "user_id")
    @TableField(exist = false)
    private List<Article> articleList;

    /**
     *  
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 0 禁用 1启用
     */
    @TableField(value = "enable")
    private Integer enable;

    /**
     * 
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
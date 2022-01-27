package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.kafeim.mybatisplus.join.KfMode;
import com.kafeim.mybatisplus.join.annotation.OneToOne;
import com.kafeim.mybatisplus.join.enums.JoinType;
import lombok.Data;

/**
 * 文章
 * @TableName kf_article
 */
@TableName(value ="kf_article")
@Data
public class Article extends KfMode implements Serializable {


    @TableField(exist = false)
    @OneToOne(joinEntity = Tag.class , join = JoinType.LEFT , foreignKey = "tag_id")
    private Tag tag;

    @TableField(exist = false)
    @OneToOne(joinEntity = User.class , join = JoinType.LEFT , foreignKey = "user_id")
    private User user;

    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 浏览量
     */
    @TableField(value = "browse")
    private Integer browse;

    /**
     * 标签
     */
    @TableField(value = "tag_id")
    private Integer tagId;

    /**
     * 目录id
     */
    @TableField(value = "directory_id")
    private Integer directoryId;

    /**
     * 发布时间
     */
    @TableField(value = "release_time")
    private Date releaseTime;

    /**
     * 0 草稿    1 发布  2 隐藏
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 0 未审核 1 通过  2 拒绝  
     */
    @TableField(value = "audit_status")
    private Integer auditStatus;

    /**
     * 审核时间
     */
    @TableField(value = "audit_time")
    private Date auditTime;

    /**
     * 0 未删除 1 已删除
     */
    @TableField(value = "is_del")
    private Integer isDel;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
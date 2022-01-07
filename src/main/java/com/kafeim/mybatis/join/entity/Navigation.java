package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 导航
 * @TableName kf_navigation
 */
@TableName(value ="kf_navigation")
@Data
public class Navigation implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 导航key
     */
    @TableField(value = "key")
    private String key;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 父id
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 跳转URL
     */
    @TableField(value = "url")
    private String url;

    /**
     * icon 图片
     */
    @TableField(value = "icon")
    private String icon;

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
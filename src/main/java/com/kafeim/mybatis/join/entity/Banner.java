package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * banner 
 * @TableName kf_banner
 */
@TableName(value ="kf_banner")
@Data
public class Banner implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 导航key
     */
    @TableField(value = "key")
    private String key;

    /**
     * 图片
     */
    @TableField(value = "image")
    private String image;

    /**
     * 描述
     */
    @TableField(value = "describe")
    private String describe;

    /**
     * 跳转URL
     */
    @TableField(value = "url")
    private String url;

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
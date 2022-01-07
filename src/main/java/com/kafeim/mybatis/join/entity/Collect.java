package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 收藏
 * @TableName kf_collect
 */
@TableName(value ="kf_collect")
@Data
public class Collect implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文章ID
     */
    @TableField(value = "article_id")
    private Integer articleId;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 收藏时间
     */
    @TableField(value = "collect_time")
    private Date collectTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
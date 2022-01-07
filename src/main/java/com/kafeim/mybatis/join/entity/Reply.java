package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 回复
 * @TableName kf_reply
 */
@TableName(value ="kf_reply")
@Data
public class Reply implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论id
     */
    @TableField(value = "comment_id")
    private Integer commentId;

    /**
     * 回复人
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 0 用户回复， 1 博主回复
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 回复时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
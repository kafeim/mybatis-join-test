package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 留言
 * @TableName kf_leave_word
 */
@TableName(value ="kf_leave_word")
@Data
public class LeaveWord implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 0 待审核 1 已审核
     */
    @TableField(value = "audit_status")
    private Integer auditStatus;

    /**
     * 0 未删除 1 删除
     */
    @TableField(value = "is_del")
    private Integer isDel;

    /**
     * 留言时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
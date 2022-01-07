package com.kafeim.mybatis.join.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 举报
 * @TableName kf_report
 */
@TableName(value ="kf_report")
@Data
public class Report implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 文章id
     */
    @TableField(value = "article_id")
    private Integer articleId;

    /**
     * 举报类型
     */
    @TableField(value = "report_type")
    private String reportType;

    /**
     * 举报内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 0 未处理 1 已处理
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 处理时间
     */
    @TableField(value = "processing_time")
    private Date processingTime;

    /**
     * 举报时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
package com.kafeim.mybatis.join.fluent.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * KfArticleEntity: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@FluentMybatis(
    table = "kf_article",
    schema = "kafeim"
)
public class KfArticleEntity extends RichEntity {
  private static final long serialVersionUID = 1L;

  /**
   */
  @TableId("id")
  private Integer id;

  /**
   * 0 未审核 1 通过  2 拒绝  
   */
  @TableField("audit_status")
  private Boolean auditStatus;

  /**
   * 审核时间
   */
  @TableField("audit_time")
  private Date auditTime;

  /**
   * 浏览量
   */
  @TableField("browse")
  private Integer browse;

  /**
   * 内容
   */
  @TableField("content")
  private String content;

  /**
   * 创建时间
   */
  @TableField("create_time")
  private Date createTime;

  /**
   * 描述
   */
  @TableField("description")
  private String description;

  /**
   * 目录id
   */
  @TableField("directory_id")
  private Integer directoryId;

  /**
   * 0 未删除 1 已删除
   */
  @TableField("is_del")
  private Boolean isDel;

  /**
   * 发布时间
   */
  @TableField("release_time")
  private Date releaseTime;

  /**
   * 0 草稿    1 发布  2 隐藏
   */
  @TableField("status")
  private Boolean status;

  /**
   * 标签
   */
  @TableField("tag_id")
  private Integer tagId;

  /**
   * 标题
   */
  @TableField("title")
  private String title;

  /**
   * 修改时间
   */
  @TableField("update_time")
  private Date updateTime;

  /**
   * 用户id
   */
  @TableField("user_id")
  private Integer userId;

  @Override
  public final Class entityClass() {
    return KfArticleEntity.class;
  }
}

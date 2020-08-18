/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IRecord extends Serializable {

    /**
     * Setter for <code>indexBot.record.id</code>. 频道\群组\机器人 ID
     */
    public void setId(Long value);

    /**
     * Getter for <code>indexBot.record.id</code>. 频道\群组\机器人 ID
     */
    public Long getId();

    /**
     * Setter for <code>indexBot.record.username</code>. 频道\群组\机器人 username
     */
    public void setUsername(String value);

    /**
     * Getter for <code>indexBot.record.username</code>. 频道\群组\机器人 username
     */
    public String getUsername();

    /**
     * Setter for <code>indexBot.record.inviteLink</code>. 私有链接
     */
    public void setInvitelink(String value);

    /**
     * Getter for <code>indexBot.record.inviteLink</code>. 私有链接
     */
    public String getInvitelink();

    /**
     * Setter for <code>indexBot.record.title</code>. 名称
     */
    public void setTitle(String value);

    /**
     * Getter for <code>indexBot.record.title</code>. 名称
     */
    public String getTitle();

    /**
     * Setter for <code>indexBot.record.remark</code>. 简介
     */
    public void setRemark(String value);

    /**
     * Getter for <code>indexBot.record.remark</code>. 简介
     */
    public String getRemark();

    /**
     * Setter for <code>indexBot.record.memberNumber</code>. 成员数量
     */
    public void setMembernumber(Long value);

    /**
     * Getter for <code>indexBot.record.memberNumber</code>. 成员数量
     */
    public Long getMembernumber();

    /**
     * Setter for <code>indexBot.record.tag</code>. 标签
     */
    public void setTag(String value);

    /**
     * Getter for <code>indexBot.record.tag</code>. 标签
     */
    public String getTag();

    /**
     * Setter for <code>indexBot.record.type</code>. 收录类型 字典-recordType   频道\群组\机器人
     */
    public void setType(String value);

    /**
     * Getter for <code>indexBot.record.type</code>. 收录类型 字典-recordType   频道\群组\机器人
     */
    public String getType();

    /**
     * Setter for <code>indexBot.record.classification</code>. 分类
     */
    public void setClassification(String value);

    /**
     * Getter for <code>indexBot.record.classification</code>. 分类
     */
    public String getClassification();

    /**
     * Setter for <code>indexBot.record.placardId</code>. 公告ID
     */
    public void setPlacardid(Long value);

    /**
     * Getter for <code>indexBot.record.placardId</code>. 公告ID
     */
    public Long getPlacardid();

    /**
     * Setter for <code>indexBot.record.status</code>. 是否展示
     */
    public void setStatus(Boolean value);

    /**
     * Getter for <code>indexBot.record.status</code>. 是否展示
     */
    public Boolean getStatus();

    /**
     * Setter for <code>indexBot.record.createTime</code>. 创建时间
     */
    public void setCreatetime(LocalDateTime value);

    /**
     * Getter for <code>indexBot.record.createTime</code>. 创建时间
     */
    public LocalDateTime getCreatetime();

    /**
     * Setter for <code>indexBot.record.createUser</code>. 提交收录申请用户
     */
    public void setCreateuser(Long value);

    /**
     * Getter for <code>indexBot.record.createUser</code>. 提交收录申请用户
     */
    public Long getCreateuser();

    /**
     * Setter for <code>indexBot.record.updateTime</code>. 更新时间
     */
    public void setUpdatetime(LocalDateTime value);

    /**
     * Getter for <code>indexBot.record.updateTime</code>. 更新时间
     */
    public LocalDateTime getUpdatetime();

    /**
     * Setter for <code>indexBot.record.updateUser</code>. 修改用户
     */
    public void setUpdateuser(LocalDateTime value);

    /**
     * Getter for <code>indexBot.record.updateUser</code>. 修改用户
     */
    public LocalDateTime getUpdateuser();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRecord
     */
    public void from(IRecord from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRecord
     */
    public <E extends IRecord> E into(E into);
}

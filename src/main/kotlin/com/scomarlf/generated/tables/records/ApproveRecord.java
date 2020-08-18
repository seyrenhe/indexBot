/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.records;


import com.scomarlf.generated.tables.Approve;
import com.scomarlf.generated.tables.interfaces.IApprove;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApproveRecord extends UpdatableRecordImpl<ApproveRecord> implements Record5<String, String, Boolean, Long, LocalDateTime>, IApprove {

    private static final long serialVersionUID = 956082723;

    /**
     * Setter for <code>indexBot.approve.id</code>. 主键
     */
    @Override
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>indexBot.approve.id</code>. 主键
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>indexBot.approve.enrollId</code>. 申请ID
     */
    @Override
    public void setEnrollid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>indexBot.approve.enrollId</code>. 申请ID
     */
    @Override
    public String getEnrollid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>indexBot.approve.status</code>. 审核状态 通过不通过
     */
    @Override
    public void setStatus(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>indexBot.approve.status</code>. 审核状态 通过不通过
     */
    @Override
    public Boolean getStatus() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>indexBot.approve.createUser</code>. 用户ID
     */
    @Override
    public void setCreateuser(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>indexBot.approve.createUser</code>. 用户ID
     */
    @Override
    public Long getCreateuser() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>indexBot.approve.createTime</code>. 审核时间
     */
    @Override
    public void setCreatetime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>indexBot.approve.createTime</code>. 审核时间
     */
    @Override
    public LocalDateTime getCreatetime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, Boolean, Long, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, Boolean, Long, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Approve.APPROVE.ID;
    }

    @Override
    public Field<String> field2() {
        return Approve.APPROVE.ENROLLID;
    }

    @Override
    public Field<Boolean> field3() {
        return Approve.APPROVE.STATUS;
    }

    @Override
    public Field<Long> field4() {
        return Approve.APPROVE.CREATEUSER;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Approve.APPROVE.CREATETIME;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEnrollid();
    }

    @Override
    public Boolean component3() {
        return getStatus();
    }

    @Override
    public Long component4() {
        return getCreateuser();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatetime();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEnrollid();
    }

    @Override
    public Boolean value3() {
        return getStatus();
    }

    @Override
    public Long value4() {
        return getCreateuser();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatetime();
    }

    @Override
    public ApproveRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public ApproveRecord value2(String value) {
        setEnrollid(value);
        return this;
    }

    @Override
    public ApproveRecord value3(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public ApproveRecord value4(Long value) {
        setCreateuser(value);
        return this;
    }

    @Override
    public ApproveRecord value5(LocalDateTime value) {
        setCreatetime(value);
        return this;
    }

    @Override
    public ApproveRecord values(String value1, String value2, Boolean value3, Long value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IApprove from) {
        setId(from.getId());
        setEnrollid(from.getEnrollid());
        setStatus(from.getStatus());
        setCreateuser(from.getCreateuser());
        setCreatetime(from.getCreatetime());
    }

    @Override
    public <E extends IApprove> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApproveRecord
     */
    public ApproveRecord() {
        super(Approve.APPROVE);
    }

    /**
     * Create a detached, initialised ApproveRecord
     */
    public ApproveRecord(String id, String enrollid, Boolean status, Long createuser, LocalDateTime createtime) {
        super(Approve.APPROVE);

        set(0, id);
        set(1, enrollid);
        set(2, status);
        set(3, createuser);
        set(4, createtime);
    }
}

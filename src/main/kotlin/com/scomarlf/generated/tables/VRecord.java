/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables;


import com.scomarlf.generated.Indexbot;
import com.scomarlf.generated.tables.records.VRecordRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VRecord extends TableImpl<VRecordRecord> {

    private static final long serialVersionUID = 776876843;

    /**
     * The reference instance of <code>indexBot.v_record</code>
     */
    public static final VRecord V_RECORD = new VRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VRecordRecord> getRecordType() {
        return VRecordRecord.class;
    }

    /**
     * The column <code>indexBot.v_record.id</code>. 频道\群组\机器人 ID
     */
    public final TableField<VRecordRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "频道\\群组\\机器人 ID");

    /**
     * The column <code>indexBot.v_record.username</code>. 频道\群组\机器人 username
     */
    public final TableField<VRecordRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(150), this, "频道\\群组\\机器人 username");

    /**
     * The column <code>indexBot.v_record.inviteLink</code>. 私有链接
     */
    public final TableField<VRecordRecord, String> INVITELINK = createField(DSL.name("inviteLink"), org.jooq.impl.SQLDataType.VARCHAR(150), this, "私有链接");

    /**
     * The column <code>indexBot.v_record.title</code>. 名称
     */
    public final TableField<VRecordRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "名称");

    /**
     * The column <code>indexBot.v_record.remark</code>. 简介
     */
    public final TableField<VRecordRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.CLOB, this, "简介");

    /**
     * The column <code>indexBot.v_record.memberNumber</code>. 成员数量
     */
    public final TableField<VRecordRecord, Long> MEMBERNUMBER = createField(DSL.name("memberNumber"), org.jooq.impl.SQLDataType.BIGINT, this, "成员数量");

    /**
     * The column <code>indexBot.v_record.tag</code>. 标签
     */
    public final TableField<VRecordRecord, String> TAG = createField(DSL.name("tag"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "标签");

    /**
     * The column <code>indexBot.v_record.type</code>. 收录类型 字典-recordType   频道\群组\机器人
     */
    public final TableField<VRecordRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "收录类型 字典-recordType   频道\\群组\\机器人");

    /**
     * The column <code>indexBot.v_record.typeName</code>.
     */
    public final TableField<VRecordRecord, String> TYPENAME = createField(DSL.name("typeName"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>indexBot.v_record.classification</code>. 分类
     */
    public final TableField<VRecordRecord, String> CLASSIFICATION = createField(DSL.name("classification"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "分类");

    /**
     * The column <code>indexBot.v_record.classificationName</code>.
     */
    public final TableField<VRecordRecord, String> CLASSIFICATIONNAME = createField(DSL.name("classificationName"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>indexBot.v_record.placardId</code>. 公告ID
     */
    public final TableField<VRecordRecord, Long> PLACARDID = createField(DSL.name("placardId"), org.jooq.impl.SQLDataType.BIGINT, this, "公告ID");

    /**
     * The column <code>indexBot.v_record.status</code>. 是否展示
     */
    public final TableField<VRecordRecord, Boolean> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.BIT, this, "是否展示");

    /**
     * The column <code>indexBot.v_record.createTime</code>. 创建时间
     */
    public final TableField<VRecordRecord, LocalDateTime> CREATETIME = createField(DSL.name("createTime"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * The column <code>indexBot.v_record.createUser</code>. 提交收录申请用户
     */
    public final TableField<VRecordRecord, Long> CREATEUSER = createField(DSL.name("createUser"), org.jooq.impl.SQLDataType.BIGINT, this, "提交收录申请用户");

    /**
     * The column <code>indexBot.v_record.updateTime</code>. 更新时间
     */
    public final TableField<VRecordRecord, LocalDateTime> UPDATETIME = createField(DSL.name("updateTime"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "更新时间");

    /**
     * The column <code>indexBot.v_record.updateUser</code>. 修改用户
     */
    public final TableField<VRecordRecord, LocalDateTime> UPDATEUSER = createField(DSL.name("updateUser"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "修改用户");

    /**
     * Create a <code>indexBot.v_record</code> table reference
     */
    public VRecord() {
        this(DSL.name("v_record"), null);
    }

    /**
     * Create an aliased <code>indexBot.v_record</code> table reference
     */
    public VRecord(String alias) {
        this(DSL.name(alias), V_RECORD);
    }

    /**
     * Create an aliased <code>indexBot.v_record</code> table reference
     */
    public VRecord(Name alias) {
        this(alias, V_RECORD);
    }

    private VRecord(Name alias, Table<VRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private VRecord(Name alias, Table<VRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `v_record` as select `r`.`id` AS `id`,`r`.`username` AS `username`,`r`.`inviteLink` AS `inviteLink`,`r`.`title` AS `title`,`r`.`remark` AS `remark`,`r`.`memberNumber` AS `memberNumber`,`r`.`tag` AS `tag`,`r`.`type` AS `type`,(select `indexBot`.`dictionary`.`label` from `indexBot`.`dictionary` where (`indexBot`.`dictionary`.`id` = `r`.`type`)) AS `typeName`,`r`.`classification` AS `classification`,(select `indexBot`.`dictionary`.`label` from `indexBot`.`dictionary` where (`indexBot`.`dictionary`.`id` = `r`.`classification`)) AS `classificationName`,`r`.`placardId` AS `placardId`,`r`.`status` AS `status`,`r`.`createTime` AS `createTime`,`r`.`createUser` AS `createUser`,`r`.`updateTime` AS `updateTime`,`r`.`updateUser` AS `updateUser` from `indexBot`.`record` `r`"));
    }

    public <O extends Record> VRecord(Table<O> child, ForeignKey<O, VRecordRecord> key) {
        super(child, key, V_RECORD);
    }

    @Override
    public Schema getSchema() {
        return Indexbot.INDEXBOT;
    }

    @Override
    public VRecord as(String alias) {
        return new VRecord(DSL.name(alias), this);
    }

    @Override
    public VRecord as(Name alias) {
        return new VRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VRecord rename(String name) {
        return new VRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VRecord rename(Name name) {
        return new VRecord(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, String, String, String, String, Long, String, String, String, String, String, Long, Boolean, LocalDateTime, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}

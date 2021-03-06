/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables;


import com.scomarlf.generated.Indexbot;
import com.scomarlf.generated.Keys;
import com.scomarlf.generated.tables.records.ConstantRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Constant extends TableImpl<ConstantRecord> {

    private static final long serialVersionUID = 1073770785;

    /**
     * The reference instance of <code>indexBot.constant</code>
     */
    public static final Constant CONSTANT = new Constant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConstantRecord> getRecordType() {
        return ConstantRecord.class;
    }

    /**
     * The column <code>indexBot.constant.id</code>. 唯一标识
     */
    public final TableField<ConstantRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "唯一标识");

    /**
     * The column <code>indexBot.constant.content</code>. 内容
     */
    public final TableField<ConstantRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.CLOB, this, "内容");

    /**
     * Create a <code>indexBot.constant</code> table reference
     */
    public Constant() {
        this(DSL.name("constant"), null);
    }

    /**
     * Create an aliased <code>indexBot.constant</code> table reference
     */
    public Constant(String alias) {
        this(DSL.name(alias), CONSTANT);
    }

    /**
     * Create an aliased <code>indexBot.constant</code> table reference
     */
    public Constant(Name alias) {
        this(alias, CONSTANT);
    }

    private Constant(Name alias, Table<ConstantRecord> aliased) {
        this(alias, aliased, null);
    }

    private Constant(Name alias, Table<ConstantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Constant(Table<O> child, ForeignKey<O, ConstantRecord> key) {
        super(child, key, CONSTANT);
    }

    @Override
    public Schema getSchema() {
        return Indexbot.INDEXBOT;
    }

    @Override
    public UniqueKey<ConstantRecord> getPrimaryKey() {
        return Keys.KEY_CONSTANT_PRIMARY;
    }

    @Override
    public List<UniqueKey<ConstantRecord>> getKeys() {
        return Arrays.<UniqueKey<ConstantRecord>>asList(Keys.KEY_CONSTANT_PRIMARY);
    }

    @Override
    public Constant as(String alias) {
        return new Constant(DSL.name(alias), this);
    }

    @Override
    public Constant as(Name alias) {
        return new Constant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Constant rename(String name) {
        return new Constant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Constant rename(Name name) {
        return new Constant(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}

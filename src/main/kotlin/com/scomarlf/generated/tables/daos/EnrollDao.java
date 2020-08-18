/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.daos;


import com.scomarlf.generated.tables.Enroll;
import com.scomarlf.generated.tables.records.EnrollRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnrollDao extends DAOImpl<EnrollRecord, com.scomarlf.generated.tables.pojos.Enroll, String> {

    /**
     * Create a new EnrollDao without any configuration
     */
    public EnrollDao() {
        super(Enroll.ENROLL, com.scomarlf.generated.tables.pojos.Enroll.class);
    }

    /**
     * Create a new EnrollDao with an attached configuration
     */
    public EnrollDao(Configuration configuration) {
        super(Enroll.ENROLL, com.scomarlf.generated.tables.pojos.Enroll.class, configuration);
    }

    @Override
    public String getId(com.scomarlf.generated.tables.pojos.Enroll object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Enroll.ENROLL.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchById(String... values) {
        return fetch(Enroll.ENROLL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scomarlf.generated.tables.pojos.Enroll fetchOneById(String value) {
        return fetchOne(Enroll.ENROLL.ID, value);
    }

    /**
     * Fetch records that have <code>recordId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchRangeOfRecordid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Enroll.ENROLL.RECORDID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>recordId IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchByRecordid(Long... values) {
        return fetch(Enroll.ENROLL.RECORDID, values);
    }

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchRangeOfStatus(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Enroll.ENROLL.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchByStatus(Boolean... values) {
        return fetch(Enroll.ENROLL.STATUS, values);
    }

    /**
     * Fetch records that have <code>createUser BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchRangeOfCreateuser(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Enroll.ENROLL.CREATEUSER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>createUser IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchByCreateuser(Long... values) {
        return fetch(Enroll.ENROLL.CREATEUSER, values);
    }

    /**
     * Fetch records that have <code>createTime BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchRangeOfCreatetime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Enroll.ENROLL.CREATETIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>createTime IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Enroll> fetchByCreatetime(LocalDateTime... values) {
        return fetch(Enroll.ENROLL.CREATETIME, values);
    }
}

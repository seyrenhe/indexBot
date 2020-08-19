/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.daos;


import com.scomarlf.generated.tables.Ecology;
import com.scomarlf.generated.tables.records.EcologyRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EcologyDao extends DAOImpl<EcologyRecord, com.scomarlf.generated.tables.pojos.Ecology, String> {

    /**
     * Create a new EcologyDao without any configuration
     */
    public EcologyDao() {
        super(Ecology.ECOLOGY, com.scomarlf.generated.tables.pojos.Ecology.class);
    }

    /**
     * Create a new EcologyDao with an attached configuration
     */
    public EcologyDao(Configuration configuration) {
        super(Ecology.ECOLOGY, com.scomarlf.generated.tables.pojos.Ecology.class, configuration);
    }

    @Override
    public String getId(com.scomarlf.generated.tables.pojos.Ecology object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Ecology.ECOLOGY.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchById(String... values) {
        return fetch(Ecology.ECOLOGY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scomarlf.generated.tables.pojos.Ecology fetchOneById(String value) {
        return fetchOne(Ecology.ECOLOGY.ID, value);
    }

    /**
     * Fetch records that have <code>chatId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchRangeOfChatid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Ecology.ECOLOGY.CHATID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>chatId IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchByChatid(Long... values) {
        return fetch(Ecology.ECOLOGY.CHATID, values);
    }

    /**
     * Fetch records that have <code>username BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchRangeOfUsername(String lowerInclusive, String upperInclusive) {
        return fetchRange(Ecology.ECOLOGY.USERNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchByUsername(String... values) {
        return fetch(Ecology.ECOLOGY.USERNAME, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(Ecology.ECOLOGY.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.scomarlf.generated.tables.pojos.Ecology> fetchByDescription(String... values) {
        return fetch(Ecology.ECOLOGY.DESCRIPTION, values);
    }
}

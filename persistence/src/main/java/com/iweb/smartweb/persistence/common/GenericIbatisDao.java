package com.iweb.smartweb.persistence.common;

import com.iweb.smartweb.commons.exception.DaoException;
import com.iweb.smartweb.persistence.dao.GenericDao;
import com.iweb.smartweb.persistence.dao.help.DynamicSqlParameter;
import com.iweb.smartweb.persistence.dao.help.PaginationResult;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.util.ClassUtils;

import java.io.Serializable;
import java.util.List;


/**
 * MyBatis DAO层泛型基类，实现了基本的DAO功能
 *
 * @author zhangls
 * @since 0.1
 * @param <T>
 *            实体类
 * @param <PK>
 *            主键类，必须实现Serializable接口
 */
public abstract class GenericIbatisDao<T, PK extends Serializable> extends SqlSessionDaoSupport implements GenericDao<T, PK> {

    // sqlmap.xml定义文件中对应的sqlid
    public static final String SQLID_INSERT = "insert";
    public static final String SQLID_UPDATE = "update";
    public static final String SQLID_UPDATE_PARAM = "updateParam";
    public static final String SQLID_DELETE = "delete";
    public static final String SQLID_DELETE_PARAM = "deleteParam";
    public static final String SQLID_TRUNCATE = "truncate";
    public static final String SQLID_SELECT = "select";
    public static final String SQLID_SELECT_PK = "selectPk";
    public static final String SQLID_SELECT_PARAM = "selectParam";
    public static final String SQLID_SELECT_FK = "selectFk";
    public static final String SQLID_COUNT = "count";
    public static final String SQLID_COUNT_PARAM = "countParam";

    public T t;

    public String sqlmapNamespace = StringUtils.uncapitalize(ClassUtils.getShortName(t.getClass()));

    /**
     * 数据库方言，缺省为MYSQL
     */
    @Getter
    @Setter
    private String dbDialect = "MYSQL";//MYSQL和ORACLE

    /**
     * 查询所有记录数
     * @return
     */
    public int count() {
        Integer count = (Integer) getSqlSession().selectOne(sqlmapNamespace + "." + SQLID_COUNT);
        return count.intValue();
    }

    /**
     * 有条件查询所有记录数
     * @param param 查询条件参数，包括WHERE条件（其他参数内容不起作用）。此参数设置为null，则相当于count()
     * @return
     */
    public int count(DynamicSqlParameter param) {
        Integer count = (Integer) getSqlSession().selectOne(sqlmapNamespace + "." + SQLID_COUNT_PARAM, param);
        return count.intValue();
    }


    public int delete(PK primaryKey) {
        return getSqlSession().delete(sqlmapNamespace + "." + SQLID_DELETE, primaryKey);
    }

    public int delete(DynamicSqlParameter param) {
        int rows = getSqlSession().delete(sqlmapNamespace + "." + SQLID_DELETE_PARAM, param);
        return rows;
    }

    public int truncate() {
        int rows = getSqlSession().delete(sqlmapNamespace + "." + SQLID_TRUNCATE);
        return rows;
    }

    public T get(PK primaryKey) {
        return (T) getSqlSession().selectOne(sqlmapNamespace + "." + SQLID_SELECT_PK, primaryKey);
    }

    public void insert(T entity) {
        getSqlSession().insert(sqlmapNamespace + "." + SQLID_INSERT, entity);
    }

    public T load(PK primaryKey) throws DaoException {
        Object o = getSqlSession().selectOne(sqlmapNamespace + "." + SQLID_SELECT_PK, primaryKey);
        if (o == null)
            throw new DaoException("数据查询异常：无法查询出主键数据");
        return (T) o;
    }

    public List<T> select() {
        return getSqlSession().selectList(sqlmapNamespace + "." + SQLID_SELECT);
    }

    public List<T> select(DynamicSqlParameter param) {
        return getSqlSession().selectList(sqlmapNamespace + "." + SQLID_SELECT_PARAM, param);
    }

    public PaginationResult<T> selectPagination(DynamicSqlParameter param) {
        if (param != null)
            param.setDbDialect(dbDialect);

        PaginationResult<T> result = new PaginationResult<T>(1);
        int count = count(param);
        result.setTotal(count);
        if (count > 0) {
            List<T> data = getSqlSession().selectList(sqlmapNamespace + "." + SQLID_SELECT_PARAM, param);
            result.setData(data);
        }

        return result;
    }

    public List<T> selectFk(DynamicSqlParameter param) {
        return getSqlSession().selectList(sqlmapNamespace + "." + SQLID_SELECT_FK, param);
    }

    public PaginationResult<T> selectFkPagination(DynamicSqlParameter param) {
        if (param != null)
            param.setDbDialect(dbDialect);
        PaginationResult<T> result = new PaginationResult<T>(1);
        int count = count(param);
        result.setTotal(count);
        if (count > 0) {
            List<T> data = getSqlSession().selectList(sqlmapNamespace + "." + SQLID_SELECT_FK, param);
            result.setData(data);
        }

        return result;
    }

    public int update(T entity) {
        return getSqlSession().update(sqlmapNamespace + "." + SQLID_UPDATE, entity);
    }

    public int update(DynamicSqlParameter param) {
        return getSqlSession().update(sqlmapNamespace + "." + SQLID_UPDATE_PARAM, param);
    }

    public int batchInsert(final List<T> list){
        return getSqlSession().insert(sqlmapNamespace + "." + SQLID_INSERT, list);
    }

    public int batchUpdate(final List<T> list){
        return getSqlSession().update(sqlmapNamespace + "." + SQLID_UPDATE, list);
    }

    public int batchDelete(final List<PK> list){
        return getSqlSession().delete(sqlmapNamespace + "." + SQLID_DELETE, list);
    }
}
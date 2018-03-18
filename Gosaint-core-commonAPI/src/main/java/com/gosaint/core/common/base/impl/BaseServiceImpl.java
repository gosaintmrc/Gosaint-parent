package com.gosaint.core.common.base.impl;

import java.util.List;

import com.gosaint.core.common.base.BaseMapper;
import com.gosaint.core.common.base.IBaseService;
import com.gosaint.core.query.BaseQuery;
import com.gosaint.core.utils.Page;

/**
 * @Authgor: gosaint
 * @Description:抽象类
 * @Date Created in 15:11 2018/3/18
 * @Modified By:
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    protected abstract BaseMapper<T> getMapper();

    public void save(final T o) {
        getMapper().save(o);
    }

    public void savePart(final T o) {
        getMapper().savePart(o);
    }

    public void delete(final Long id) {
        getMapper().delete(id);
    }

    public void update(final T o) {
        getMapper().update(o);
    }

    public void updatePart(final T o) {
        getMapper().updatePart(o);
    }

    public T get(final Long id) {
        return getMapper().get(id);
    }

    public int queryTotal(final BaseQuery query) {
        return getMapper().queryTotal(query);
    }

    public List<T> query(final BaseQuery query) {
        return getMapper().query(query);
    }

    public Page<T> queryPage(final BaseQuery query) {
        final List<T> rows=this.query(query);
        final int total=this.queryTotal(query);
        return new Page<T>(rows,total,query);
    }
}

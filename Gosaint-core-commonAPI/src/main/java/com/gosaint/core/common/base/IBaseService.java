package com.gosaint.core.common.base;

import java.util.List;

import com.gosaint.core.query.BaseQuery;
import com.gosaint.core.utils.Page;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 14:59 2018/3/18
 * @Modified By:
 */
public interface IBaseService<T> {
    void save(T o);
    void savePart(T o);
    void delete(Long id);
    void update(T o);
    void updatePart(T o);

    T get(Long id);

    int queryTotal(BaseQuery query);
    List<T> query(BaseQuery query);
    Page<T> queryPage(BaseQuery query);

}

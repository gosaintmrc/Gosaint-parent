package com.gosaint.service.impl;

import java.util.List;

import com.gosaint.core.query.BaseQuery;
import com.gosaint.core.utils.Page;
import com.gosaint.domain.User;
import com.gosaint.service.IUserService;

import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:测试服务
 * @Date Created in 21:38 2018/3/19
 * @Modified By:
 */
@Service
public class UserServiceImpl implements IUserService {
    public void save(final User o) {

    }

    public void savePart(final User o) {

    }

    public void delete(final Long id) {

    }

    public void update(final User o) {

    }

    public void updatePart(final User o) {

    }

    public User get(final Long id) {
        return null;
    }

    public int queryTotal(final BaseQuery query) {
        return 0;
    }

    public List<User> query(final BaseQuery query) {
        return null;
    }

    public Page<User> queryPage(final BaseQuery query) {
        return null;
    }
}
package com.gosaint.core.mapper;

import com.gosaint.core.common.base.BaseMapper;
import com.gosaint.domain.User;

/**
 * @Authgor: gosaint
 * @Description:测试mapper
 * @Date Created in 19:57 2018/3/17
 * @Modified By:
 */
public interface UserMapper extends BaseMapper<User>{
    /** 查询一个用户*/
    User findEmployeeById(Long id);
}

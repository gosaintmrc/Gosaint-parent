package com.gosaint.daotest;

import javax.annotation.Resource;

import com.gosaint.core.mapper.UserMapper;
import com.gosaint.domain.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 20:04 2018/3/17
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class DaoTest {

    @Autowired
    private UserMapper userMapper ;

    @Test
    public  void testDao(){
        User byId = userMapper.findEmployeeById(1L);
        System.out.println(byId);
    }
}

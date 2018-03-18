package com.gosaint.domain;

import java.io.Serializable;

/**
 * @Authgor: gosaint
 * @Description:测试类
 * @Date Created in 19:37 2018/3/17
 * @Modified By:
 */
public class User implements Serializable{
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

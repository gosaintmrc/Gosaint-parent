package com.gosaint.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 17:26 2018/3/18
 * @Modified By:
 */
public class Product implements Serializable{
    private Long id;//商品id
    private Date createTime;//商品创建时间
    private Date updateTime;//商品更新时间
    private String name;//商品名称
    private String subName;//商品副名称

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(final String subName) {
        this.subName = subName;
    }

    @Override public String toString() {
        return "Product{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", name='" + name + '\'' +
                ", subName='" + subName + '\'' +
                '}';
    }
}

package com.gosaint.core.query;

/**
 * @Authgor: gosaint
 * @Description:公共的查询对象
 * @Date Created in 14:50 2018/3/18
 * @Modified By:
 */
public class BaseQuery {
    /** 排序字段*/
    public static final String ASC = "asc";
    // 每页返回行数
    private int rows = 10;
    // 当前页码,默认是第一页
    private int page = 1;
    // 排序列名
    private String sort;
    // 排序顺序
    private String order = ASC;
    /**
     * 获取数据的起始位置
     * @return 获取分页查询的起始位置
     */
    public int getStart() {
        return (page - 1) * rows;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(final int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(final int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(final String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(final String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "BaseQuery{" +
                "rows=" + rows +
                ", page=" + page +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}

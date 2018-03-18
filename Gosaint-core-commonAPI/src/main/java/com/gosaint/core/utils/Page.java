package com.gosaint.core.utils;

import java.util.List;

import com.gosaint.core.query.BaseQuery;

/**
 * @Authgor: gosaint
 * @Description:分页对象
 * @Date Created in 15:00 2018/3/18
 * @Modified By:
 */
public class Page<T> {
    //当前页的数据
    private List<T> rows;
    //总的记录数
    private int total = 0;
    //当前第几页
    private int curPage = 1;
    //每页多少条数据，分页大小
    private int pageSize = 10;

    public Page(){
    }

    public Page(final List<T> rows, final int total, BaseQuery baseQuery) {
        this.rows = rows;
        this.total = total;
        this.curPage = baseQuery.getPage();
        /** 每一页返回的数据条数！*/
        this.pageSize=baseQuery.getRows();
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(final List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(final int total) {
        this.total = total;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(final int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    @Override public String toString() {
        return "Page{" +
                "rows=" + rows +
                ", total=" + total +
                ", curPage=" + curPage +
                ", pageSize=" + pageSize +
                '}';
    }
}

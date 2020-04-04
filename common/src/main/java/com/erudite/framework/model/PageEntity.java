package com.erudite.framework.model;

import java.util.List;

public class PageEntity<T> {
    private int pageNo;
    private int pageSize;
    private long total;
    private List<T> list;

    public PageEntity() {
    }

    public PageEntity(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public PageEntity(int total, List<T> list) {
        this.total = total;
        this.list = list;
    }

    public PageEntity(int pageNo, int pageSize, int total, List<T> list) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

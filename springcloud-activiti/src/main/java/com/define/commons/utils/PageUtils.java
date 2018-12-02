package com.define.commons.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 流程列表分页
 *
 * @Author: Lea
 * @Date: 2018/11/27 9:56
 */
public class PageUtils implements Serializable {
    private static final long serialVersionUID = 1L;
    private int total;
    private List<?> rows;

    public PageUtils(List<?> list, int total) {
        this.rows = list;
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return this.rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}

package com.galaxy.entity;

public class Pages {
    private int start;
    private int pageSize;

    public Pages() {
    }

    public Pages(int start, int pageSize) {
        this.start = start;
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "start=" + start +
                ", pageSize=" + pageSize +
                '}';
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

package com.util;

import java.util.HashMap;
import java.util.List;

public class PageModel<T> {
    //总页数
    private int sumPage;
    //总条数
    private int countSize;
    //每页条数
    private int pageSize;
    //当前页数
    private int nowPage;

    private HashMap<String,Object> map;
    private List<T> list;

    public int getSumPage() {
        return sumPage;
    }

    public void setSumPage(int sumPage) {
        this.sumPage = sumPage;
        this.sumPage=countSize/pageSize;
        if(countSize%pageSize!=0){
            sumPage++;
        }
    }

    public int getCountSize() {
        return countSize;
    }

    public void setCountSize(int countSize) {
        this.countSize = countSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public HashMap<String, Object> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Object> map) {
        this.map = map;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

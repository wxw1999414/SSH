package com.actions;

import com.dao.PageDao;
import com.opensymphony.xwork2.ActionContext;
import com.util.PageModel;

import javax.servlet.ServletContext;

public class PageAction {
    private PageModel nowPage;
    public String queryPage(){
        PageDao fd=new PageDao();
        PageModel pm=new PageModel();
        fd.queryStudentPage(pm);
        //设置每页条数
        pm.setPageSize(nowPage.getPageSize());
        //当前页
        pm.setNowPage(nowPage.getNowPage());
        pm=fd.queryStudentPage(pm);
        ActionContext.getContext().put("pm",pm);
        return "pageFind";
    }

    public PageModel getNowPage() {
        return nowPage;
    }

    public void setNowPage(PageModel nowPage) {
        this.nowPage = nowPage;
    }
}

package com.dao;

import com.entity.Student;
import com.util.PageModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class PageDao {
    /**
     * 查询总条数
     * @return
     */
    @Test
    public int countSize(){
        Configuration cfg=new Configuration().configure();
        Session session=cfg.buildSessionFactory().openSession();
        Transaction ts=session.beginTransaction();
        Query query=session.createQuery("select count(*) from Student ");
        int count=(int)query.uniqueResult();
        ts.commit();
        session.close();
        System.out.println(count);
        return count;
    }

    /**
     * 查询数据
     * @return
     */
    public List findPage(){
        PageModel pageModel=new PageModel();
        Configuration cfg=new Configuration().configure();
        Session session=cfg.buildSessionFactory().openSession();
        Transaction ts=session.beginTransaction();
        Query query=session.createQuery("from Student ");
        query.setFirstResult((pageModel.getSumPage()-1)*pageModel.getPageSize());
        query.setMaxResults(pageModel.getPageSize());
        List<Student> list=query.list();
        return  list;
    }

    /**
     * 调用上面两个方法
     */

    public PageModel<Student> queryStudentPage(PageModel<Student> pm){
        //通过参数设置分页对象
        pm.setCountSize(this.countSize());
        //查询当前分页数据
        List<Student> pageList = this.findPage();
        pm.setList(pageList);
        return pm;
    }

}

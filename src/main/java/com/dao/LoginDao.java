package com.dao;

import com.entity.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



/**
 * @author William
 */
public class LoginDao {

//    public static void main(String[] args) {
//        LoginDao lg=new LoginDao();
//        lg.login("123","123456");
//    }
    public Root login(String root,String pwd){
        Configuration cfg=new Configuration().configure();
        Session session=cfg.buildSessionFactory().openSession();
        Transaction ts=session.beginTransaction();
        Query query=session.createQuery("from Root  where root=?1 and pwd=?2 ");
        query.setParameter(1,root);
        query.setParameter(2,pwd);
        Root rt= (Root) query.uniqueResult();
        ts.commit();
        session.close();
        System.out.println(rt.toString());
        return rt;
    }
}

package com.actions;

import com.dao.LoginDao;

import com.entity.Root;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private Root root;

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    public String login(){
        System.out.println("进入方法");
        String root= getRoot().getRoot();
        String pwd=getRoot().getPwd();
        LoginDao loginDao=new LoginDao();
        Root rt=loginDao.login(root,pwd);
        System.out.println(rt.toString());
        if(rt!=null){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
}

package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Root {
    private Integer id;
    private String root;
    private String pwd;

    public Root() {

    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "root")
    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    @Basic
    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Root root1 = (Root) o;

        if (id != null ? !id.equals(root1.id) : root1.id != null) {
            return false;
        }
        if (root != null ? !root.equals(root1.root) : root1.root != null) {
            return false;
        }
        if (pwd != null ? !pwd.equals(root1.pwd) : root1.pwd != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (root != null ? root.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }

    public Root(String root, String pwd) {
        this.root = root;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Root{" +
                "id=" + id +
                ", root='" + root + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

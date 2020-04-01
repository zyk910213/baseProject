package com.erudite.framework.model;

import java.util.Date;

public class BaseEntity {

    private String id;//实体主键
    private Date ctme;//创建时间
    private Date mtime;//修改时间
    private int statusFlag;//状态标识
//    private User createUser;//创建人
//    private User modifyUser;//修改人


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCtme() {
        return ctme;
    }

    public void setCtme(Date ctme) {
        this.ctme = ctme;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public int getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(int statusFlag) {
        this.statusFlag = statusFlag;
    }
}

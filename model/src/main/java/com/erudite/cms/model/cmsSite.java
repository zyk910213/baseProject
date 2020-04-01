package com.erudite.cms.model;

import com.erudite.framework.model.BaseEntity;

public class cmsSite extends BaseEntity {

    private String siteName;//站点名称
    private String vPath;//访问路径
    private String description;//描述
    private String status;//站点状态

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getvPath() {
        return vPath;
    }

    public void setvPath(String vPath) {
        this.vPath = vPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.erudite.cms.model;

import com.erudite.framework.model.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cms_site")
public class CmsSite extends BaseEntity {

    private String siteName;//站点名称
    private String siteAlise;// 站点别名
    private String vPath;//访问路径
    private String description;//描述
    private String status;//站点状态

    private int sort;//站点排序，按照升序进行排列，若排序号一致则按照站点别名排序
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

    public String getSiteAlise() {
        return siteAlise;
    }

    public void setSiteAlise(String siteAlise) {
        this.siteAlise = siteAlise;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}

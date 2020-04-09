package com.erudite.cms.model;

import com.erudite.framework.model.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cms_site")
public class CmsNav extends BaseEntity {
    private String siteId;
    private String siteName;
    private NavInfo nav_info;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public NavInfo getNav_info() {
        return nav_info;
    }

    public void setNav_info(NavInfo nav_info) {
        this.nav_info = nav_info;
    }
}

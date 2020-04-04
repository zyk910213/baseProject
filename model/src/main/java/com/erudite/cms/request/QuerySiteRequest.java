package com.erudite.cms.request;

import com.erudite.cms.model.CmsSite;
import com.erudite.framework.model.PageEntity;

public class QuerySiteRequest extends PageEntity<CmsSite> {
    private String siteName;
    private String siteAlise;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteAlise() {
        return siteAlise;
    }

    public void setSiteAlise(String siteAlise) {
        this.siteAlise = siteAlise;
    }
}

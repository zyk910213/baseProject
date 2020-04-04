package com.erudite.api.cms;

import com.erudite.cms.model.CmsSite;
import com.erudite.cms.request.QuerySiteRequest;
import com.erudite.cms.response.CmsSiteResponseResult;
import com.erudite.framework.model.response.QueryResponseResult;
import com.erudite.framework.model.response.ResponseResult;

public interface cmsApi {

    public ResponseResult getContentsByName();

    public CmsSiteResponseResult add(CmsSite site);

    public CmsSiteResponseResult edit(String id,CmsSite site);

    public ResponseResult delete(String id);

    public QueryResponseResult findList(QuerySiteRequest querySite);

    public CmsSiteResponseResult get(String id);
}

package com.erudite.cms.response;

import com.erudite.cms.model.CmsPage;
import com.erudite.framework.model.response.ResponseResult;
import com.erudite.framework.model.response.ResultCode;

public class CmsResponseResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsResponseResult(ResultCode resultCode,CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}

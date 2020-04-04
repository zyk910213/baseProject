package com.erudite.cms.response;

import com.erudite.cms.model.CmsSite;
import com.erudite.framework.model.response.ResponseResult;
import com.erudite.framework.model.response.ResultCode;

public class CmsSiteResponseResult extends ResponseResult {

    private CmsSite cmsSite;

    public CmsSiteResponseResult(ResultCode resultCode,CmsSite cmsSite) {
        super(resultCode);
        this.cmsSite = cmsSite;
    }

}

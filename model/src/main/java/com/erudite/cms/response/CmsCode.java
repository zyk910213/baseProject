package com.erudite.cms.response;

import com.erudite.framework.model.response.ResultCode;

public enum CmsCode implements ResultCode {
    CMS_PAGENAME_EXIST("CMS_1000",false,"页面名称已存在！");


    private String code;
    private boolean success;
    private String message;

    private CmsCode(String code, boolean success, String message){
        this.code = code;
        this.success = success;
        this.message = message;
    }
    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public boolean success() {
        return success;
    }
}

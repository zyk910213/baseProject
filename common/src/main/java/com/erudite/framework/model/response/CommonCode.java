package com.erudite.framework.model.response;

public enum CommonCode implements ResultCode {

    SUCCESS("1000",true,"操作成功！"),
    FAIL("2000",false,"操作失败！"),
    INVALID_PARAMS("2001",false,"参数非法"),
    UNAUTHORISE("2002",false,"权限不足，无权操作！"),
    SEVER_ERROR("9999",false,"服务器内部错误，请联系管理员！");

    private String code;
    private String message;
    private boolean success;

    private CommonCode(String code,boolean success,String message){
        this.code = code;
        this.success = success;
        this.message = message;
    }

    public String code() {
        return code;
    }

    public String message() {
        return message;
    }

    public boolean success() {
        return success;
    }
}

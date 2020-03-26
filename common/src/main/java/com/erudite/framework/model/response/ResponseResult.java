package com.erudite.framework.model.response;

public class ResponseResult {

    private String code;
    private String message;
    private boolean success;

    public ResponseResult(ResultCode resultCode){
        this.code = resultCode.code();
        this.success = resultCode.success();
        this.message = resultCode.message();
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(CommonCode.SUCCESS);
    }

    public static ResponseResult FAIL(){
        return new ResponseResult(CommonCode.FAIL);
    }
}

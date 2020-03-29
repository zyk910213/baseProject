package com.erudite.framework.model.response;

public interface ResultCode {
    //返回结果编码
    String code();
    //返回结果提示信息
    String message();
    //返回结果状态，true为成功，false为失败
    boolean success();

}

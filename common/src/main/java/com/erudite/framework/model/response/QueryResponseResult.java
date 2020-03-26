package com.erudite.framework.model.response;

public class QueryResponseResult extends ResponseResult {
    private QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){

        super(resultCode);
        this.queryResult = queryResult;
    }
}

package com.erudite.cms.controller;

import com.erudite.api.cms.cmsApi;
import com.erudite.cms.model.CmsSite;
import com.erudite.cms.request.QuerySiteRequest;
import com.erudite.cms.response.CmsSiteResponseResult;
import com.erudite.cms.service.CmsSiteService;
import com.erudite.framework.model.response.CommonCode;
import com.erudite.framework.model.response.QueryResponseResult;
import com.erudite.framework.model.response.QueryResult;
import com.erudite.framework.model.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cms/site")
public class CmsSiteController implements cmsApi {

    @Autowired
    private CmsSiteService cmsSiteService;

    @GetMapping("/getContentsByName")
    public ResponseResult getContentsByName() {
        System.out.println("--------------test------------------------");
        return null;
    }

    @Override
    @PostMapping("/add")
    public CmsSiteResponseResult add(@RequestBody CmsSite cmsSite){

        if(cmsSite==null){
            //非法参数异常
        }

        CmsSiteResponseResult cmsSiteResponseResult = cmsSiteService.add(cmsSite);
        return cmsSiteResponseResult;
    }

    @Override
    @PostMapping("/edit/{id}")
    public CmsSiteResponseResult edit(@PathVariable("id") String id, @RequestBody CmsSite site) {

        return null;
    }


    @Override
    @GetMapping("/delete/{id}")
    public ResponseResult delete(@PathVariable("id") String id) {
        ResponseResult responseResult = cmsSiteService.delete(id);
        return responseResult;
    }

    @Override
    @PostMapping("/list/{pageNo}/{pageSize}")
    public QueryResponseResult findList(@RequestBody QuerySiteRequest querySite) {

//        QueryResult queryResult = cmsSiteService.findList(querySite);
        QueryResponseResult queryResponseResult = cmsSiteService.findList(querySite);
        return queryResponseResult;
    }

    @Override
    @GetMapping("/get/{id}")
    public CmsSiteResponseResult get(@PathVariable("id")String id) {
        CmsSite cmsSite = cmsSiteService.get(id);
        CmsSiteResponseResult cmsSiteResponseResult = new CmsSiteResponseResult(CommonCode.SUCCESS,cmsSite);
        return cmsSiteResponseResult;
    }
}

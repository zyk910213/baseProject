package com.erudite.cms.controller;

import com.erudite.api.cms.cmsApi;
import com.erudite.framework.model.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cms")
public class CmsController implements cmsApi {
    @GetMapping("/getContentsByName")
    public ResponseResult getContentsByName() {
        System.out.println("--------------test------------------------");
        return null;
    }
}

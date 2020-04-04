package com.erudite.cms.service;

import com.erudite.cms.dao.CmsSiteRepository;
import com.erudite.cms.model.CmsSite;
import com.erudite.cms.request.QuerySiteRequest;
import com.erudite.cms.response.CmsSiteResponseResult;
import com.erudite.framework.model.response.CommonCode;
import com.erudite.framework.model.response.QueryResponseResult;
import com.erudite.framework.model.response.QueryResult;
import com.erudite.framework.model.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import java.util.List;
import java.util.Optional;

@Service
public class CmsSiteService {

    @Autowired
    private CmsSiteRepository cmsSiteRepository;

    public CmsSiteResponseResult add(CmsSite cmsSite){
        List<CmsSite> siteCheck = cmsSiteRepository.findBySiteName(cmsSite.getSiteName());

        if(siteCheck!=null&&siteCheck.size()>0){
            //站点名称已存在，创建失败
        }
        cmsSiteRepository.save(cmsSite);
        CmsSiteResponseResult cmsSiteResponseResult = new CmsSiteResponseResult(CommonCode.SUCCESS,cmsSite);
        return cmsSiteResponseResult;
    }


    public CmsSite get(String id) {
        Optional<CmsSite> optional = cmsSiteRepository.findById(id);
        if(optional.isPresent()){
            CmsSite cmsSite = optional.get();
            return cmsSite;
        }
        return null;
    }

    public ResponseResult delete(String id) {
        Optional<CmsSite> optional = cmsSiteRepository.findById(id);
        if(optional.isPresent()){
            cmsSiteRepository.deleteById(id);
            return new ResponseResult(CommonCode.SUCCESS);
        }
        return new ResponseResult(CommonCode.FAIL);
    }

    public QueryResponseResult findList(QuerySiteRequest querySite) {
        if(querySite!=null){
            querySite = new QuerySiteRequest();
        }

        CmsSite cmsSite = new CmsSite();
        if(StringUtils.isNotBlank(querySite.getSiteAlise())){
            cmsSite.setSiteAlise(querySite.getSiteAlise());
        }
        if(StringUtils.isNotBlank(querySite.getSiteName())){
            cmsSite.setSiteName(querySite.getSiteName());
        }

        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("siteAlise", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("siteName", ExampleMatcher.GenericPropertyMatchers.contains());
        Example<CmsSite> example = Example.of(cmsSite,exampleMatcher);
        Pageable pageable = PageRequest.of(querySite.getPageNo(),querySite.getPageSize(),new Sort(Sort.Direction.ASC,"siteName","siteAlise"));
        Page<CmsSite> all = cmsSiteRepository.findAll(example,pageable);
        QueryResult result = new QueryResult();
        result.setTotal(all.getTotalElements());
        result.setPageNo(all.getPageable().getPageNumber());
        result.setList(all.getContent());
        result.setPageSize(all.getPageable().getPageSize());
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,result);
        return queryResponseResult;
    }
}

package com.erudite.cms.dao;

import com.erudite.cms.model.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {

    public List<CmsSite> findBySiteName(String siteName);
}

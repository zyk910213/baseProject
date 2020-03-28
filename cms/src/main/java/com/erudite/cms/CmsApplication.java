package com.erudite.cms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.erudite.model"})
@ComponentScan(basePackages = {"com.erudite.api"})
@ComponentScan(basePackages = {"com.erudite.cms"})
public class CmsApplication {
    public static void main(String args[]){
        SpringApplication.run(CmsApplication.class,args);
    }
}

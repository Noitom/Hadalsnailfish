package com.shiziyu.official.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @program: project
 * @description: 狮子鱼官网启动类
 * @author: zhouyuj
 * @create: 2021-12-06 16:33
 **/

@SpringBootApplication
public class OfficialWebsiteApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OfficialWebsiteApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(OfficialWebsiteApplication.class);
    }
}

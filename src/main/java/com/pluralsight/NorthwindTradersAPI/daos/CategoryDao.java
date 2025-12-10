package com.pluralsight.NorthwindTradersAPI.daos;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CategoryDao {

    private BasicDataSource basicDataSource;

    @Autowired
    public CategoryDao(@Value("${datasource.url}") String url,
                      @Value("${datasource.username}") String user,
                      @Value("${DB_PASSWORD}") String password) {
        BasicDataSource source = new BasicDataSource();
        source.setUrl(url);
        source.setUsername(user);
        source.setPassword(password);
        this.basicDataSource = source;
    }
}

package com.spring5.sfgpetclinic.dataSourceConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:dataSource.properties")
public class FakeDataSourceConfig {

    @Value("${user}")
    private String user;
    @Value("${pass}")
    private String pass;
    @Value("${url}")
    private String url;

    @Bean
    public DataSourceFake dataSourceFake(){
        DataSourceFake dataSource = new DataSourceFake();
        dataSource.setUser(user);
        dataSource.setPass(pass);
        dataSource.setUrl(url);
        return dataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}

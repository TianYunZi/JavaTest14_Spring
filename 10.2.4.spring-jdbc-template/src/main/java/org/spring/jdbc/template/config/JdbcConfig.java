package org.spring.jdbc.template.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean("dataSource")
    @Profile("local")
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.232.130:3306/spring4inaction");
        dataSource.setUsername("root");
        dataSource.setPassword("abc123##");
        dataSource.setInitialSize(5);
        dataSource.setMaxTotal(10);
        return dataSource;
    }

    @Bean("jdbcTemplate")
    @Profile("local")
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate();
    }
}

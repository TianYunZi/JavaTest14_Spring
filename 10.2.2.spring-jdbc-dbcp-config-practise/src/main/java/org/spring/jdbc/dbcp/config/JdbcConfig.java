package org.spring.jdbc.dbcp.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
public class JdbcConfig {

    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/spitter");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setInitialSize(5);
        dataSource.setMaxTotal(10);
        return dataSource;
    }
}

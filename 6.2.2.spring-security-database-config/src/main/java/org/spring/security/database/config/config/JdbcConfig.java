package org.spring.security.database.config.config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean("dataSource")
    public DataSource getMysqlDataSource() {
        // TODO: 2018/3/16 连接mysql详细配置略 
        return new MysqlDataSource();
    }
}

package org.spring.jdbc.jndi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

@Configuration
public class JndiConfig {

    @Bean
    public JndiObjectFactoryBean dataSource(){
        JndiObjectFactoryBean objectFactoryBean=new JndiObjectFactoryBean();
        objectFactoryBean.setJndiName("jdbc/SpittrDS");
        objectFactoryBean.setResourceRef(true);
        objectFactoryBean.setProxyInterface(DataSource.class);
        return objectFactoryBean;
    }
}

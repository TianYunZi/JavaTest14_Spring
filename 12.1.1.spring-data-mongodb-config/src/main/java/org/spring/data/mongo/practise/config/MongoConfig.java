package org.spring.data.mongo.practise.config;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "org.spring.data.mongo.practise.repository")//启用mongodb的repository功能
public class MongoConfig {

    @Bean
    public Mongo mongo() throws Exception {
        MongoClientFactoryBean factoryBean = new MongoClientFactoryBean();
        factoryBean.setHost("192.168.232.130");
        factoryBean.setPort(27017);
        return factoryBean.getObject();
    }

    @Bean
    public MongoOperations mongoTemplate(Mongo mongo) {
        return new MongoTemplate(mongo, "OrdersDB");
    }
}

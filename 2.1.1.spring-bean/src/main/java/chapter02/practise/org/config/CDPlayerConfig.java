package chapter02.practise.org.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"chapter02.practise.org.model"})
public class CDPlayerConfig {
}

package org.spring.security.custome.practise.config;

import org.spring.security.custome.practise.repository.SpidderUserRepository;
import org.spring.security.custome.practise.security.SpidderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
@ComponentScan("org.spring.security.custome.practise.repository")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SpidderUserRepository spidderUserRepository;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(new SpidderUserService(spidderUserRepository));
    }
}

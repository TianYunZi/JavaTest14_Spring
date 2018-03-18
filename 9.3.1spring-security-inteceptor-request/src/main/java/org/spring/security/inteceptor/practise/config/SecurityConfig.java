package org.spring.security.inteceptor.practise.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/spitters/me").hasRole("SPITTER")
                .antMatchers(HttpMethod.POST, "spittles").hasRole("SPITTER")
                .anyRequest().permitAll()
                .and()
                .requiresChannel()
                .antMatchers("/spitters/form").requiresSecure();//需要HTTPS
    }
}

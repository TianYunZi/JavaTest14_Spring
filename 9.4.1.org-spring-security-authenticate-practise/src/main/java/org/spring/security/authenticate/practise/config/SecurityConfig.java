package org.spring.security.authenticate.practise.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()//启用默认登录项
                .and()
                .authorizeRequests()
                .antMatchers("/spitter/me").hasRole("SPITTER")
                .antMatchers(HttpMethod.POST, "/spittles")
                .access("hasRole('ROLE_SPITTER') and hasRole('ROLE_ADMIN')")
                .anyRequest().permitAll()
                .and()
                .requiresChannel().antMatchers("/spitter/form").requiresSecure();
    }
}

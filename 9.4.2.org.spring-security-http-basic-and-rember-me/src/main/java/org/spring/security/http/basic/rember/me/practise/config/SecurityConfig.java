package org.spring.security.http.basic.rember.me.practise.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/login")
                .and()
                .httpBasic()//启用httpbasic认证
                .realmName("Spitter")//指定域
                .and()
                .rememberMe()
                .tokenValiditySeconds(2419200)//记住四周
                .key("spitterKey")//私钥
                .and()
                .logout()
                .logoutSuccessUrl("/");//退出返回首页
    }
}

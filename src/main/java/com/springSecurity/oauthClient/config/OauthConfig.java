package com.springSecurity.oauthClient.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class OauthConfig extends WebSecurityConfigurerAdapter {
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http.antMatcher("/**")
	                .authorizeRequests()
	                .antMatchers("/", "/login**")
	                .permitAll()
	                .anyRequest()
	                .authenticated();

	    }
}

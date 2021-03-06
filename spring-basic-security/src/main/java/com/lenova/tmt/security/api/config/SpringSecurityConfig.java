package com.lenova.tmt.security.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("lenovo").password("lenovo123").roles("Admin");
		auth.inMemoryAuthentication().withUser("concentrix").password("concentrix123").roles("User");

	}

	// security for api
	/*
	 * protected void configure(HttpSecurity http)throws Exception{
	 * http.csrf().disable();
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * }
	 */

	// security based on url
	/*
	 * protected void configure(HttpSecurity http)throws Exception{
	 * http.csrf().disable();
	 * http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().
	 * httpBasic(); }
	 */

	// security based on Role
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("Admin").anyRequest().fullyAuthenticated().and()
				.httpBasic();

	}

	/*
	 * anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll(
	 * ) .and().logout().permitAll();
	 * 
	 */

	// pw enceyptedfrmate
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();

	}

}

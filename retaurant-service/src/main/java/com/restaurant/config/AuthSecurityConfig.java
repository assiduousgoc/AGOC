package com.restaurant.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/*Enable 'securedEnabled=true' when you using @Secured annotation instead of @PreAuthorise*/

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AuthSecurityConfig extends WebSecurityConfigurerAdapter {

	String[] UNSECURED = { "/food-express/bill-to", "/food-express/bill-to/*", "/food-express/billings",
			"/food-express/billings/*", "/food-express/chefs", "/food-express/chefs/*", "/food-express/customers",
			"/food-express/customers/*", "/food-express/departments", "/food-express/departments/*",
			"/food-express/discounts", "/food-express/discounts/*", "/food-express/employees",
			"/food-express/employees/*", "/food-express/food-classes", "/food-express/food-classes/*",
			"/food-express/food-items", "/food-express/food-items/*", "/food-express/food-types",
			"/food-express/food-types/*", "/food-express/menus", "/food-express/menus/*", "/food-express/orders",
			"/food-express/orders/*", "/food-express/order-details", "/food-express/order-details/*",
			"/food-express/order-statuses", "/food-express/order-statuses/*", "/food-express/order-tracks",
			"/food-express/order-tracks/*", "/food-express/payments", "/food-express/payments/*",
			"/food-express/payment-types", "/food-express/payment-types/*", "/food-express/preparings",
			"/food-express/preparings/*", "/food-express/restaurants", "/food-express/restaurants/*",
			"/food-express/restaurant-menus", "/food-express/restaurant-menus/*", "/food-express/ship-to",
			"/food-express/ship-to/*", "/food-express/statuses", "/food-express/statuses/*", "/food-express/stocks",
			"/food-express/stocks/*", "/v2/api-docs", "/configuration/**", "/swagger*/**", "/webjars/**" };

	String[] SECURED = { "/food-express/bill-to", "/food-express/bill-to/*", "/food-express/billings",
			"/food-express/billings/*", "/food-express/chefs", "/food-express/chefs/*", "/food-express/customers",
			"/food-express/customers/*", "/food-express/departments", "/food-express/departments/*",
			"/food-express/discounts", "/food-express/discounts/*", "/food-express/employees",
			"/food-express/employees/*", "/food-express/food-classes", "/food-express/food-classes/*",
			"/food-express/food-items", "/food-express/food-items/*", "/food-express/food-types",
			"/food-express/food-types/*", "/food-express/menus", "/food-express/menus/*", "/food-express/orders",
			"/food-express/orders/*", "/food-express/order-details", "/food-express/order-details/*",
			"/food-express/order-statuses", "/food-express/order-statuses/*", "/food-express/order-tracks",
			"/food-express/order-tracks/*", "/food-express/payments", "/food-express/payments/*",
			"/food-express/payment-types", "/food-express/payment-types/*", "/food-express/preparings",
			"/food-express/preparings/*", "/food-express/restaurants", "/food-express/restaurants/*",
			"/food-express/restaurant-menus", "/food-express/restaurant-menus/*", "/food-express/ship-to",
			"/food-express/ship-to/*", "/food-express/statuses", "/food-express/statuses/*", "/food-express/stocks",
			"/food-express/stocks/*" };

	private UserDetailsService user_service;

	private JwtAuthenticationEntryPoint auth_entry;

	public AuthSecurityConfig(UserDetailsService user_service, JwtAuthenticationEntryPoint auth_entry) {
		super();
		this.user_service = user_service;
		this.auth_entry = auth_entry;
	}

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Autowired
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(user_service).passwordEncoder(encoder());
	}

	@Bean
	public JwtAuthenticationFilter authenticationTokenFilterBean() {
		return new JwtAuthenticationFilter();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests().antMatchers(HttpMethod.POST, SECURED).authenticated()
				.antMatchers(HttpMethod.DELETE, SECURED).authenticated().antMatchers(HttpMethod.PATCH, SECURED)
				.authenticated().antMatchers(HttpMethod.PUT, SECURED).authenticated().anyRequest().permitAll().and()
				.exceptionHandling().authenticationEntryPoint(auth_entry).and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
	}

	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
}

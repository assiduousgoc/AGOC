package com.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import com.dcs.common.file.prop.CommonFileStorageProperties;
import com.dcs.common.file.prop.DownloadHost;
import com.dcs.common.model.SwaggerDesc;

import springfox.documentation.service.Contact;

/**
 * 
 * @author deepakdubey
 * @since 26 December 2019
 * @version 1.0
 */
@EnableJpaRepositories
@EnableTransactionManagement
@RefreshScope
@ComponentScan({ "com.authentication", "com.dcs.common" })
@EnableConfigurationProperties({ CommonFileStorageProperties.class, DownloadHost.class })
@SpringBootApplication
public class AuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServiceApplication.class, args);
	}

	@Bean
	public SwaggerDesc swaggerDesc() {
		return new SwaggerDesc("Authentication Server", "\"Authentication Server api for user interaction\"", "1.0.0",
				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0\"",
				new Contact("Deepak Dubey", "www.google.com", "deepak.k742@gmail.com"));
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

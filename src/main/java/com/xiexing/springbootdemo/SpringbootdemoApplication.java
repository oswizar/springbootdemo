package com.xiexing.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootdemoApplication {


//	@Bean
//	public RestTemplate createHttpsRestTemplate() {
//		return new RestTemplate();
//	}

	public static void main(String[] args) {

//		System.setProperty("mail.mime.splitlongparameters", "false");

		System.getProperties().setProperty("mail.mime.splitlongparameters", "false");

		SpringApplication.run(SpringbootdemoApplication.class, args);
		log.info("Service Started Successfully");
	}
}


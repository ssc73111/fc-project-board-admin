package com.fc.boardadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@ConfigurationPropertiesScan // config properties 파일 스캔
@SpringBootApplication
public class FcProjectAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FcProjectAdminApplication.class, args);
	}

}

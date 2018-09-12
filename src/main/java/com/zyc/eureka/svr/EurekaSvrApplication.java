package com.zyc.eureka.svr;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSvrApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaSvrApplication.class).web(WebApplicationType.SERVLET).run(args);
	}
}

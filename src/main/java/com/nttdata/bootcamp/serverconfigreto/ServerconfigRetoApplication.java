package com.nttdata.bootcamp.serverconfigreto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServerconfigRetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerconfigRetoApplication.class, args);
	}

}

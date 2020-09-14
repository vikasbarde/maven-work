package com.mvn.docker.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mvn.docker.jenkins.controller","com.mvn.docker.jenkins.service","com.mvn.docker.jenkins.dao"})
public class MavenDockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDockerJenkinsApplication.class, args);
	}

}

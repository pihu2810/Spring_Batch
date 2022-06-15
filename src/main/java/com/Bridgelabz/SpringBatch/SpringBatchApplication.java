package com.Bridgelabz.SpringBatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableBatchProcessing
@Configuration
public class SpringBatchApplication {



	public static void main(String[] args) {

		SpringApplication.run(SpringBatchApplication.class, args);

	}


}

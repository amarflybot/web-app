package com.amar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(final PersonRepository personRepository){
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				Arrays.asList("Amar","Vicky","Alka","Deepak").forEach(name -> {
					personRepository.save(new Person(name));
				});
				personRepository.findAll().forEach(person -> {
					System.out.println(person);
				});
			}
		};
	}
}

package com.vv.batch.writers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchWriterApplication implements CommandLineRunner {
	
	@Autowired
	private YamlWrapper wrapper;

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchWriterApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        wrapper.loadAsJavaBean("excel");
    }

}

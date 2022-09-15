package com.cliente.mongo;

import org.springframework.boot.SpringApplication;
/*
 * aqui se habilita que busque los repositorios en este paquete con la anotacion
 * EnableMongoRepositories 
 * y la anotacion Component Scan es para que funcionen los autowired , crear clases 
 * y scanee todas clases dentro de esas paqueterias
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.cliente.mongo.repository")
@ComponentScan("com.cliente.*")
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

}

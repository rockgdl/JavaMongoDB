package com.cliente.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cliente.mongo.entity.Student;
/*
 * se crea la interfaz de  la clase y se exteiend del repositorio de mongoRepository ,
 * los parametros siguientes son la clase que es tudiante y String (que es el tipo de dato
 * donde se tiene anotado la propiedad Id , la puse como String por eso es asi 
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	
	
	

}

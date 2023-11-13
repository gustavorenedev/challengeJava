package com.example.ChallengePorto.utils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Interface genérica para controladores (controllers) básicos
public interface BaseController<T, ID> {

	 // Método abstrato para obter o repositório JPA correspondente ao tipo T e ID
	 JpaRepository<T, ID> getRepository();
	
	 // Endpoint padrão para obter todos os registros do tipo T
	 @GetMapping
	 default List<T> findAll() {
	     return getRepository().findAll();
	 }
	
	 // Endpoint padrão para obter um registro do tipo T pelo ID
	 @GetMapping(value = "/{id}")
	 default T findById(@PathVariable ID id) {
	     return getRepository().findById(id).orElse(null);
	 }
}
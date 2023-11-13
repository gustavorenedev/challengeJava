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
        try {
            return getRepository().findAll();
        } catch (Exception e) {
            // Registre a exceção ou manipule-a conforme as necessidades da sua aplicação
            e.printStackTrace();
            return null; // Retorne null ou uma lista vazia conforme apropriado
        }
    }

    // Endpoint padrão para obter um registro do tipo T pelo ID
    @GetMapping(value = "/{id}")
    default ResponseEntity<T> findById(@PathVariable ID id) {
        try {
            T entity = getRepository().findById(id).orElse(null);
            if (entity != null) {
                return new ResponseEntity<>(entity, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            // Registre a exceção ou manipule-a conforme as necessidades da sua aplicação
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
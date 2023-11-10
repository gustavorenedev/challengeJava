package com.example.ChallengePorto.utils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseController<T, ID> {
    
    JpaRepository<T, ID> getRepository();

    @GetMapping
    default List<T> findAll() {
        return getRepository().findAll();
    }

    @GetMapping(value = "/{id}")
    default T findById(@PathVariable ID id) {
        return getRepository().findById(id).orElse(null);
    }

    @PostMapping
    default ResponseEntity<T> createEntity(@RequestBody T entity) {
        T storedEntity = getRepository().save(entity);
        return new ResponseEntity<>(storedEntity, HttpStatus.CREATED);
    }
}

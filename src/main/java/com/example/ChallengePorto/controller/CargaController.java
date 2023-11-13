package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.CargaRepository;
import com.example.ChallengePorto.model.vo.Carga;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/carga")
public class CargaController implements BaseController<Carga, Long> {

    @Autowired
    private CargaRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<Carga, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar uma nova carga
    @PostMapping
    public ResponseEntity<Carga> createCarga(@RequestBody Carga carga) {
        // Salva a carga no repositório
        Carga saveCarga = repository.save(carga);
        
        // Retorna a carga criada com o status HTTP 201 (Created)
        return new ResponseEntity<>(saveCarga, HttpStatus.CREATED);
    }
}

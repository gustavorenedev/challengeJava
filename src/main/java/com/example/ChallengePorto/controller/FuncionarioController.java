package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.FuncionarioRepository;
import com.example.ChallengePorto.model.vo.Funcionario;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController implements BaseController<Funcionario, Long> {

    @Autowired
    private FuncionarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<Funcionario, Long> getRepository() {
        return repository;
    }
    
    // Endpoint para criar um novo funcionário
    @PostMapping
    public ResponseEntity<Funcionario> createFuncionario(@RequestBody Funcionario funcionario) {
        // Salva o funcionário no repositório
        Funcionario saveFuncionario = repository.save(funcionario);
        // Retorna o funcionário criado com o status HTTP 201 (Created)
        return new ResponseEntity<>(saveFuncionario, HttpStatus.CREATED);
    }
}

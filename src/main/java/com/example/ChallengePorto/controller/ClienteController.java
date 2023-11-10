package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.bo.ClienteBO;
import com.example.ChallengePorto.model.dao.ClienteRepository;
import com.example.ChallengePorto.model.vo.Cliente;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/cliente")
public class ClienteController implements BaseController<Cliente, Long> {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteBO clienteBO;
    
    @Override
    public JpaRepository<Cliente, Long> getRepository() {
        return repository;
    }
    
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Cliente cliente) {
        String erro = clienteBO.validarCliente(cliente);
        if (erro == null) {
            repository.save(cliente);
            return ResponseEntity.ok("Cliente criado com sucesso!");
        } else {
            return ResponseEntity.badRequest().body(erro);
        }
    }

}

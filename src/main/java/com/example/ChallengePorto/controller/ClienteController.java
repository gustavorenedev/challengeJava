package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.ClienteRepository;
import com.example.ChallengePorto.model.vo.Cliente;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/cliente")
public class ClienteController implements BaseController<Cliente, Long> {

    @Autowired
    private ClienteRepository repository;

    @Override
    public JpaRepository<Cliente, Long> getRepository() {
        return repository;
    }
}

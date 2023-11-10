package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
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

    @Override
    public JpaRepository<Carga, Long> getRepository() {
        return repository;
    }
}


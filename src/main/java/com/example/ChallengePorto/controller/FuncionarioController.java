package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.FuncionarioRepository;
import com.example.ChallengePorto.model.vo.Funcionario;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController implements BaseController<Funcionario, Long>{

	@Autowired
    private FuncionarioRepository repository;

    @Override
    public JpaRepository<Funcionario, Long> getRepository() {
        return repository;
    }
}

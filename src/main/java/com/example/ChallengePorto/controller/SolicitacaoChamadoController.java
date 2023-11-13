package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.SolicitacaoChamadoRepository;
import com.example.ChallengePorto.model.vo.Funcionario;
import com.example.ChallengePorto.model.vo.SolicitacaoChamado;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoChamadoController implements BaseController<SolicitacaoChamado, Long>{
	@Autowired
    private SolicitacaoChamadoRepository repository;

    @Override
    public JpaRepository<SolicitacaoChamado, Long> getRepository() {
        return repository;
    }
    
    @PostMapping
    public ResponseEntity<SolicitacaoChamado> createSolicitacao(@RequestBody SolicitacaoChamado solicitacao) {
    	SolicitacaoChamado saveSolicitacao = repository.save(solicitacao);
        return new ResponseEntity<>(saveSolicitacao, HttpStatus.CREATED);
    }
}

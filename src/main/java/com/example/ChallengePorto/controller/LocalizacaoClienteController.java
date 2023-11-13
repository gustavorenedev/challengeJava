package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.LocalizacaoRepository;
import com.example.ChallengePorto.model.vo.Funcionario;
import com.example.ChallengePorto.model.vo.LocalizacaoCliente;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoClienteController implements BaseController<LocalizacaoCliente, Long> {
	@Autowired
    private LocalizacaoRepository repository;

    @Override
    public JpaRepository<LocalizacaoCliente, Long> getRepository() {
        return repository;
    }
    
    @PostMapping
    public ResponseEntity<LocalizacaoCliente> createLocalizacao(@RequestBody LocalizacaoCliente localizacao) {
    	LocalizacaoCliente saveLocalizacao = repository.save(localizacao);
        return new ResponseEntity<>(saveLocalizacao, HttpStatus.CREATED);
    }
}

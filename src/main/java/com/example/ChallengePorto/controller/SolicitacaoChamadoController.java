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
import com.example.ChallengePorto.model.vo.SolicitacaoChamado;
import com.example.ChallengePorto.utils.BaseController;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoChamadoController implements BaseController<SolicitacaoChamado, Long> {
    @Autowired
    private SolicitacaoChamadoRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<SolicitacaoChamado, Long> getRepository() {
        return repository;
    }
    
    // Endpoint para criar uma nova solicitação de chamado
    @Transactional
    @PostMapping
    public ResponseEntity<SolicitacaoChamado> createSolicitacao(@RequestBody SolicitacaoChamado solicitacao) {
        try {
            // Salva a solicitação no repositório
            SolicitacaoChamado saveSolicitacao = repository.save(solicitacao);

            // Inicializa manualmente as associações
            saveSolicitacao.getCliente();  // Adicione outras associações conforme necessário

            // Retorna a solicitação criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveSolicitacao, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
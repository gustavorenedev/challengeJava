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
import com.example.ChallengePorto.model.vo.LocalizacaoCliente;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoClienteController implements BaseController<LocalizacaoCliente, Long> {
    @Autowired
    private LocalizacaoRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<LocalizacaoCliente, Long> getRepository() {
        return repository;
    }
    
    // Endpoint para criar uma nova localização de cliente
    @PostMapping
    public ResponseEntity<LocalizacaoCliente> createLocalizacao(@RequestBody LocalizacaoCliente localizacao) {
        try {
            // Salva a localização no repositório
            LocalizacaoCliente saveLocalizacao = repository.save(localizacao);

            // Retorna a localização criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveLocalizacao, HttpStatus.CREATED);
        } catch (Exception e) {
            // Log a exceção ou manipule-a conforme necessário
            e.printStackTrace(); // Exemplo: imprimir o rastreamento de pilha para depuração
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.VeiculoRepository;
import com.example.ChallengePorto.model.vo.Veiculo;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController implements BaseController<Veiculo, Long> {
    @Autowired
    private VeiculoRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<Veiculo, Long> getRepository() {
        return repository;
    }
    
    @PostMapping
    public ResponseEntity<Veiculo> createVeiculo(@RequestBody Veiculo veiculo) {
        try {
            // Salva o veículo no repositório
            Veiculo saveVeiculo = repository.save(veiculo);

            // Retorna o veículo criado com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveVeiculo, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

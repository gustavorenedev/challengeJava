package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.bo.CadastroBO;
import com.example.ChallengePorto.model.dao.ClienteRepository;
import com.example.ChallengePorto.model.vo.Cliente;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/cliente")
public class ClienteController implements BaseController<Cliente, Long> {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private CadastroBO clienteBO;
    
    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<Cliente, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo cliente
    @PostMapping()
    public ResponseEntity<String> create(@RequestBody Cliente cliente) {
        try {
            // Valida o cadastro do cliente usando a lógica definida em CadastroBO
            String erro = clienteBO.validarCadastro(cliente);

            // Se não houver erros de validação, salva o cliente no repositório
            if (erro == null) {
                repository.save(cliente);
                // Retorna uma resposta de sucesso com mensagem
                return ResponseEntity.ok("Cliente criado com sucesso!");
            } else {
                // Se houver erros de validação, retorna uma resposta de erro com a mensagem de erro
                return ResponseEntity.badRequest().body(erro);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

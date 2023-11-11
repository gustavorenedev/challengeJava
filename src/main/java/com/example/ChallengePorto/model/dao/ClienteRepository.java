package com.example.ChallengePorto.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChallengePorto.model.vo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    boolean existsByCpf(String cpf);
}

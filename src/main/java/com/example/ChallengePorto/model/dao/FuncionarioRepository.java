package com.example.ChallengePorto.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChallengePorto.model.vo.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}

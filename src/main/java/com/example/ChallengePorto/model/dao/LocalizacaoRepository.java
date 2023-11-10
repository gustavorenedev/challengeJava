package com.example.ChallengePorto.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChallengePorto.model.vo.LocalizacaoCliente;

public interface LocalizacaoRepository extends JpaRepository<LocalizacaoCliente, Long> {

}

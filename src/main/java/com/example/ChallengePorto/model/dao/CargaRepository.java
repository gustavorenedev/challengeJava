package com.example.ChallengePorto.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChallengePorto.model.vo.Carga;

public interface CargaRepository extends JpaRepository<Carga, Long> {
}
package com.example.ChallengePorto.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChallengePorto.model.vo.SolicitacaoChamado;

public interface SolicitacaoChamadoRepository extends JpaRepository<SolicitacaoChamado, Long> {
	@EntityGraph(attributePaths = {"cliente", "carga", "localizacaoCliente", "veiculo"})
	List<SolicitacaoChamado> findAll();

}

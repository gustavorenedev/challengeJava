package com.example.ChallengePorto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChallengePorto.model.dao.SolicitacaoChamadoRepository;
import com.example.ChallengePorto.model.vo.SolicitacaoChamado;
import com.example.ChallengePorto.utils.BaseController;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoChamadoController implements BaseController<SolicitacaoChamado, Long>{
	@Autowired
    private SolicitacaoChamadoRepository repository;

    @Override
    public JpaRepository<SolicitacaoChamado, Long> getRepository() {
        return repository;
    }
}

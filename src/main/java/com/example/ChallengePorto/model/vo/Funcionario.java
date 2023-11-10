package com.example.ChallengePorto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

/** 
 * 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao Funcionário
 * @version 0.1 - 05/11/2023
 */
@Entity
@Table(name = "TB_FUNCIONARIO")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long funcionario_id;

	private String nome;
	private String telefone;
	private String departamento;
	
	/**
	 * Construtor padrão que inicializa os atributos da classe
	 * @param nome
	 * @param telefone
	 * @param departamento
	 */
	
	public Funcionario() {
        this.nome = "Lucas";
        this.telefone = "11940028922";
        this.departamento = "Guincheiro";
    }
	
	public Funcionario(String nome, String telefone, String departamento) {
		this.nome = nome;
		this.telefone = telefone;
		this.departamento = departamento;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = "Lucas";
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = "11940028922";
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = "Guincheiro";
	}
	
	@PrePersist
    public void prePersist() {
        System.out.println("PrePersist chamado");
    }
	
}


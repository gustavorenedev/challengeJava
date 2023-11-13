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
    }

	/**
	 * @param funcionario_id
	 * @param nome
	 * @param telefone
	 * @param departamento
	 */
	public Funcionario(Long funcionario_id, String nome, String telefone, String departamento) {
		this.funcionario_id = funcionario_id;
		this.nome = nome;
		this.telefone = telefone;
		this.departamento = departamento;
	}

	/**
	 * @return the funcionario_id
	 */
	public Long getFuncionario_id() {
		return funcionario_id;
	}

	/**
	 * @param funcionario_id the funcionario_id to set
	 */
	public void setFuncionario_id(Long funcionario_id) {
		this.funcionario_id = funcionario_id;
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
		this.nome = nome;
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
		this.telefone = telefone;
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
		this.departamento = departamento;
	}
	
	
}


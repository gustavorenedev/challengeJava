package com.example.ChallengePorto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/** 
 * 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos a Localização do cliente
 * @version 0.1 - 05/11/2023
 */
@Entity
@Table(name = "TB_LOCALIZACAO_CLIENTE")
public class LocalizacaoCliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long localizacao_id;
	private String estado;
	private String logradouro;
	private String cep;
	private String cidade;
	private String referencia;
	@OneToOne
	private Cliente cliente;
	
	// Construtor padrão sem argumentos
    public LocalizacaoCliente() {
    }
	
	/**
	 * Construtor padrão que inicializa os atributos da classe
	 * @param estado
	 * @param logradouro
	 * @param cep
	 * @param cidade
	 * @param referencia
	 */
	public LocalizacaoCliente(String estado, String logradouro, String cep, String cidade, String referencia) {
		this.estado = estado;
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.referencia = referencia;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * @param referencia the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
}


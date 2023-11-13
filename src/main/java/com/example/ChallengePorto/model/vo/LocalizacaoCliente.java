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
	 * @param localizacao_id
	 * @param estado
	 * @param logradouro
	 * @param cep
	 * @param cidade
	 * @param referencia
	 * @param cliente
	 */
	public LocalizacaoCliente(Long localizacao_id, String estado, String logradouro, String cep, String cidade,
			String referencia, Cliente cliente) {
		this.localizacao_id = localizacao_id;
		this.estado = estado;
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.referencia = referencia;
		this.cliente = cliente;
	}

	/**
	 * @return the localizacao_id
	 */
	public Long getLocalizacao_id() {
		return localizacao_id;
	}

	/**
	 * @param localizacao_id the localizacao_id to set
	 */
	public void setLocalizacao_id(Long localizacao_id) {
		this.localizacao_id = localizacao_id;
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

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}


package com.example.ChallengePorto.model.vo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/** 
 * 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao Cliente
 * @version 0.1 - 05/11/2023
 */
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cliente_id;
    private String nome;
    private String senha;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private int apolice;
    @Column(unique = true)
    private String placa;
    @OneToMany(mappedBy = "cliente")
    private List<Veiculo> veiculos;
    @OneToOne(mappedBy = "cliente")
    private LocalizacaoCliente localizacao;
    
    // Construtor padrão sem argumentos
    public Cliente() {
    }

	/**
	 * @param cliente_id
	 * @param nome
	 * @param senha
	 * @param cpf
	 * @param apolice
	 * @param placa
	 * @param veiculos
	 * @param localizacao
	 */
	public Cliente(Long cliente_id, String nome, String senha, String cpf, int apolice, String placa,
			List<Veiculo> veiculos, LocalizacaoCliente localizacao) {
		this.cliente_id = cliente_id;
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
		this.apolice = apolice;
		this.placa = placa;
		this.veiculos = veiculos;
		this.localizacao = localizacao;
	}

	/**
	 * @return the cliente_id
	 */
	public Long getCliente_id() {
		return cliente_id;
	}

	/**
	 * @param cliente_id the cliente_id to set
	 */
	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
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
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the apolice
	 */
	public int getApolice() {
		return apolice;
	}

	/**
	 * @param apolice the apolice to set
	 */
	public void setApolice(int apolice) {
		this.apolice = apolice;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the veiculos
	 */
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	/**
	 * @param veiculos the veiculos to set
	 */
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	/**
	 * @return the localizacao
	 */
	public LocalizacaoCliente getLocalizacao() {
		return localizacao;
	}

	/**
	 * @param localizacao the localizacao to set
	 */
	public void setLocalizacao(LocalizacaoCliente localizacao) {
		this.localizacao = localizacao;
	}
	
	
    

}


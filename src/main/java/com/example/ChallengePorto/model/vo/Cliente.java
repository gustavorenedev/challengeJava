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
    private int apolice;
    private String placa;
    @OneToMany(mappedBy = "cliente")
    private List<Veiculo> veiculos;
    @OneToOne(mappedBy = "cliente")
    private LocalizacaoCliente localizacao;
    
    // Construtor padrão sem argumentos
    public Cliente() {
    }
    
	/**
	 * Construtor padrão que inicializa os atributos da classe
	 * @param nome
	 * @param senha
	 * @param cpf
	 * @param apolice
	 * @param placa
	 */
	public Cliente(String nome, String senha, String cpf, int apolice, String placa) {
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
		this.apolice = apolice;
		this.placa = placa;
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
    
    
    
}


package com.example.ChallengePorto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/** 
 * 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos a Carga
 * @version 0.1 - 05/11/2023
 */
@Entity
@Table(name = "TB_CARGA")
public class Carga{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carga_id;
	private String op;
	private Float comprimento;
    private Float altura;
    private Float largura;
    private Float peso;
    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;
    
    // Construtor padrão sem argumentos
    public Carga() {
    }

	/**
	 * @param carga_id
	 * @param op
	 * @param comprimento
	 * @param altura
	 * @param largura
	 * @param peso
	 * @param veiculo
	 */
	public Carga(Long carga_id, String op, Float comprimento, Float altura, Float largura, Float peso,
			Veiculo veiculo) {
		this.carga_id = carga_id;
		this.op = op;
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
		this.peso = peso;
		this.veiculo = veiculo;
	}

	/**
	 * @return the carga_id
	 */
	public Long getCarga_id() {
		return carga_id;
	}

	/**
	 * @param carga_id the carga_id to set
	 */
	public void setCarga_id(Long carga_id) {
		this.carga_id = carga_id;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}

	/**
	 * @return the comprimento
	 */
	public Float getComprimento() {
		return comprimento;
	}

	/**
	 * @param comprimento the comprimento to set
	 */
	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	/**
	 * @return the altura
	 */
	public Float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(Float altura) {
		this.altura = altura;
	}

	/**
	 * @return the largura
	 */
	public Float getLargura() {
		return largura;
	}

	/**
	 * @param largura the largura to set
	 */
	public void setLargura(Float largura) {
		this.largura = largura;
	}

	/**
	 * @return the peso
	 */
	public Float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Float peso) {
		this.peso = peso;
	}

	/**
	 * @return the veiculo
	 */
	public Veiculo getVeiculo() {
		return veiculo;
	}

	/**
	 * @param veiculo the veiculo to set
	 */
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
    
	
}

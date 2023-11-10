package com.example.ChallengePorto.model.vo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/** 
 * 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao Veículo
 * @version 0.1 - 05/11/2023
 */
@Entity
@Table(name = "TB_VEICULO")
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long veiculo_id;
	private String motivo;
	private Float comprimento;
	private Float altura;
	private Float largura;
	private int eixo;
	private String chassi;
	private Float tara;
	private Float pbt;
	private Float cmt;
	private Float pbtc;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;	
	@OneToMany(mappedBy = "veiculo")
	private List<Carga> cargas;
	
	// Construtor padrão sem argumentos
    public Veiculo() {
    }
	
	/**
	 * Construtor padrão que inicializa os atributos da classe
	 * @param motivo
	 * @param comprimento
	 * @param altura
	 * @param largura
	 * @param eixo
	 * @param chassi
	 * @param tara
	 * @param pbt
	 * @param cmt
	 * @param pbtc
	 */
	public Veiculo(String motivo, Float comprimento, Float altura, Float largura, int eixo, String chassi, Float tara,
			Float pbt, Float cmt, Float pbtc) {
		this.motivo = motivo;
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
		this.eixo = eixo;
		this.chassi = chassi;
		this.tara = tara;
		this.pbt = pbt;
		this.cmt = cmt;
		this.pbtc = pbtc;
	}
	/**
	 * @return the motivo
	 */
	public String getMotivo() {
		return motivo;
	}
	/**
	 * @param motivo the motivo to set
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
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
	 * @return the eixo
	 */
	public int getEixo() {
		return eixo;
	}
	/**
	 * @param eixo the eixo to set
	 */
	public void setEixo(int eixo) {
		this.eixo = eixo;
	}
	/**
	 * @return the chassi
	 */
	public String getChassi() {
		return chassi;
	}
	/**
	 * @param chassi the chassi to set
	 */
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	/**
	 * @return the tara
	 */
	public Float getTara() {
		return tara;
	}
	/**
	 * @param tara the tara to set
	 */
	public void setTara(Float tara) {
		this.tara = tara;
	}
	/**
	 * @return the pbt
	 */
	public Float getPbt() {
		return pbt;
	}
	/**
	 * @param pbt the pbt to set
	 */
	public void setPbt(Float pbt) {
		this.pbt = pbt;
	}
	/**
	 * @return the cmt
	 */
	public Float getCmt() {
		return cmt;
	}
	/**
	 * @param cmt the cmt to set
	 */
	public void setCmt(Float cmt) {
		this.cmt = cmt;
	}
	/**
	 * @return the pbtc
	 */
	public Float getPbtc() {
		return pbtc;
	}
	/**
	 * @param pbtc the pbtc to set
	 */
	public void setPbtc(Float pbtc) {
		this.pbtc = pbtc;
	}
	
	
}


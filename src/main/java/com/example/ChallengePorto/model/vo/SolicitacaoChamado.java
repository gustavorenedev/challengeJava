package com.example.ChallengePorto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_SOLICITACAO_CHAMADO")

public class SolicitacaoChamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long solicitacao_id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    private Carga carga;

    @ManyToOne(fetch = FetchType.EAGER)
    private LocalizacaoCliente localizacaoCliente;

    @ManyToOne(fetch = FetchType.EAGER)
    private Veiculo veiculo;
    
    private boolean passo1;
    private boolean passo2;
    private boolean passo3;
    private String data;
    private String hora;
    private String cidade;
    private String desc;
    
    public SolicitacaoChamado() {
    	
    }

	/**
	 * @param solicitacao_id
	 * @param cliente
	 * @param carga
	 * @param localizacaoCliente
	 * @param veiculo
	 * @param passo1
	 * @param passo2
	 * @param passo3
	 * @param data
	 * @param hora
	 * @param cidade
	 * @param desc
	 */
	public SolicitacaoChamado(Long solicitacao_id, Cliente cliente, Carga carga, LocalizacaoCliente localizacaoCliente,
			Veiculo veiculo, boolean passo1, boolean passo2, boolean passo3, String data, String hora, String cidade,
			String desc) {
		this.solicitacao_id = solicitacao_id;
		this.cliente = cliente;
		this.carga = carga;
		this.localizacaoCliente = localizacaoCliente;
		this.veiculo = veiculo;
		this.passo1 = passo1;
		this.passo2 = passo2;
		this.passo3 = passo3;
		this.data = data;
		this.hora = hora;
		this.cidade = cidade;
		this.desc = desc;
	}

	/**
	 * @return the solicitacao_id
	 */
	public Long getSolicitacao_id() {
		return solicitacao_id;
	}

	/**
	 * @param solicitacao_id the solicitacao_id to set
	 */
	public void setSolicitacao_id(Long solicitacao_id) {
		this.solicitacao_id = solicitacao_id;
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

	/**
	 * @return the carga
	 */
	public Carga getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	/**
	 * @return the localizacaoCliente
	 */
	public LocalizacaoCliente getLocalizacaoCliente() {
		return localizacaoCliente;
	}

	/**
	 * @param localizacaoCliente the localizacaoCliente to set
	 */
	public void setLocalizacaoCliente(LocalizacaoCliente localizacaoCliente) {
		this.localizacaoCliente = localizacaoCliente;
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

	/**
	 * @return the passo1
	 */
	public boolean isPasso1() {
		return passo1;
	}

	/**
	 * @param passo1 the passo1 to set
	 */
	public void setPasso1(boolean passo1) {
		this.passo1 = passo1;
	}

	/**
	 * @return the passo2
	 */
	public boolean isPasso2() {
		return passo2;
	}

	/**
	 * @param passo2 the passo2 to set
	 */
	public void setPasso2(boolean passo2) {
		this.passo2 = passo2;
	}

	/**
	 * @return the passo3
	 */
	public boolean isPasso3() {
		return passo3;
	}

	/**
	 * @param passo3 the passo3 to set
	 */
	public void setPasso3(boolean passo3) {
		this.passo3 = passo3;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
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
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
    
	

	
}

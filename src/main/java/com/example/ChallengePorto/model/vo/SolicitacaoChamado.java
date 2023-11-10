package com.example.ChallengePorto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_SOLICITACAO_CHAMADO")

public class SolicitacaoChamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long solicitacao_id;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private Carga carga;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private LocalizacaoCliente localizacaoCliente;

    @ManyToOne
    private Veiculo veiculo;
    
    private boolean passo1;
    private boolean passo2;
    private boolean passo3;
    private String desc;
    
	/**
	 * @param id
	 * @param cliente
	 * @param carga
	 * @param funcionario
	 * @param localizacaoCliente
	 * @param veiculo
	 * @param passo1
	 * @param passo2
	 * @param passo3
	 * @param desc
	 */
	public SolicitacaoChamado(Long solicitacao_id, Cliente cliente, Carga carga, Funcionario funcionario,
			LocalizacaoCliente localizacaoCliente, Veiculo veiculo, boolean passo1, boolean passo2, boolean passo3,
			String desc) {
		this.solicitacao_id = solicitacao_id;
		this.cliente = cliente;
		this.carga = carga;
		this.funcionario = funcionario;
		this.localizacaoCliente = localizacaoCliente;
		this.veiculo = veiculo;
		this.passo1 = passo1;
		this.passo2 = passo2;
		this.passo3 = passo3;
		this.desc = desc;
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

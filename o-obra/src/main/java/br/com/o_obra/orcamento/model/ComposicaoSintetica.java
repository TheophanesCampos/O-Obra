package br.com.o_obra.orcamento.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_usuario",sequenceName = "seq_usuario",allocationSize = 1,initialValue = 1)
public class ComposicaoSintetica implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_usuario") //utiliza a sequencia "seq_usuario" para numerar os ids
	private String codigoComposicao;
	
	private String descricaoClasse;
	private String siglaClasse;
	private String descricaoTipo1;
	private String siglaTipo1;
	private String descricaoComposicao;
	private String unidade;
	private String origemPreco;
	private String custoTotal; 
	private String vinculo;
	
	public String getDescricaoClasse() {
		return descricaoClasse;
	}
	public void setDescricaoClasse(String descricaoClasse) {
		this.descricaoClasse = descricaoClasse;
	}
	public String getSiglaClasse() {
		return siglaClasse;
	}
	public void setSiglaClasse(String siglaClasse) {
		this.siglaClasse = siglaClasse;
	}
	public String getDescricaoTipo1() {
		return descricaoTipo1;
	}
	public void setDescricaoTipo1(String descricaoTipo1) {
		this.descricaoTipo1 = descricaoTipo1;
	}
	public String getSiglaTipo1() {
		return siglaTipo1;
	}
	public void setSiglaTipo1(String siglaTipo1) {
		this.siglaTipo1 = siglaTipo1;
	}

	public String getCodigoComposicao() {
		return codigoComposicao;
	}
	public void setCodigoComposicao(String codigoComposicao) {
		this.codigoComposicao = codigoComposicao;
	}
	public String getDescricaoComposicao() {
		return descricaoComposicao;
	}
	public void setDescricaoComposicao(String descricaoComposicao) {
		this.descricaoComposicao = descricaoComposicao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getOrigemPreco() {
		return origemPreco;
	}
	public void setOrigemPreco(String origemPreco) {
		this.origemPreco = origemPreco;
	}
	public String getCustoTotal() {
		return custoTotal;
	}
	public void setCustoTotal(String custoTotal) {
		this.custoTotal = custoTotal;
	}
	public String getVinculo() {
		return vinculo;
	}
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	
	
	
	
	
	

}

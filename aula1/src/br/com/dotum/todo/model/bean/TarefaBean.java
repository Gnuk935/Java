package br.com.dotum.todo.model.bean;

public class TarefaBean {

	private Integer id;
	private String descricao;
	private Integer percentual;
	private SituacaoBean situacao;
	private String cor;

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}
	public Integer getPercentual() {
		return this.percentual;
	}
	public void setSituacao(SituacaoBean situacao) {
		this.situacao = situacao;
	}
	public SituacaoBean getSituacao() {
		return this.situacao;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}

}

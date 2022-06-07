package br.com.dotum.todo.dao;

import br.com.dotum.todo.model.bean.SituacaoBean;

public class SituacaoDao {

	public SituacaoBean getPendente() {
		SituacaoBean sitBean = new SituacaoBean();
		sitBean.setId(1);
		sitBean.setDescricao("pendente");

		return sitBean;
	}

	public SituacaoBean getAndamento() {
		SituacaoBean sitBean = new SituacaoBean();
		sitBean.setId(2);
		sitBean.setDescricao("andamento");
		
		return sitBean;
	}
	
	public SituacaoBean getConcluido() {
		SituacaoBean sitBean = new SituacaoBean();
		sitBean.setId(3);
		sitBean.setDescricao("concluido");
		
		return sitBean;
	}
	
	public SituacaoBean getCancelado() {
		SituacaoBean sitBean = new SituacaoBean();
		sitBean.setId(4);
		sitBean.setDescricao("cancelado");
		
		return sitBean;
	}
	
	
}

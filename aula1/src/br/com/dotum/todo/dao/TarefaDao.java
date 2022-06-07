package br.com.dotum.todo.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.dotum.todo.model.bean.SituacaoBean;
import br.com.dotum.todo.model.bean.TarefaBean;

public class TarefaDao {
	
	private static Integer tarefaId = 0;
	
	// falar e explicar o static la na frente!!!
	private static List<TarefaBean> tarList = new ArrayList<TarefaBean>();
	
	
	
	public TarefaBean criaTarefa(String descricao, Integer percentual) throws Exception {
		if (percentual == null) {
			throw new Exception("Favor informar o percentual, mesmo que seja 0");
		}
		
		TarefaBean tarBean = new TarefaBean();
		tarBean.setId(++tarefaId);
		tarBean.setPercentual(percentual);
		tarBean.setDescricao(descricao);
		

		SituacaoDao sitDao = new SituacaoDao();
		SituacaoBean sitBean = sitDao.getPendente();
		
		tarBean.setSituacao(sitBean);
		
		return tarBean;
	}
	
	public void adicionarTarefa(TarefaBean tarBean) {
		tarList.add(tarBean);
	}
	
	public List<TarefaBean> getTarefaList() {
		return tarList;
	}
	
}

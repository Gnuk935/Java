package br.com.dotum.bo;

import java.util.List;
import java.util.Scanner;

import br.com.dotum.todo.dao.TarefaDao;
import br.com.dotum.todo.model.bean.TarefaBean;

public class TarefaBO {

	private Scanner scanner;
	
	
	public TarefaBO(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void adicionarTarefa() throws Exception {
		
		String descricaoTarefa = scanner.nextLine();

		TarefaDao dao = new TarefaDao();
		dao.adicionarTarefa(descricaoTarefa, 0);
		
	}

	public void adicionarTarefaPercentual() throws Exception {
		
		Integer percentualTarefa = scanner.nextInt();
		scanner.nextLine();
		
		TarefaDao dao = new TarefaDao();
		dao.adicionarTarefa(descricaoTarefa, percentualTarefa);
		
	}
	
	public List<TarefaBean> listarTarefa() {
		TarefaDao dao = new TarefaDao();
		List<TarefaBean> tarList = dao.getTarefaList();
		
		return tarList;
	}
	
}

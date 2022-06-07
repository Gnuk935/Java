package br.com.dotum.todo.view;

import java.util.List;

import br.com.dotum.todo.controller.TarefaControl;
import br.com.dotum.todo.model.bean.TarefaBean;

public class TarefaView {

	public void criarTelaMenu() {
		
		
		System.out.println(TarefaControl.OPCAO_ADICIONAR_TAREFA + " - Adicionar tarefa");
		System.out.println(TarefaControl.OPCAO_LISTAR_TAREFA + " - Listar tarefa");
		System.out.println(TarefaControl.OPCAO_ADICIONAR_TAREFA_PERCENTUAL + " - Adicionar tarefa com percentual");
		System.out.println(TarefaControl.OPCAO4 + " - Definir percentual");
		System.out.println(TarefaControl.OPCAO5 + " - Cancelar tarefa");
		System.out.println(TarefaControl.OPCAO6 + " - Sair");
		System.out.println("Digite o numero referente a uma das opções:");

	}

	public void criarTelaAdicionarTarefa() {
		System.out.println("Digite a descrição da tarefa: ");
}
	public void criarTelaAdicionarTarefaPercentual() {
		System.out.println("Digite o percentual da tarefa: ");
	}

	public void criarTelaListarTarefa(List<TarefaBean> tarList) {

		for (int i = 0; i < tarList.size(); i++) {
			TarefaBean tarBean = tarList.get(i);
			System.out.println("" + tarBean.getId()  + " - " + tarBean.getDescricao() + " - " + tarBean.getPercentual());
		}
		System.out.println("=============================");
	}

	public void criarTelaDefinirPercentual() {

	}

	public void criarTelaCancelarTarefa() {

	}

	public void criarMensagemSucesso() {
		System.out.println("Tarefa adicionada com sucesso");
		System.out.println("=============================");
	}

	public void criarMensagemErro(String msg) {
		System.out.println("POBREMA!!!");
		System.out.println("=============================");
		System.out.println( msg );
	}
	
}

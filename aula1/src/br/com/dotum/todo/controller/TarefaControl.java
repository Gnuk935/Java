package br.com.dotum.todo.controller;

import java.util.List;
import java.util.Scanner;

import br.com.dotum.bo.TarefaBO;
import br.com.dotum.todo.model.bean.TarefaBean;
import br.com.dotum.todo.view.TarefaView;

public final class TarefaControl{

	public static final Integer OPCAO_ADICIONAR_TAREFA = 1;
	public static final Integer OPCAO_LISTAR_TAREFA = 2;
	public static final Integer OPCAO_ADICIONAR_TAREFA_PERCENTUAL = 3;
	public static final Integer OPCAO4 = 4;
	public static final Integer OPCAO5 = 5;
	public static final Integer OPCAO6 = 6;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		TarefaView tView = new TarefaView();


		Integer opcao = null;

		do {

			tView.criarTelaMenu();
			opcao = s.nextInt();
			s.nextLine();

			TarefaBO bo = new TarefaBO(s);


			if (opcao.equals(OPCAO_ADICIONAR_TAREFA)) {

				tView.criarTelaAdicionarTarefa();

				try {
					bo.adicionarTarefa();
				} catch (Exception e) {
					e.printStackTrace();
				}

				tView.criarMensagemSucesso();

			} else if (opcao.equals(OPCAO_LISTAR_TAREFA)) {

				List<TarefaBean> tarList = bo.listarTarefa();
				tView.criarTelaListarTarefa(tarList);

			} else if (opcao.equals(OPCAO_ADICIONAR_TAREFA_PERCENTUAL)) {

				tView.criarTelaAdicionarTarefa();
				tView.criarTelaAdicionarTarefaPercentual();

				try {
					
					bo.adicionarTarefaPercentual();
					tView.criarMensagemSucesso();

				} catch (Exception e) {
					tView.criarMensagemErro(e.getMessage());
				}


			}

		} while (opcao.equals(5) == false);

		s.close();
	}

}

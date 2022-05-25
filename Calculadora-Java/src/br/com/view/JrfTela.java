package br.com.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class JrfTela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 882767094823839174L;
	private JPanel contentPane;
	private JTextField tfValor;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();


	/**
	 * Create the frame.
	 */
	public JrfTela() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfValor = new JTextField();
		tfValor.setBounds(10, 11, 363, 63);
		tfValor.setText("0,00");
		tfValor.setHorizontalAlignment(SwingConstants.RIGHT);
		tfValor.setFont(new Font("Komika Axis", Font.PLAIN, 20));
		contentPane.add(tfValor);
		tfValor.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(10, 85, 363, 357);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));

		JButton btAC = new JButton("AC");
		btAC.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btAC);

		JButton btMaisMenos = new JButton("+/-");
		btMaisMenos.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btMaisMenos);

		JButton btPercentual = new JButton("%");
		btPercentual.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btPercentual);

		JButton btDivisão = new JButton("/");
		btDivisão.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btDivisão);

		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("7");
			}
		});
		bt7.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(bt7);

		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("8");
			}
		});
		bt8.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(bt8);

		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("9");
			}
		});
		bt9.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(bt9);

		JButton btMultiplicar = new JButton("*");
		btMultiplicar.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btMultiplicar);

		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("4");
			}
		});
		bt4.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(bt4);

		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("5");
			}
		});
		bt5.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(bt5);

		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("6");
			}
		});
		bt6.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(bt6);

		JButton btMenos = new JButton("-");
		btMenos.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btMenos);

		JButton btnNewButton_4_2 = new JButton("3");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("3");
			}
		});
		btnNewButton_4_2.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btnNewButton_4_2);

		JButton btnNewButton_2_2 = new JButton("2");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("2");
			}
		});
		btnNewButton_2_2.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btnNewButton_2_2);

		JButton btnNewButton_1_2 = new JButton("1");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("1");
			}
		});
		btnNewButton_1_2.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btnNewButton_1_2);

		JButton btMais = new JButton("+");
		btMais.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btMais);

		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita("0");
			}
		});
		bt0.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(bt0);

		JButton btVirgula = new JButton(",");
		btVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digita(",");
			}
		});
		btVirgula.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btVirgula);

		JButton btFechar = new JButton("Fechar");
		btFechar.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btFechar);

		JButton btIgual = new JButton("=");
		btIgual.setFont(new Font("Komika Axis", Font.PLAIN, 14));
		panel.add(btIgual);
	}

	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4212189348445406435L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 2783320893775414029L;
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	//Metodo para receber o numero
	private void digita(String caractere) {
		if(tfValor.getText().equals("0,00")) {
			tfValor.setText(caractere);
		}else {
			if(caractere.equals(",") && tfValor.getText().contains(",")) {

			}else {
				tfValor.setText(tfValor.getText().concat(caractere));
			}

		}


	}
}


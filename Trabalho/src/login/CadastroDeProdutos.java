package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDeProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txValor;
	private JTextField txDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeProdutos frame = new CadastroDeProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroDeProdutos() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O que você vai colocar na tabela ?");
		lblNewLabel.setBounds(10, 11, 199, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdSalario = new JRadioButton("Salário");
		rdSalario.setBounds(6, 37, 77, 23);
		contentPane.add(rdSalario);
		
		JRadioButton rdDispesa = new JRadioButton("Dispesas");
		rdDispesa.setBounds(85, 37, 78, 23);
		contentPane.add(rdDispesa);
		
		JLabel lbValor = new JLabel("Valor");
		lbValor.setBounds(10, 67, 58, 14);
		contentPane.add(lbValor);
		
		txValor = new JTextField();
		txValor.setBounds(10, 98, 121, 20);
		contentPane.add(txValor);
		txValor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descrição");
		lblNewLabel_1.setBounds(10, 129, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txDescricao = new JTextField();
		txDescricao.setBounds(10, 165, 153, 20);
		contentPane.add(txDescricao);
		txDescricao.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(141, 207, 89, 23);
		contentPane.add(btnNewButton);

		
	
	}
}

package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txUsuario;
	private JTextField txSenha;

	private String usuario = "artur";
	private String senha = "1234";
	private Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txUsuario = new JTextField();
		txUsuario.setBounds(94, 8, 86, 20);
		contentPane.add(txUsuario);
		txUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txSenha = new JTextField();
		txSenha.setBounds(94, 39, 86, 20);
		contentPane.add(txSenha);
		txSenha.setColumns(10);
		
		
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btEntrar.setBounds(109, 121, 105, 23);
		contentPane.add(btEntrar);

	}
}

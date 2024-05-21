package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField fieldUserEmail;
	private JTextField fieldPassword;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel textoLogin = new JLabel("LOGIN");
		textoLogin.setBounds(10, 11, 46, 14);
		add(textoLogin);
		
		JLabel textUserEmail = new JLabel("Username o Email");
		textUserEmail.setBounds(10, 50, 197, 14);
		add(textUserEmail);
		
		fieldUserEmail = new JTextField();
		fieldUserEmail.setBounds(10, 75, 240, 20);
		add(fieldUserEmail);
		fieldUserEmail.setColumns(10);
		
		fieldPassword = new JTextField();
		fieldPassword.setColumns(10);
		fieldPassword.setBounds(10, 143, 240, 20);
		add(fieldPassword);
		
		JLabel textPassword = new JLabel("PASSWORD");
		textPassword.setBounds(10, 118, 197, 14);
		add(textPassword);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(10, 174, 89, 23);
		add(btnLogin);
		
		JButton btnSignup = new JButton("SIGN IN");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignup.setBounds(351, 11, 89, 23);
		add(btnSignup);

	}
}

package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Signup() {
		setLayout(null);
		
		JLabel textSingup = new JLabel("SIGN UP");
		textSingup.setBounds(10, 11, 46, 14);
		add(textSingup);
		
		JLabel textEmail = new JLabel("EMAIL");
		textEmail.setBounds(10, 53, 46, 14);
		add(textEmail);
		
		textField = new JTextField();
		textField.setBounds(10, 78, 266, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 134, 266, 20);
		add(textField_1);
		
		JLabel textUsername = new JLabel("USERNAME");
		textUsername.setBounds(10, 109, 165, 14);
		add(textUsername);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 190, 266, 20);
		add(textField_2);
		
		JLabel textPassword = new JLabel("PASSWORD");
		textPassword.setBounds(10, 165, 153, 14);
		add(textPassword);
		
		JButton btnSignup = new JButton("SIGN UP");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignup.setBounds(10, 221, 89, 23);
		add(btnSignup);

	}
}

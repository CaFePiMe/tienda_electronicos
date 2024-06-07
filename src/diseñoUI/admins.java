package diseñoUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesBDs.Usuario;
import controladores.CUsuario;

import javax.swing.JLabel;
import javax.swing.JTextField;



public class admins extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	CUsuario cu = new CUsuario();
	
	/**
	 * Create the frame.
	 */
	public admins() {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnHP = new JButton("home");
		btnHP.setBounds(653, 11, 89, 23);
		btnHP.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	dispose();
                System.out.println("Home button clicked!");
                
                admin_verProducto frame = new admin_verProducto();
                frame.setVisible(true);
            }
        });
		contentPane.add(btnHP);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblid = new JLabel("ID_USUARIO");
		lblid.setBounds(24, 11, 97, 14);
		contentPane.add(lblid);
		
		textField = new JTextField();
		textField.setBounds(24, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCONVERTIR = new JButton("VOLVER ADMIN");
		btnCONVERTIR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario us = cu.getRegistro("id_usu", textField.getText());
				cu.upDateRegistro(us, "admin", "true");
			}
		});
		btnCONVERTIR.setBounds(21, 75, 156, 23);
		contentPane.add(btnCONVERTIR);
	}
}

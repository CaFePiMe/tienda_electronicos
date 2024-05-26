package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesBDs.Usuario;
import controladores.CUsuario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class log_in extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log_in frame = new log_in();
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
	public log_in() {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_ingresar = new JButton("");
		btn_ingresar.setIcon(new ImageIcon(log_in.class.getResource("/recursos/front/front/front_elementos/usuario/log_in/btn/btn_ingresar.png")));
		btn_ingresar.setBounds(495, 299, 85, 21);
		btn_ingresar.setBorderPainted(false);
		btn_ingresar.setContentAreaFilled(false);
		btn_ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingresar button clicked");
                CUsuario cu = new CUsuario();
                
                String username = textField.getText();
                String password = textField_1.getText();
                
                System.out.println("Nombre de usuario: " + username);
                System.out.println("Contraseña: " + password);
                
                Usuario us = cu.checkPassword(username, password);
                
                if(us != null) {
                    System.out.println("Contraseña correcta");
                } else {
                    System.out.println("Contraseña equivocada");
                }
            }
        });
		contentPane.add(btn_ingresar);
		
		JButton btn_noTienesUsuarip = new JButton("¿No tienes un uuario?");
		btn_noTienesUsuarip.setBounds(313, 261, 139, 21);
		btn_noTienesUsuarip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("No tienes un usuario? button clicked");
            }
        });
		contentPane.add(btn_noTienesUsuarip);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(314, 231, 266, 20);
		contentPane.add(textField_1);
		
		JLabel h3_contr = new JLabel("Contraseña");
		h3_contr.setForeground(Color.WHITE);
		h3_contr.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h3_contr.setBounds(313, 216, 64, 14);
		contentPane.add(h3_contr);
		
		JLabel h3 = new JLabel("Usuario");
		h3.setForeground(Color.WHITE);
		h3.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h3.setBounds(313, 171, 46, 14);
		contentPane.add(h3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(314, 186, 266, 20);
		contentPane.add(textField);
		
		JLabel img_icon = new JLabel("");
		img_icon.setIcon(new ImageIcon(log_in.class.getResource("/recursos/front/front/front_elementos/usuario/log_in/img/img_icon.png")));
		img_icon.setBounds(112, 107, 155, 174);
		contentPane.add(img_icon);
		
		JLabel h1 = new JLabel("¡Bienvenido!");
		h1.setForeground(Color.WHITE);
		h1.setFont(new Font("Lufga Black", Font.PLAIN, 35));
		h1.setBounds(313, 112, 223, 33);
		contentPane.add(h1);
		
		JLabel lblIngresaCompletandoLos = new JLabel("Ingresa completando los espacios porfavor");
		lblIngresaCompletandoLos.setForeground(Color.WHITE);
		lblIngresaCompletandoLos.setFont(new Font("Lufga", Font.PLAIN, 15));
		lblIngresaCompletandoLos.setBounds(313, 147, 340, 20);
		contentPane.add(lblIngresaCompletandoLos);
		
		JLabel bg = new JLabel("");
		bg.setBounds(-12, 0, 790, 406);
		bg.setIcon(new ImageIcon(log_in.class.getResource("/recursos/front/front/front_elementos/usuario/log_in/bg_login.png")));
		contentPane.add(bg);
	}
}

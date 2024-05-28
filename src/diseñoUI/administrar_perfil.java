package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class administrar_perfil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField var_cambiarNIT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administrar_perfil frame = new administrar_perfil();
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
	public administrar_perfil() {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel h1_administrarPerfil = new JLabel("Administrar perfil");
		h1_administrarPerfil.setFont(new Font("Lufga Black", Font.PLAIN, 19));
		h1_administrarPerfil.setForeground(new Color(255, 255, 255));
		h1_administrarPerfil.setBounds(24, 28, 175, 26);
		contentPane.add(h1_administrarPerfil);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(administrar_perfil.class.getResource("/recursos/front/front/front_elementos/usuario/administrar_perfil/bg_navbar.png")));
		bg.setBounds(0, -28, 752, 134);
		contentPane.add(bg);
		
		JLabel img_icon = new JLabel("");
		img_icon.setIcon(new ImageIcon(administrar_perfil.class.getResource("/recursos/front/front/front_elementos/usuario/administrar_perfil/img/img_iconblue.png")));
		img_icon.setBounds(109, 147, 160, 155);
		contentPane.add(img_icon);
		
		JTextField var_cambiarContraseña = new JTextField();
		var_cambiarContraseña.setBounds(335, 171, 249, 20);
		contentPane.add(var_cambiarContraseña);
		var_cambiarContraseña.setColumns(10);
		
		JLabel h2_cambiarContraseña = new JLabel("Cambiar Contraseña");
		h2_cambiarContraseña.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_cambiarContraseña.setBounds(335, 154, 124, 14);
		contentPane.add(h2_cambiarContraseña);
		
		JLabel h2_cambiarNIT = new JLabel("Cambiar NIT");
		h2_cambiarNIT.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_cambiarNIT.setBounds(335, 222, 98, 14);
		contentPane.add(h2_cambiarNIT);
		
		var_cambiarNIT = new JTextField();
		var_cambiarNIT.setColumns(10);
		var_cambiarNIT.setBounds(335, 239, 249, 20);
		contentPane.add(var_cambiarNIT);
		
		JButton btn_volverAlInicio = new JButton("Volver al inicio");
		btn_volverAlInicio.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		btn_volverAlInicio.setBounds(584, 340, 118, 23);
		contentPane.add(btn_volverAlInicio);
		
		JButton btn_cambiarContraseña = new JButton("Cambiar contraseña");
		btn_cambiarContraseña.setFont(new Font("Lufga", Font.PLAIN, 8));
		btn_cambiarContraseña.setBounds(335, 196, 124, 20);
		contentPane.add(btn_cambiarContraseña);
		
		JButton btn_cambiarNIT = new JButton("Cambiar NIT");
		btn_cambiarNIT.setFont(new Font("Lufga", Font.PLAIN, 8));
		btn_cambiarNIT.setBounds(335, 270, 90, 20);
		contentPane.add(btn_cambiarNIT);
	}
}

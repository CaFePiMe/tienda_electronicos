package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class administrar_perfil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	}
}

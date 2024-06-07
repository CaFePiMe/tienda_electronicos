package diseñoUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesBDs.Usuario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class compra_realizada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Usuario us;

	/**
	 * Create the frame.
	 */
	public compra_realizada(Usuario us) {
		
		this.us = us;
		
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BG = new JLabel("");
		BG.setBounds(-3, 0, 768, 78);
		BG.setIcon(new ImageIcon(compra_realizada.class.getResource("/recursos/front/front/front_elementos/usuario/compra_realizada/bg_navbar.png")));
		contentPane.add(BG);
		
		JLabel H1 = new JLabel("COMPRA REALIZADA");
		H1.setForeground(new Color(27, 20, 100));
		H1.setFont(new Font("Lufga Black", Font.PLAIN, 45));
		H1.setBounds(146, 152, 486, 52);
		contentPane.add(H1);
		
		JLabel H2 = new JLabel("¡Muchas gracias!");
		H2.setFont(new Font("Lufga SemiBold", Font.PLAIN, 35));
		H2.setBounds(235, 191, 282, 52);
		contentPane.add(H2);
		
		JButton btn_volver = new JButton("");
		btn_volver.setIcon(new ImageIcon(compra_realizada.class.getResource("/recursos/front/front/front_elementos/usuario/compra_realizada/btn/btn_volver.png")));
		btn_volver.setBounds(318, 289, 117, 31);
		btn_volver.setBorderPainted(false);
		btn_volver.setContentAreaFilled(false);
		btn_volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cerrar la ventana actual
				dispose();
				// Abrir la ventana home_page
				home_page home = new home_page(us);
				home.setVisible(true);
			}
		});
		contentPane.add(btn_volver);
	}
}

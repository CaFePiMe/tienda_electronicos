package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hp_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField cantidad;

	/**
	 * Create the panel.
	 */
	public hp_producto() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BJT NPN");
		lblNewLabel.setBounds(159, 11, 161, 19);
		lblNewLabel.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		add(lblNewLabel);
		
		JLabel p = new JLabel("Bs.500");
		p.setBounds(164, 93, 46, 19);
		p.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		add(p);
		
		JButton btn_sumar = new JButton("+");
		btn_sumar.setBounds(220, 92, 41, 23);
		add(btn_sumar);
		
		JButton btn_menos = new JButton("-");
		btn_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_menos.setBounds(297, 92, 37, 23);
		add(btn_menos);
		
		JButton btn_anadirCarrito = new JButton("");
		btn_anadirCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_anadirCarrito.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_añadirCarrito.png")));
		btn_anadirCarrito.setBounds(339, 96, 77, 19);
		btn_anadirCarrito.setBorderPainted(false);
		btn_anadirCarrito.setContentAreaFilled(false);
		add(btn_anadirCarrito);
		
		JLabel img_1 = new JLabel("");
		img_1.setBounds(350, 74, 0, 0);
		add(img_1);
		
		JTextArea txt_descripcion = new JTextArea();
		txt_descripcion.setFont(new Font("Lufga", Font.PLAIN, 9));
		txt_descripcion.setText("Tipo: NPN (Negativo-Positivo-Negativo)\r\nPolaridad: Comúnmente usado en circuitos de amplificación y conmutación.\r\nVoltaje de saturación (Vce sat): Alrededor de 0.3V a 0.4V.\r\nCorriente máxima de colector (Ic): Hasta 600 mA.\r\n");
		txt_descripcion.setBounds(159, 31, 345, 52);
		add(txt_descripcion);
		
		cantidad = new JTextField();
		cantidad.setBounds(266, 93, 26, 20);
		add(cantidad);
		cantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/resistores.png")));
		lblNewLabel_1.setBounds(63, 36, 55, 56);
		add(lblNewLabel_1);
		
		JLabel star = new JLabel("");
		star.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star.setBounds(339, 8, 26, 21);
		add(star);
		
		JLabel star_1 = new JLabel("");
		star_1.setBounds(339, 11, 19, 21);
		add(star_1);
		
		JLabel star_2 = new JLabel("");
		star_2.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_2.setBounds(364, 8, 26, 21);
		add(star_2);
		
		JLabel star_3 = new JLabel("");
		star_3.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_3.setBounds(389, 8, 26, 21);
		add(star_3);
		
		JLabel star_3_1 = new JLabel("");
		star_3_1.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_3_1.setBounds(414, 9, 26, 21);
		add(star_3_1);
		
		JLabel star_3_1_1 = new JLabel("");
		star_3_1_1.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_3_1_1.setBounds(438, 9, 26, 21);
		add(star_3_1_1);

	}
}

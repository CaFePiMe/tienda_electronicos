package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class admv_producto extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public admv_producto() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(admv_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/resistores.png")));
		lblNewLabel_1.setBounds(41, 39, 55, 56);
		add(lblNewLabel_1);
		
		JTextArea txt_descripcion = new JTextArea();
		txt_descripcion.setText("Tipo: NPN (Negativo-Positivo-Negativo)\r\nPolaridad: Comúnmente usado en circuitos de amplificación y conmutación.\r\nVoltaje de saturación (Vce sat): Alrededor de 0.3V a 0.4V.\r\nCorriente máxima de colector (Ic): Hasta 600 mA.\r\n");
		txt_descripcion.setFont(new Font("Lufga", Font.PLAIN, 9));
		txt_descripcion.setBounds(137, 34, 345, 52);
		add(txt_descripcion);
		
		JLabel p = new JLabel("Bs.500");
		p.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		p.setBounds(142, 96, 46, 19);
		add(p);
		
		JLabel star_3 = new JLabel("");
		star_3.setIcon(new ImageIcon(admv_producto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/btn/btn_starv.png")));
		star_3.setBounds(367, 11, 26, 21);
		add(star_3);
		
		JLabel star_2 = new JLabel("");
		star_2.setIcon(new ImageIcon(admv_producto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/btn/btn_starv.png")));
		star_2.setBounds(342, 11, 26, 21);
		add(star_2);
		
		JLabel star = new JLabel("");
		star.setIcon(new ImageIcon(admv_producto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/btn/btn_starv.png")));
		star.setBounds(317, 11, 26, 21);
		add(star);
		
		JLabel star_3_1 = new JLabel("");
		star_3_1.setIcon(new ImageIcon(admv_producto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/btn/btn_starv.png")));
		star_3_1.setBounds(392, 12, 26, 21);
		add(star_3_1);
		
		JLabel star_3_1_1 = new JLabel("");
		star_3_1_1.setIcon(new ImageIcon(admv_producto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/btn/btn_starv.png")));
		star_3_1_1.setBounds(416, 12, 26, 21);
		add(star_3_1_1);
		
		JLabel lblNewLabel = new JLabel("BJT NPN");
		lblNewLabel.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		lblNewLabel.setBounds(138, 14, 168, 19);
		add(lblNewLabel);
		
		JButton btn_verProducto = new JButton("");
		btn_verProducto.setIcon(new ImageIcon(admv_producto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/btn/btn_verProducto.png")));
		btn_verProducto.setBounds(198, 94, 89, 23);
		btn_verProducto.setBorderPainted(false);
		btn_verProducto.setContentAreaFilled(false);
		add(btn_verProducto);

	}
}

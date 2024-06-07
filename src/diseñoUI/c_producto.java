package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import clasesBDs.Carro;
import clasesBDs.Producto;
import clasesBDs.Usuario;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class c_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private Producto pro;
	private Usuario us;
	private Carro ca;

	/**
	 * Create the panel.
	 */
	public c_producto(Producto pro, Usuario us, Carro ca) {
		
		this.ca = ca;
		this.pro = pro;
		this.us = us;
		
		setLayout(null);
		
		JLabel h2_nombreProducto = new JLabel(pro.getNombre());
		h2_nombreProducto.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		h2_nombreProducto.setBounds(34, 78, 56, 14);
		add(h2_nombreProducto);
		
		JLabel img_producto = new JLabel("");
		String resourcePath = "/recursos_productos/" + pro.getImagen();
		img_producto.setIcon(new ImageIcon(hp_producto.class.getResource(resourcePath)));
		img_producto.setBounds(35, 9, 67, 67);
		add(img_producto);
		
		textField = new JTextField(ca.getCantidad());
		textField.setColumns(10);
		textField.setBounds(10, 98, 26, 20);
		add(textField);
		
		JButton btn_sumar = new JButton("+");
		btn_sumar.setBounds(41, 96, 42, 23);
		add(btn_sumar);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setBounds(85, 96, 42, 23);
		add(btn_menos);
		
		JButton btn_dejarComentario = new JButton("");
		btn_dejarComentario.setIcon(new ImageIcon(c_producto.class.getResource("/recursos/front/front/front_elementos/usuario/carrito/btn/btn_dejarComentario.png")));
		btn_dejarComentario.setBounds(18, 136, 89, 23);
		btn_dejarComentario.setBorderPainted(false);
		btn_dejarComentario.setContentAreaFilled(false);
		add(btn_dejarComentario);
		
		JLabel h3_costo = new JLabel("Total Bs." + (pro.getPrecio() * Double.parseDouble(textField.getText())));
		h3_costo.setFont(new Font("Lufga", Font.PLAIN, 11));
		h3_costo.setBounds(29, 123, 67, 14);
		add(h3_costo);
		
		JTextArea txt_comentario = new JTextArea();
		txt_comentario.setFont(new Font("Lufga", Font.PLAIN, 12));
		txt_comentario.setBounds(141, 38, 531, 111);
		add(txt_comentario);
		
		JLabel h2_Usuario = new JLabel(us.getNombre());
		h2_Usuario.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_Usuario.setBounds(145, 18, 138, 14);
		add(h2_Usuario);
		
		JLabel star_2 = new JLabel("");
		star_2.setIcon(new ImageIcon(c_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_2.setBounds(318, 10, 26, 21);
		add(star_2);
		
		JLabel star = new JLabel("");
		star.setIcon(new ImageIcon(c_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star.setBounds(293, 10, 26, 21);
		add(star);
		
		JLabel star_3 = new JLabel("");
		star_3.setIcon(new ImageIcon(c_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_3.setBounds(343, 10, 26, 21);
		add(star_3);
		
		JLabel star_3_1 = new JLabel("");
		star_3_1.setIcon(new ImageIcon(c_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_3_1.setBounds(368, 11, 26, 21);
		add(star_3_1);
		
		JLabel star_3_1_1 = new JLabel("");
		star_3_1_1.setIcon(new ImageIcon(c_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
		star_3_1_1.setBounds(392, 11, 26, 21);
		add(star_3_1_1);

	}
}

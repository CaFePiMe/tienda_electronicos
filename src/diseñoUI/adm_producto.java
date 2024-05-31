package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class adm_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public adm_producto() {
		setLayout(null);
		
		JLabel h2_IdProducto = new JLabel("ID_9002392");
		h2_IdProducto.setFont(new Font("Lufga Black", Font.PLAIN, 13));
		h2_IdProducto.setBounds(30, 70, 70, 14);
		add(h2_IdProducto);
		
		JLabel img_producto = new JLabel("");
		img_producto.setIcon(new ImageIcon(adm_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/resistores.png")));
		img_producto.setBounds(38, 9, 55, 56);
		add(img_producto);
		
		JButton btn_subirImagen = new JButton("");
		btn_subirImagen.setIcon(new ImageIcon(adm_producto.class.getResource("/recursos/front/front/front_elementos/admin/editar_producto/btn/btn_subirImagen.png")));
		btn_subirImagen.setBounds(21, 89, 89, 23);
		btn_subirImagen.setBorderPainted(false);
		btn_subirImagen.setContentAreaFilled(false);
		add(btn_subirImagen);
		
		JButton btn_actualizar = new JButton("");
		btn_actualizar.setIcon(new ImageIcon(adm_producto.class.getResource("/recursos/front/front/front_elementos/admin/editar_producto/btn/btn_actualizar.png")));
		btn_actualizar.setBounds(21, 110, 89, 23);
		btn_actualizar.setBorderPainted(false);
		btn_actualizar.setContentAreaFilled(false);
		add(btn_actualizar);
		
		JLabel h2_nombre = new JLabel("Nombre");
		h2_nombre.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_nombre.setBounds(113, 14, 46, 14);
		add(h2_nombre);
		
		JLabel h2_descripcion = new JLabel("Descripción");
		h2_descripcion.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_descripcion.setBounds(113, 34, 70, 14);
		add(h2_descripcion);
		
		JLabel h2_stock = new JLabel("Stock");
		h2_stock.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_stock.setBounds(113, 78, 46, 14);
		add(h2_stock);
		
		JLabel h2_distribuidor = new JLabel("Distribuidor");
		h2_distribuidor.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_distribuidor.setBounds(113, 97, 70, 14);
		add(h2_distribuidor);
		
		JLabel h2_categoria = new JLabel("Categoría");
		h2_categoria.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_categoria.setBounds(113, 115, 60, 14);
		add(h2_categoria);
		
		textField = new JTextField();
		textField.setBounds(179, 9, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 78, 23, 14);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 98, 70, 14);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(179, 116, 70, 14);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(179, 34, 301, 38);
		add(textField_4);
		textField_4.setColumns(10);

	}
}

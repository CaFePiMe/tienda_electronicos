package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import clasesBDs.Producto;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class hp_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField cantidad;
	private int stock;
	private JLabel[] estrellas;
	private int rating = 0;


	/**
	 * Create the panel.
	 */
	public hp_producto(Producto pro) {
		setLayout(null);
		
		stock = pro.getStock();
		
		JLabel lblNewLabel = new JLabel(pro.getNombre());
		lblNewLabel.setBounds(160, 11, 168, 19);
		lblNewLabel.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		add(lblNewLabel);
		
		JLabel p = new JLabel("Bs." + pro.getPrecio());
		p.setBounds(164, 93, 92, 19);
		p.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		add(p);
		
		JButton btn_sumar = new JButton("+");
		btn_sumar.setBounds(280, 93, 41, 23);
		btn_sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentQuantity = Integer.parseInt(cantidad.getText());
				currentQuantity++;
				cantidad.setText(String.valueOf(currentQuantity));
			}
		});
		add(btn_sumar);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setBounds(357, 93, 41, 23);
		btn_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentQuantity = Integer.parseInt(cantidad.getText());
				if (currentQuantity > 1) {
					currentQuantity--;
					cantidad.setText(String.valueOf(currentQuantity));
				}
			}
		});
		add(btn_menos);
		
		JButton btn_anadirCarrito = new JButton("");
		btn_anadirCarrito.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_añadirCarrito.png")));
		btn_anadirCarrito.setBounds(399, 97, 77, 19);
		btn_anadirCarrito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Product added to cart.");
            }
        });
		add(btn_anadirCarrito);
		
		JLabel img_1 = new JLabel("");
		img_1.setBounds(350, 74, 0, 0);
		add(img_1);
		
		JTextArea txt_descripcion = new JTextArea();
		txt_descripcion.setFont(new Font("Lufga", Font.PLAIN, 9));
		txt_descripcion.setText(pro.getDescripcion());
		txt_descripcion.setBounds(159, 31, 345, 52);
		add(txt_descripcion);
		
		cantidad = new JTextField();
		cantidad.setBounds(326, 94, 26, 20);
		add(cantidad);
		cantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		String resourcePath = "/recursos_productos/" + pro.getImagen();
		lblNewLabel_1.setIcon(new ImageIcon(hp_producto.class.getResource(resourcePath)));
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
		
		// Crear las estrellas
				estrellas = new JLabel[5];
				for (int i = 0; i < estrellas.length; i++) {
					estrellas[i] = new JLabel("");
					estrellas[i].setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
					estrellas[i].setBounds(339 + (i * 25), 8, 26, 21);
					final int index = i;
					estrellas[i].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (rating == index + 1) {
								setRating(0);  // Desmarcar todas las estrellas
							} else {
								setRating(index + 1);  // Establecer la nueva calificación
							}
						}
					});
					add(estrellas[i]);
				}

	}
	// Método para establecer la calificación
		private void setRating(int rating) {
			this.rating = rating;
			for (int i = 0; i < estrellas.length; i++) {
				if (i < rating) {
					estrellas[i].setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_star.png")));
				} else {
					estrellas[i].setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
				}
			}
		}
	private void estrellas() {
		
		
		
	}
}
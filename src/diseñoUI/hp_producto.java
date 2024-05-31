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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class hp_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField cantidad;
	private JLabel[] estrellas;
	private int rating = 0;

	/**
	 * Create the panel.
	 */
	public hp_producto() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BJT NPN");
		lblNewLabel.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		lblNewLabel.setBounds(160, 11, 168, 19);
		add(lblNewLabel);
		
		JLabel p = new JLabel("Bs.500");
		p.setFont(new Font("Lufga SemiBold", Font.PLAIN, 14));
		p.setBounds(164, 93, 46, 19);
		add(p);
		
		cantidad = new JTextField();
		cantidad.setText("1");
		cantidad.setColumns(10);
		cantidad.setBounds(266, 93, 26, 20);
		add(cantidad);

		JButton btn_sumar = new JButton("+");
		btn_sumar.setBounds(220, 92, 41, 23);
		btn_sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentQuantity = Integer.parseInt(cantidad.getText());
				currentQuantity++;
				cantidad.setText(String.valueOf(currentQuantity));
			}
		});
		add(btn_sumar);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setBounds(297, 92, 41, 23);
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
		btn_anadirCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Acción para añadir al carrito
			}
		});
		btn_anadirCarrito.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_añadirCarrito.png")));
		btn_anadirCarrito.setBounds(339, 96, 77, 19);
		btn_anadirCarrito.setBorderPainted(false);
		btn_anadirCarrito.setContentAreaFilled(false);
		add(btn_anadirCarrito);
		
		JTextArea txt_descripcion = new JTextArea();
		txt_descripcion.setFont(new Font("Lufga", Font.PLAIN, 9));
		txt_descripcion.setText("Tipo: NPN (Negativo-Positivo-Negativo)\r\nPolaridad: Comúnmente usado en circuitos de amplificación y conmutación.\r\nVoltaje de saturación (Vce sat): Alrededor de 0.3V a 0.4V.\r\nCorriente máxima de colector (Ic): Hasta 600 mA.\r\n");
		txt_descripcion.setBounds(159, 31, 345, 52);
		add(txt_descripcion);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/resistores.png")));
		lblNewLabel_1.setBounds(63, 36, 55, 56);
		add(lblNewLabel_1);
		
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
}

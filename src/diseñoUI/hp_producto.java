package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import clasesBDs.Carro;
import clasesBDs.Producto;
import clasesBDs.Usuario;
import clasesBDs.Valoracion;
import controladores.CCarro;
import controladores.CValoracion;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class hp_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField cantidad;
	private int stock;
	private JLabel[] estrellas;
	private int rating = 0;
	private Producto pro;
	private Usuario us;

	CCarro cc = new CCarro();
	CValoracion cv = new CValoracion();
	/**
	 * Create the panel.
	 */
	public hp_producto(Producto pro, Usuario us) {
		
		this.pro = pro;
		this.us = us;
		
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
            	
            	String call = pro.getCampoClavePrimaria() + " = " + pro.getPrimaryKey() + " AND " + us.getCampoClavePrimaria();
            	
            	Carro carr = (Carro) cc.getRegistro(call, Integer.toString(us.getPrimaryKey()));
            	
            	System.out.println("btn_anadirCarrito");
            	
            	if(carr != null) {
            		cc.upDateRegistro(carr, "cantidad", cantidad.getText());
            		System.out.println("updated");
            	} else {
            		System.out.println("Product added to cart.");
                    String nu = "'" + pro.getPrimaryKey() + "', '" + us.getPrimaryKey() + "', '" + cantidad.getText() + "', " + pro.getPrecio() + ", 1";
                    
                    cc.crearRegistro(nu);
                    System.out.println("register");
            	}
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
		cantidad.setText("0");
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
        for (int i = 0; i < 5; i++) {
            estrellas[i] = new JLabel(); // Instantiate each JLabel here
            estrellas[i].setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
            estrellas[i].setBounds(339 + (i * 25), 8, 26, 21);
            add(estrellas[i]);
        }
		
		ArrayList<Valoracion> valoraciones = cv.getRegistroList(pro.getCampoClavePrimaria(), Integer.toString(pro.getPrimaryKey()));

		int total = 0;
		if(valoraciones!= null &&!valoraciones.isEmpty()) {
		    int size = valoraciones.size();
		    for (int i = 0; i < size; i++) {
		        total += valoraciones.get(i).getValoracion();
		    }
		    this.rating = Math.round((float)total/size); // Cast total to float to avoid integer division
		    System.out.println(this.rating);
		} else {
		    rating = 1; // Default rating if no ratings exist
		}
		setRating(this.rating);
	}
	// Método para establecer la calificación
	private void setRating(int rating) {
	    this.rating = rating;
	    for (int i = 0; i < 5; i++) {
	        if (i < rating) {
	            estrellas[i].setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_star.png")));
	        } else {
	            estrellas[i].setIcon(new ImageIcon(hp_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_starv.png")));
	        }
	    }
	}
}
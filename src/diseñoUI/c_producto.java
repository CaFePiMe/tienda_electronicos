package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

import clasesBDs.Carro;
import clasesBDs.Producto;
import clasesBDs.Usuario;
import clasesBDs.Valoracion;
import controladores.CCarro;
import controladores.CValoracion;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class c_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private Producto pro;
	private JLabel[] estrellas;
	private int rating = 0;
	private Usuario us;
	private Carro ca;
	
	CValoracion cv = new CValoracion();

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
		h2_nombreProducto.setBounds(10, 78, 117, 14);
		add(h2_nombreProducto);
		
		JLabel img_producto = new JLabel("");
		String resourcePath = "/recursos_productos/" + pro.getImagen();
		img_producto.setIcon(new ImageIcon(hp_producto.class.getResource(resourcePath)));
		img_producto.setBounds(35, 9, 67, 67);
		add(img_producto);
		
		JTextArea txt_comentario = new JTextArea();
		txt_comentario.setFont(new Font("Lufga", Font.PLAIN, 12));
		txt_comentario.setBounds(141, 38, 531, 111);
		add(txt_comentario);
		
		textField = new JTextField();
		textField.setText(Integer.toString(ca.getCantidad()));
		textField.setColumns(10);
		textField.setBounds(10, 98, 26, 20);
		add(textField);
		
		JButton btn_sumar = new JButton("+");
		btn_sumar.setBounds(41, 96, 42, 23);
		btn_sumar.addActionListener(e -> {
            int currentQuantity = Integer.parseInt(textField.getText());
            int newQuantity = currentQuantity + 1; 
            textField.setText(Integer.toString(newQuantity)); 
            updateCantidad(Integer.parseInt(textField.getText()));
        });
		add(btn_sumar);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setBounds(85, 96, 42, 23);
		btn_menos.addActionListener(e -> {
            int currentQuantity = Integer.parseInt(textField.getText());
            if (currentQuantity > 0) { 
                int newQuantity = currentQuantity - 1; 
                textField.setText(Integer.toString(newQuantity)); 
            }
            updateCantidad(Integer.parseInt(textField.getText()));
        });
		add(btn_menos);
		
		JButton btn_dejarComentario = new JButton("");
		btn_dejarComentario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String call = pro.getCampoClavePrimaria() + " = " + pro.getPrimaryKey() + " AND " + us.getCampoClavePrimaria();
            	
            	Valoracion val = (Valoracion) cv.getRegistro(call, Integer.toString(us.getPrimaryKey()));
            	
            	System.out.println("btn_anadirCarrito");
            	
            	if(val != null) {
            		cv.upDateRegistro(val, "valoracion", Integer.toString(rating));
            		System.out.println("updated");
            	} else {
            		System.out.println("Product valorado");
                    String nu = "'" + us.getPrimaryKey() + "', '" + pro.getPrimaryKey() + "', '" + rating + "', '" + txt_comentario.getText() + "', 1";
                    
                    cv.crearRegistro(nu);
                    System.out.println("register");
            	}
				
				
			}
		});
		btn_dejarComentario.setIcon(new ImageIcon(c_producto.class.getResource("/recursos/front/front/front_elementos/usuario/carrito/btn/btn_dejarComentario.png")));
		btn_dejarComentario.setBounds(18, 136, 89, 23);
		btn_dejarComentario.setBorderPainted(false);
		btn_dejarComentario.setContentAreaFilled(false);
		add(btn_dejarComentario);
		
		JLabel h3_costo = new JLabel("Total Bs." + (pro.getPrecio() * Double.parseDouble(textField.getText())));
		h3_costo.setFont(new Font("Lufga", Font.PLAIN, 11));
		h3_costo.setBounds(10, 123, 117, 14);
		add(h3_costo);
		
		
		
		JLabel h2_Usuario = new JLabel(us.getNombre());
		h2_Usuario.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_Usuario.setBounds(145, 18, 138, 14);
		add(h2_Usuario);
		
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
	
	private void updateCantidad(int cantidad) {
		
		CCarro cc = new CCarro();
		
		cc.upDateRegistro(ca, "cantidad", Integer.toString(cantidad));
		System.out.println("updated");
	}
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

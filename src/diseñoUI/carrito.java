package diseñoUI;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesBDs.Carro;
import clasesBDs.Producto;
import clasesBDs.Usuario;
import controladores.CCarro;
import controladores.CProducto;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class carrito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Usuario us;
	
	JLabel lblNewLabel1;
	
	CProducto cp = new CProducto();
	CCarro cc = new CCarro();

	/**
	 * Create the frame.
	 */
	public carrito(Usuario us) {
		
		this.us = us;
		
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnHP = new JButton("home");
		btnHP.setBounds(653, 11, 89, 23);
		btnHP.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	dispose();
                System.out.println("Home button clicked!");
                
                home_page frame = new home_page(us);
                frame.setVisible(true);
            }
        });
		contentPane.add(btnHP);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(carrito.class.getResource("/recursos/front/front/front_elementos/usuario/carrito/Img/img_carrito.png")));
		lblNewLabel.setBounds(26, 4, 34, 67);
		contentPane.add(lblNewLabel);
		
		JLabel img_carrito = new JLabel("");
		img_carrito.setIcon(new ImageIcon(carrito.class.getResource("/recursos/front/front/front_elementos/usuario/carrito/Img/img_carrito.png")));
		img_carrito.setBounds(31, 4, 34, 67);
		contentPane.add(img_carrito);
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, 0, 778, 78);
		bg.setIcon(new ImageIcon(carrito.class.getResource("/recursos/front/front/front_elementos/usuario/carrito/bg_navbar.png")));
		contentPane.add(bg);
		
		JButton btn_compra = new JButton("");
		btn_compra.setIcon(new ImageIcon(carrito.class.getResource("/recursos/front/front/front_elementos/usuario/carrito/btn/Btn_compraAhora.png")));
		btn_compra.setBounds(574, 323, 111, 37);
		btn_compra.setBorderPainted(false);		
		btn_compra.setContentAreaFilled(false);
		contentPane.add(btn_compra);
		btn_compra.setBounds(606, 334, 118, 45);
		btn_compra.setBorderPainted(false);		
		btn_compra.setContentAreaFilled(false);
		btn_compra.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	dispose();
	            System.out.println("Compra button clicked!");
	            
	            ingresar_tarjeta frame = new ingresar_tarjeta(us);
                frame.setVisible(true);
	        }
	    });
		contentPane.add(btn_compra);
		
		ArrayList<Carro> carro = cc.getRegistroList("id_usu", Integer.toString(us.getPrimaryKey()));
		updateScroll(carro);
		
	}
	
	public void updateScroll(ArrayList<Carro> carro) {
		
		int size = carro.size();
		double total = 0;
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 89, 732, 232);
		contentPane.add(scrollPane);
		
		JPanel productoPanel = new JPanel();
        productoPanel.setLayout(new BoxLayout(productoPanel, BoxLayout.Y_AXIS));
        productoPanel.setPreferredSize(new Dimension(565, size * 160));
        
		for (int i = 0; i < size; i++) {
			c_producto ca;
			Producto pro = cp.getRegistro("id_pro", Integer.toString(carro.get(i).getIDpro()));
            productoPanel.add(ca = new c_producto(pro, us, carro.get(i)));
            
            total += carro.get(i).getPrecio() * carro.get(i).getCantidad();
        }
		
		lblNewLabel1 = new JLabel("Total: Bs " + total);
		lblNewLabel1.setFont(new Font("Lufga Black", Font.PLAIN, 25));
		lblNewLabel1.setBounds(32, 340, 520, 35);
		contentPane.add(lblNewLabel1);
		
		scrollPane.setViewportView(productoPanel);
		
		
	}
	public void updateTotal(ArrayList<Carro> carro) {
		
		int size = carro.size();
		double total = 0;
		
		for (int i = 0; i < size; i++) {
            total += carro.get(i).getPrecio() * carro.get(i).getCantidad();
        }
		lblNewLabel1.setText("Total: Bs " + total);
	}
}

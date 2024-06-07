package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesBDs.Producto;
import clasesBDs.Usuario;
import controladores.CProducto;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;

public class home_page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField var_search;
	private Usuario us;
	
	
	CProducto cp = new CProducto();

	/**
	 * Create the frame.
	 */
	public home_page(Usuario us) {
		
		this.us = us;
		
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_administrarPerfil = new JButton("Administrar Perfil");
		btn_administrarPerfil.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_administrarPerfil.setBounds(12, 317, 131, 23);
		btn_administrarPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	dispose(); 
            	
            	administrar_perfil frame = new administrar_perfil(us);
        		frame.setVisible(true);
            	
                System.out.println("Carrito button clicked!");
            }
        });
		contentPane.add(btn_administrarPerfil);
		
		JButton btn_categoría3 = new JButton("Categoría 3");
		btn_categoría3.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_categoría3.setBounds(25, 246, 103, 23);
		contentPane.add(btn_categoría3);
		
		JButton btn_categoría2 = new JButton("Categoría 2");
		btn_categoría2.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_categoría2.setBounds(26, 183, 102, 23);
		contentPane.add(btn_categoría2);
		
		JButton btn_search = new JButton("");
		btn_search.setBounds(104, 35, 27, 23);
		btn_search.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_buscar.png")));
		contentPane.add(btn_search);
		
		var_search = new JTextField();
		var_search.setBounds(18, 35, 86, 23);
		contentPane.add(var_search);
		var_search.setColumns(10);
		
		JButton btn_categoría1 = new JButton("Categoría 1");
		btn_categoría1.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_categoría1.setBounds(28, 124, 100, 23);
		contentPane.add(btn_categoría1);
		
		JLabel bg_sidebar = new JLabel("");
		bg_sidebar.setBounds(0, 11, 150, 433);
		bg_sidebar.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/bg_sidebar.png")));
		contentPane.add(bg_sidebar);
		
		JButton btn_carrito = new JButton("");
		btn_carrito.setBounds(640, 310, 89, 71);
		btn_carrito.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_carrito.png")));
		btn_carrito.setBorderPainted(false);
		btn_carrito.setContentAreaFilled(false);
		btn_carrito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	dispose(); 
            	
            	carrito frame = new carrito(us);
        		frame.setVisible(true);
            	
                System.out.println("Carrito button clicked!");
                // You can add more actions here
            }
        });
		contentPane.add(btn_carrito);
		
		ArrayList<Producto> productos = cp.getAllARegistros();
		updateScroll(productos);
	}
	
	public void updateScroll(ArrayList<Producto> productos) {
		
		int size = productos.size();
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(160, 11, 583, 370);
		contentPane.add(scrollPane);
		
		JPanel productoPanel = new JPanel();
        productoPanel.setLayout(new BoxLayout(productoPanel, BoxLayout.Y_AXIS));
        productoPanel.setPreferredSize(new Dimension(565, size * 132));
        
		for (int i = 0; i < size; i++) {
			hp_producto pro;
            productoPanel.add(pro = new hp_producto(productos.get(i), us));
        }
		scrollPane.setViewportView(productoPanel);
	}
}

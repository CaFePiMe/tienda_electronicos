package diseñoUI;

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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ingresar_tarjeta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Usuario us;
	
	CProducto cp = new CProducto();
	CCarro cc = new CCarro();

	/**
	 * Create the frame.
	 */
	public ingresar_tarjeta(Usuario us) {
		
		this.us = us;
		
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel h1 = new JLabel("Ingrese los datos de su tarjeta");
		h1.setFont(new Font("Lufga Black", Font.PLAIN, 19));
		h1.setForeground(new Color(255, 255, 255));
		h1.setBounds(34, 27, 281, 26);
		contentPane.add(h1);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(ingresar_tarjeta.class.getResource("/recursos/front/front/front_elementos/usuario/ingresar_tarjeta/bg_navbar.png")));
		bg.setBounds(0, -10, 750, 100);
		contentPane.add(bg);
		
		JLabel h2_numero = new JLabel("Numero de tarjeta");
		h2_numero.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_numero.setBounds(34, 105, 135, 19);
		contentPane.add(h2_numero);
		
		textField = new JTextField();
		textField.setBounds(34, 130, 297, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel h2_nombre = new JLabel("Nombre");
		h2_nombre.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_nombre.setBounds(34, 213, 135, 19);
		contentPane.add(h2_nombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(34, 230, 135, 20);
		contentPane.add(textField_1);
		
		JLabel h2_apellido = new JLabel("Apellido");
		h2_apellido.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_apellido.setBounds(190, 213, 135, 19);
		contentPane.add(h2_apellido);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 230, 146, 20);
		contentPane.add(textField_2);
		
		JLabel h2_fecha = new JLabel("Fecha de Vencimiento");
		h2_fecha.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_fecha.setBounds(190, 161, 146, 19);
		contentPane.add(h2_fecha);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(190, 182, 86, 20);
		contentPane.add(textField_3);
		
		JLabel h2_cvv = new JLabel("CVV");
		h2_cvv.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_cvv.setBounds(34, 160, 104, 19);
		contentPane.add(h2_cvv);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(34, 182, 104, 20);
		contentPane.add(textField_4);
		
		ArrayList<Carro> carro = cc.getRegistroList("id_usu", Integer.toString(us.getPrimaryKey()));
		updateTotal(carro);
		
		JButton btn_subir = new JButton("");
		btn_subir.setIcon(new ImageIcon(ingresar_tarjeta.class.getResource("/recursos/front/front/front_elementos/usuario/ingresar_tarjeta/btn/btn_subir.png")));
		btn_subir.setBounds(31, 324, 89, 23);
		btn_subir.setBorderPainted(false);
		btn_subir.setContentAreaFilled(false);
		btn_subir.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	dispose();
                System.out.println("Home button clicked!");
                
                home_page frame = new home_page(us);
                frame.setVisible(true);
                
                ArrayList<Carro> carro = cc.getRegistroList("id_usu", Integer.toString(us.getPrimaryKey()));
                
                int size = carro.size();
        		
        		for (int i = 0; i < size; i++) {
        			Producto pro = cp.getRegistro("id_pro", Integer.toString(carro.get(i).getIDpro()));
        			cc.upDateRegistro(carro.get(i), "stock", Integer.toString((pro.getStock()-carro.get(i).getCantidad())));
        			cc.borrarRegistro(carro.get(i));
                }
                
            }
        });
		contentPane.add(btn_subir);
	}
	
	public void updateTotal(ArrayList<Carro> carro) {
		
		int size = carro.size();
		double total = 0;
		
		for (int i = 0; i < size; i++) {
            total += carro.get(i).getPrecio() * carro.get(i).getCantidad();
        }
		JLabel int_total = new JLabel("Total Bs." + total);
		int_total.setFont(new Font("Lufga Black", Font.PLAIN, 19));
		int_total.setBounds(34, 276, 394, 26);
		contentPane.add(int_total);
	}
}

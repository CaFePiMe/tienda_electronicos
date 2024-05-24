package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.Color;

public class home_page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField var_search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home_page frame = new home_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public home_page() {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_administrarPerfil = new JButton("Administrar Perfil");
		btn_administrarPerfil.setBounds(12, 317, 122, 23);
		contentPane.add(btn_administrarPerfil);
		
		JButton btn_categoría3 = new JButton("Categoría 3");
		btn_categoría3.setBounds(28, 246, 89, 23);
		contentPane.add(btn_categoría3);
		
		JButton btn_categoría2 = new JButton("Categoría 2");
		btn_categoría2.setBounds(29, 183, 89, 23);
		contentPane.add(btn_categoría2);
		
		JButton btn_search = new JButton("");
		btn_search.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_buscar.png")));
		btn_search.setBounds(104, 35, 27, 23);
		contentPane.add(btn_search);
		
		var_search = new JTextField();
		var_search.setBounds(18, 35, 86, 23);
		contentPane.add(var_search);
		var_search.setColumns(10);
		
		JButton btn_categoría1 = new JButton("Categoría 1");
		btn_categoría1.setBounds(31, 124, 89, 23);
		contentPane.add(btn_categoría1);
		
		JLabel bg_sidebar = new JLabel("");
		bg_sidebar.setBounds(0, 0, 150, 433);
		bg_sidebar.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/bg_sidebar.png")));
		contentPane.add(bg_sidebar);
		
		JButton btn_carrito = new JButton("");
		btn_carrito.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_carrito.png")));
		btn_carrito.setBounds(640, 310, 89, 71);
		btn_carrito.setBorderPainted(false);
		btn_carrito.setContentAreaFilled(false);
		contentPane.add(btn_carrito);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(new Color(0, 0, 160));
		scrollBar.setForeground(new Color(0, 0, 160));
		scrollBar.setBounds(170, 0, 565, 381);
		contentPane.add(scrollBar);
	}
}

package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

public class admin_verProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_verProducto frame = new admin_verProducto();
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
	public admin_verProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(18, 35, 86, 23);
		contentPane.add(textField);
		
		JButton btn_search = new JButton("");
		btn_search.setIcon(new ImageIcon(admin_verProducto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/btn/btn_buscar.png")));
		btn_search.setBounds(104, 35, 27, 23);
		contentPane.add(btn_search);
		
		JButton btn_categoría1 = new JButton("Categoría 1");
		btn_categoría1.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_categoría1.setBounds(28, 124, 100, 23);
		contentPane.add(btn_categoría1);
		
		JButton btn_categoría2 = new JButton("Categoría 2");
		btn_categoría2.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_categoría2.setBounds(26, 183, 102, 23);
		contentPane.add(btn_categoría2);
		
		JButton btn_categoría3 = new JButton("Categoría 3");
		btn_categoría3.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_categoría3.setBounds(25, 246, 103, 23);
		contentPane.add(btn_categoría3);
		
		JLabel bg_sidebar = new JLabel("");
		bg_sidebar.setIcon(new ImageIcon(admin_verProducto.class.getResource("/recursos/front/front/front_elementos/admin/ver_producto/bg_sidebar.png")));
		bg_sidebar.setBounds(0, 0, 150, 433);
		contentPane.add(bg_sidebar);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(160, 11, 582, 575);
		contentPane.add(scrollBar);
	}
}

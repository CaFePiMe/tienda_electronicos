package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;

public class carrito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carrito frame = new carrito();
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
	public carrito() {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total: Bs 0");
		lblNewLabel.setFont(new Font("Lufga Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(32, 340, 147, 35);
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
		btn_compra.setBounds(606, 334, 118, 45);
		btn_compra.setBorderPainted(false);		
		btn_compra.setContentAreaFilled(false);
		contentPane.add(btn_compra);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(10, 89, 732, 293);
		contentPane.add(scrollBar);
	}
}

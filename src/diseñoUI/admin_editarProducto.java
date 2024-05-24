package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class admin_editarProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_editarProducto frame = new admin_editarProducto();
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
	public admin_editarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(admin_editarProducto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/resistores.png")));
		lblNewLabel_1.setBounds(55, 42, 55, 56);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("ID_9002392");
		lblNewLabel.setFont(new Font("Lufga Black", Font.PLAIN, 13));
		lblNewLabel.setBounds(47, 109, 70, 14);
		contentPane.add(lblNewLabel);
		
		JButton btn_anadirProducto = new JButton("");
		btn_anadirProducto.setIcon(new ImageIcon(admin_editarProducto.class.getResource("/recursos/front/front/front_elementos/admin/editar_producto/btn/btn_añadirProducto.png")));
		btn_anadirProducto.setBounds(620, 305, 89, 77);
		btn_anadirProducto.setBorderPainted(false);
		btn_anadirProducto.setContentAreaFilled(false);
		contentPane.add(btn_anadirProducto);
	}

}

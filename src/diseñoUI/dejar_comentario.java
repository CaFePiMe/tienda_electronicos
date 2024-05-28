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

public class dejar_comentario extends JFrame {

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
					dejar_comentario frame = new dejar_comentario();
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
	public dejar_comentario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_volverCarrito = new JButton("Volver al Carrito");
		btn_volverCarrito.setFont(new Font("Lufga", Font.PLAIN, 11));
		btn_volverCarrito.setBounds(43, 30, 131, 23);
		contentPane.add(btn_volverCarrito);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(dejar_comentario.class.getResource("/recursos/front/front/front_elementos/usuario/carrito/bg_navbar.png")));
		bg.setBounds(0, 0, 752, 78);
		contentPane.add(bg);
		
		textField = new JTextField();
		textField.setBounds(43, 112, 655, 226);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel h2_dejarComentario = new JLabel("Deja tu comentario");
		h2_dejarComentario.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_dejarComentario.setBounds(43, 91, 113, 14);
		contentPane.add(h2_dejarComentario);
		
		JButton btn_subirComentario = new JButton("Subir comentario");
		btn_subirComentario.setFont(new Font("Lufga ExtraBold", Font.PLAIN, 11));
		btn_subirComentario.setBounds(573, 349, 125, 23);
		contentPane.add(btn_subirComentario);
	}

}

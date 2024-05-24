package diseñoUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class compra_realizada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compra_realizada frame = new compra_realizada();
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
	public compra_realizada() {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BG = new JLabel("");
		BG.setBounds(-3, 0, 768, 78);
		BG.setIcon(new ImageIcon(compra_realizada.class.getResource("/recursos/front/front/front_elementos/usuario/compra_realizada/bg_navbar.png")));
		contentPane.add(BG);
		
		JLabel H1 = new JLabel("COMPRA REALIZADA");
		H1.setForeground(new Color(27, 20, 100));
		H1.setFont(new Font("Lufga Black", Font.PLAIN, 45));
		H1.setBounds(146, 152, 460, 52);
		contentPane.add(H1);
		
		JLabel H2 = new JLabel("¡Muchas gracias!");
		H2.setFont(new Font("Lufga SemiBold", Font.PLAIN, 35));
		H2.setBounds(235, 191, 282, 52);
		contentPane.add(H2);
		
		JButton btn_factura = new JButton("imprimir factura");
		btn_factura.setForeground(new Color(27, 20, 100));
		btn_factura.setFont(new Font("Lufga", Font.PLAIN, 9));
		btn_factura.setBounds(326, 254, 100, 23);
		contentPane.add(btn_factura);
		
		JButton btn_volver = new JButton("");
		btn_volver.setIcon(new ImageIcon(compra_realizada.class.getResource("/recursos/front/front/front_elementos/usuario/compra_realizada/btn/btn_volver.png")));
		btn_volver.setBounds(318, 289, 117, 31);
		btn_volver.setBorderPainted(false);
		btn_volver.setContentAreaFilled(false);
		contentPane.add(btn_volver);
	}
}

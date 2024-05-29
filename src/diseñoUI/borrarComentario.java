package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class borrarComentario extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public borrarComentario() {
		setLayout(null);
		
		JTextArea txt_comentario = new JTextArea();
		txt_comentario.setText("\"El transistor 2N2222A es simplemente excepcional. Su versatilidad y confiabilidad lo\r\nconvierten en una opción de primera categoría para una amplia gama de aplicaciones,\r\ndesde simples proyectos de aficionados hasta proyectos industriales más complejos.\r\nSu bajo voltaje de saturación y alta ganancia de corriente lo hacen perfecto para\r\namplificación de señales y conmutación eficiente.\r\n¡Un componente indispensable en cualquier banco de trabajo electrónico!\"");
		txt_comentario.setFont(new Font("Lufga", Font.PLAIN, 12));
		txt_comentario.setBounds(10, 36, 531, 111);
		add(txt_comentario);
		
		JLabel h2_Usuario = new JLabel("USUARIO 809293004");
		h2_Usuario.setFont(new Font("Lufga SemiBold", Font.PLAIN, 13));
		h2_Usuario.setBounds(10, 13, 138, 14);
		add(h2_Usuario);
		
		JButton btn_borrarProducto = new JButton("");
		btn_borrarProducto.setIcon(new ImageIcon(borrarComentario.class.getResource("/recursos/front/front/front_elementos/admin/panel_comentarios/btn/btn_borrarComentario.png")));
		btn_borrarProducto.setBounds(575, 124, 89, 23);
		btn_borrarProducto.setBorderPainted(false);
		btn_borrarProducto.setContentAreaFilled(false);
		add(btn_borrarProducto);

	}

}

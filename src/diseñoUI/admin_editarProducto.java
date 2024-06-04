package diseñoUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;

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
        contentPane.setLayout(null); // Usar layout nulo para posiciones absolutas

        setContentPane(contentPane);

        // Crear un JLayeredPane y agregar ambos componentes
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 768, 432);
        contentPane.add(layeredPane);

        // Botón del añadir producto con posición absoluta, en el JLayeredPane
        JButton btn_anadirProducto = new JButton("");
        btn_anadirProducto.setIcon(new ImageIcon(admin_editarProducto.class.getResource("/recursos/front/front/front_elementos/admin/editar_producto/btn/btn_añadirProducto.png")));
        btn_anadirProducto.setBounds(620, 305, 89, 77);
        btn_anadirProducto.setBorderPainted(false);
        btn_anadirProducto.setContentAreaFilled(false);
        layeredPane.add(btn_anadirProducto, JLayeredPane.PALETTE_LAYER); // Asegura que el botón esté al frente
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 752, 476);
        contentPane.add(scrollPane);
    }
}

package diseñoUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.CProducto;
import controladores.CUsuario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;

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
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 752, 476);
        contentPane.add(scrollPane);
        
        // Crear un JLayeredPane y agregar ambos componentes
        JLayeredPane layeredPane = new JLayeredPane();
        scrollPane.setViewportView(layeredPane);
        
        adm_producto pro = new adm_producto();
        pro.setLocation(81, 41);
        pro.setSize(570, 170);
        layeredPane.add(pro);
               
        // Botón del añadir producto con posición absoluta, en el JLayeredPane
        JButton btn_anadirProducto = new JButton("");
        
        btn_anadirProducto.setIcon(new ImageIcon(admin_editarProducto.class.getResource("/recursos/front/front/front_elementos/admin/editar_producto/btn/btn_añadirProducto.png")));
        btn_anadirProducto.setBounds(620, 305, 89, 77);
        btn_anadirProducto.setBorderPainted(false);
        btn_anadirProducto.setContentAreaFilled(false);
        btn_anadirProducto.addActionListener(e -> {
        	String pr = pro.getProduct();
        	CProducto cp = new CProducto();
            System.out.println(pr);
        	cp.crearRegistro(pr);
        });
        layeredPane.add(btn_anadirProducto, JLayeredPane.PALETTE_LAYER);
        
        
    }
}

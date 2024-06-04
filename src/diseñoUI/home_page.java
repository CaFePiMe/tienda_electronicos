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
<<<<<<< HEAD
=======
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;
>>>>>>> a5780ddab033ebfd848f095c878acbfe173b64b8
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;

public class home_page extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField var_search;


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


    public home_page() {
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 769, 431);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); 

        setContentPane(contentPane);

        JButton btn_administrarPerfil = new JButton("Administrar Perfil");
        btn_administrarPerfil.setFont(new Font("Lufga", Font.PLAIN, 11));
        btn_administrarPerfil.setBounds(12, 317, 131, 23);
        contentPane.add(btn_administrarPerfil);

        JButton btn_categoría3 = new JButton("Categoría 3");
        btn_categoría3.setFont(new Font("Lufga", Font.PLAIN, 11));
        btn_categoría3.setBounds(25, 246, 103, 23);
        contentPane.add(btn_categoría3);

        JButton btn_categoría2 = new JButton("Categoría 2");
        btn_categoría2.setFont(new Font("Lufga", Font.PLAIN, 11));
        btn_categoría2.setBounds(26, 183, 102, 23);
        contentPane.add(btn_categoría2);

        JButton btn_search = new JButton("");
        btn_search.setBounds(104, 35, 27, 23);
        btn_search.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_buscar.png")));
        contentPane.add(btn_search);

        var_search = new JTextField();
        var_search.setBounds(18, 35, 86, 23);
        contentPane.add(var_search);
        var_search.setColumns(10);

        JButton btn_categoría1 = new JButton("Categoría 1");
        btn_categoría1.setFont(new Font("Lufga", Font.PLAIN, 11));
        btn_categoría1.setBounds(28, 124, 100, 23);
        contentPane.add(btn_categoría1);

        JLabel bg_sidebar = new JLabel("");
        bg_sidebar.setBounds(0, 11, 150, 433);
        bg_sidebar.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/bg_sidebar.png")));
        contentPane.add(bg_sidebar);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(160, 11, 583, 370);
        contentPane.add(scrollPane);

        JPanel productoPanel = new JPanel();
        productoPanel.setLayout(new BoxLayout(productoPanel, BoxLayout.Y_AXIS));
        productoPanel.setPreferredSize(new Dimension(565, 5 * 132));

        for (int i = 0; i < 5; i++) {
            hp_producto producto = new hp_producto();
            productoPanel.add(producto);
        }

        scrollPane.setViewportView(productoPanel);

      
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 769, 431);
        contentPane.add(layeredPane);

       
        scrollPane.setBounds(160, 11, 583, 370);
        layeredPane.add(scrollPane, JLayeredPane.DEFAULT_LAYER);

       
        JButton btn_carrito = new JButton("");
        btn_carrito.setIcon(new ImageIcon(home_page.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/btn_carrito.png")));
        btn_carrito.setBorderPainted(false);
        btn_carrito.setContentAreaFilled(false);
        btn_carrito.setBounds(640, 310, 89, 71); 
        layeredPane.add(btn_carrito, JLayeredPane.PALETTE_LAYER); 
    }
}

package diseñoUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sign_up extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField var_usuario;
    private JTextField var_correo;
    private JTextField var_contraseña;
    private JTextField var_ccontraseña;
    private JTextField textField;
    private JFrame previousFrame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    sign_up frame = new sign_up(null);
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
    public sign_up(JFrame previousFrame) {
        this.previousFrame = previousFrame; // Guarda la referencia al frame anterior

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 767, 433);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("G:\\progra-2\\tienda_electronicos\\src\\images\\usericon.png"));
        lblNewLabel.setBounds(0, 58, 245, 210);
        contentPane.add(lblNewLabel);
        
        JButton btn_YatienesUnUsuario_1 = new JButton("Registrarse");
        btn_YatienesUnUsuario_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btn_YatienesUnUsuario_1.setIcon(new ImageIcon("C:\\Users\\Sebastian\\Documents\\tienda_electronicos\\front\\front\\front_elementos\\usuario\\sign_up\\btn\\btn_registrarse.png"));
        btn_YatienesUnUsuario_1.setBounds(301, 298, 110, 23);
        contentPane.add(btn_YatienesUnUsuario_1);
        
        JButton btn_YatienesUnUsuario = new JButton("Ya tienes un Usuario?");
        btn_YatienesUnUsuario.setSelectedIcon(new ImageIcon("C:\\Users\\Sebastian\\Documents\\tienda_electronicos\\front\\front\\front_elementos\\usuario\\log_in\\btn\\btn_noTienesUnUsuario.png"));
        btn_YatienesUnUsuario.setBounds(488, 360, 144, 23);
        contentPane.add(btn_YatienesUnUsuario);

        // Agregar ActionListener al botón "Ya tienes un Usuario?"
        btn_YatienesUnUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (previousFrame != null) {
                    previousFrame.setVisible(true); // Mostrar el frame anterior
                }
                sign_up.this.setVisible(false); // Ocultar el sign_up frame
            }
        });
        
        JLabel h3_nit = new JLabel("NIT");
        h3_nit.setForeground(Color.WHITE);
        h3_nit.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
        h3_nit.setBounds(301, 252, 129, 14);
        contentPane.add(h3_nit);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(302, 267, 266, 20);
        contentPane.add(textField);
        
        var_ccontraseña = new JTextField();
        var_ccontraseña.setToolTipText("Solo! 4 LETRAS y 3 NUMEROS");
        var_ccontraseña.setColumns(10);
        var_ccontraseña.setBounds(303, 223, 266, 20);
        contentPane.add(var_ccontraseña);
        
        JLabel h3_ccontr = new JLabel("Confirmar contraseña");
        h3_ccontr.setForeground(Color.WHITE);
        h3_ccontr.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
        h3_ccontr.setBounds(302, 208, 129, 14);
        contentPane.add(h3_ccontr);
        
        var_contraseña = new JTextField();
        var_contraseña.setToolTipText("Solo! 4 LETRAS y 3 NUMEROS");
        var_contraseña.setColumns(10);
        var_contraseña.setBounds(303, 177, 266, 20);
        contentPane.add(var_contraseña);
        
        JLabel h3_contr = new JLabel("Contraseña");
        h3_contr.setForeground(Color.WHITE);
        h3_contr.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
        h3_contr.setBounds(302, 162, 64, 14);
        contentPane.add(h3_contr);
        
        var_correo = new JTextField();
        var_correo.setToolTipText("FORMATO (username@domain.com)");
        var_correo.setColumns(10);
        var_correo.setBounds(303, 133, 266, 20);
        contentPane.add(var_correo);
        
        JLabel h3_corr = new JLabel("Correo");
        h3_corr.setForeground(Color.WHITE);
        h3_corr.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
        h3_corr.setBounds(302, 118, 46, 14);
        contentPane.add(h3_corr);
        
        var_usuario = new JTextField();
        var_usuario.setToolTipText("Solo Numeros y Letras");
        var_usuario.setBounds(303, 94, 266, 20);
        contentPane.add(var_usuario);
        var_usuario.setColumns(10);
        
        JLabel h3 = new JLabel("Usuario");
        h3.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
        h3.setForeground(new Color(255, 255, 255));
        h3.setBounds(302, 79, 46, 14);
        contentPane.add(h3);
        
        JLabel h2 = new JLabel("Registrate completando los espacios porfavor");
        h2.setFont(new Font("Lufga", Font.PLAIN, 15));
        h2.setForeground(new Color(255, 255, 255));
        h2.setBounds(302, 58, 340, 20);
        contentPane.add(h2);
        
        JLabel h1 = new JLabel("¡Bienvenido!");
        h1.setFont(new Font("Lufga Black", Font.PLAIN, 35));
        h1.setForeground(new Color(255, 255, 255));
        h1.setBounds(302, 23, 223, 33);
        contentPane.add(h1);
        
        // Añadir ActionListener al botón de registrarse
        btn_YatienesUnUsuario_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Validar los campos antes de procesar el registro
                if (!validarUsuario(var_usuario.getText())) {
                    // Mostrar mensaje de error si el usuario no es válido
                    JOptionPane.showMessageDialog(sign_up.this, "El usuario solo puede contener letras y números.");
                    return;
                }
                if (!validarCorreo(var_correo.getText())) {
                    // Mostrar mensaje de error si el correo no es válido
                    JOptionPane.showMessageDialog(sign_up.this, "El correo debe tener un formato válido (username@domain.com)");
                    return;
                }
                if (!validarContraseña(var_contraseña.getText())) {
                    // Mostrar mensaje de error si la contraseña no es válida
                    JOptionPane.showMessageDialog(sign_up.this, "La contraseña DEBE contener 4 Letras+3 Numeros.");
                    return;
                }
                if (!var_contraseña.getText().equals(var_ccontraseña.getText())) {
                    // Mostrar mensaje de error si las contraseñas no coinciden
                    JOptionPane.showMessageDialog(sign_up.this, "Las contraseñas no coinciden.");
                    return;
                }
                // Si todas las validaciones pasan, puedes proceder con el registro
                // Tu código de registro aquí
            }
        });
    }

    // Método para validar el usuario
    private boolean validarUsuario(String usuario) {
        return usuario.matches("[a-zA-Z0-9]+");
    }

    // Método para validar el correo
    private boolean validarCorreo(String correo) {
        return correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

 // Método para validar la contraseña
    private boolean validarContraseña(String contraseña) {
        return contraseña.matches("[a-zA-Z]{4}[0-9]{3}");
    

    }
}

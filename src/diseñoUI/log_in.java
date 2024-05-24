package diseñoUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class log_in extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    log_in frame = new log_in();
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
    public log_in() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 768, 433);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btn_ingresar = new JButton("Ingresar");
        btn_ingresar.setFont(new Font("Tahoma", Font.BOLD, 11));
        btn_ingresar.setIcon(new ImageIcon("C:\\Users\\Sebastian\\Documents\\tienda_electronicos\\front\\front\\front_elementos\\usuario\\log_in\\btn\\btn_ingresar.png"));
        btn_ingresar.setBounds(319, 262, 96, 21);
        contentPane.add(btn_ingresar);
        
        JButton btn_noTienesUsuarip = new JButton("Registrarse");
        btn_noTienesUsuarip.setFont(new Font("Tahoma", Font.BOLD, 12));
        btn_noTienesUsuarip.setBounds(319, 321, 179, 21);
        contentPane.add(btn_noTienesUsuarip);

        // Agregar ActionListener al botón "¿No tienes un usuario?"
        btn_noTienesUsuarip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sign_up signUpFrame = new sign_up(log_in.this); // Pasar la referencia del frame actual
                signUpFrame.setVisible(true);
                // Ocultar el log_in frame
                log_in.this.setVisible(false);
            }
        });
        
        passwordField = new JPasswordField();
        passwordField.setBounds(314, 231, 266, 20);
        passwordField.setEchoChar('*'); // Establece el carácter de eco puede ser cualquier caracter.
        contentPane.add(passwordField);
        
        JLabel h3_contr = new JLabel("Contraseña");
        h3_contr.setForeground(Color.WHITE);
        h3_contr.setFont(new Font("Dialog", Font.BOLD, 12));
        h3_contr.setBounds(313, 216, 74, 14);
        contentPane.add(h3_contr);
        
        JLabel h3 = new JLabel("Usuario");
        h3.setForeground(Color.WHITE);
        h3.setFont(new Font("Dialog", Font.BOLD, 12));
        h3.setBounds(313, 171, 46, 14);
        contentPane.add(h3);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(314, 186, 266, 20);
        contentPane.add(textField);
        
        // Apply the DocumentFilter to the textField to restrict input to letters and digits
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string != null && string.matches("[a-zA-Z0-9]*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text != null && text.matches("[a-zA-Z0-9]*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        // Apply the DocumentFilter to the passwordField to restrict input to letters, digits, and no spaces
        ((AbstractDocument) passwordField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string != null && string.matches("[a-zA-Z0-9]*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text != null && text.matches("[a-zA-Z0-9]*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("G:\\progra-2\\tienda_electronicos\\src\\images\\usericon.png"));
        lblNewLabel_1.setBounds(53, 74, 256, 209);
        contentPane.add(lblNewLabel_1);
        
        JLabel h1 = new JLabel("¡Bienvenido!");
        h1.setForeground(Color.WHITE);
        h1.setFont(new Font("Lufga Black", Font.PLAIN, 35));
        h1.setBounds(311, 72, 223, 33);
        contentPane.add(h1);
        
        JLabel lblIngresaCompletandoLos = new JLabel("Ingresa completando los espacios por favor");
        lblIngresaCompletandoLos.setForeground(Color.WHITE);
        lblIngresaCompletandoLos.setFont(new Font("Lufga", Font.PLAIN, 15));
        lblIngresaCompletandoLos.setBounds(314, 116, 340, 20);
        contentPane.add(lblIngresaCompletandoLos);
    }
}

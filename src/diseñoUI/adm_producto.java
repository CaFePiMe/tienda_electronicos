package diseñoUI;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class adm_producto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tef_nombre;
	private JTextField txf_stock;
	private JTextField txf_distribuidor;
	private JTextField txf_categoria;
	private String path;

	/**
	 * Create the panel.
	 */
	public adm_producto() {
		setLayout(null);
		
		JTextPane des_producto = new JTextPane();
		des_producto.setBounds(179, 34, 285, 37);
		add(des_producto);
		
		JLabel h2_IdProducto = new JLabel("ID_9002392");
		h2_IdProducto.setFont(new Font("Lufga Black", Font.PLAIN, 13));
		h2_IdProducto.setBounds(30, 70, 70, 14);
		add(h2_IdProducto);
		
		JLabel img_producto = new JLabel("");
		img_producto.setIcon(new ImageIcon(adm_producto.class.getResource("/recursos/front/front/front_elementos/usuario/menu/btn/resistores.png")));
		img_producto.setBounds(38, 9, 55, 56);
		add(img_producto);
		
		JButton btn_subirImagen = new JButton("");
		btn_subirImagen.setIcon(new ImageIcon(adm_producto.class.getResource("/recursos/front/front/front_elementos/admin/editar_producto/btn/btn_subirImagen.png")));
		btn_subirImagen.setBounds(21, 89, 89, 23);
		btn_subirImagen.setBorderPainted(false);
		btn_subirImagen.setContentAreaFilled(false);
		btn_subirImagen.addActionListener(e -> {

            try {
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Seleccionar Imagen");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String projectPath = System.getProperty("user.dir");
                    File targetDir = new File(projectPath + "/src/recursos_productos");
                    if (!targetDir.exists()) {
                        targetDir.mkdirs();
                    }

                    File targetFile = new File(targetDir, selectedFile.getName());
                    Files.copy(selectedFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

                    this.path = targetFile.getName();
                    String resourcePath = "/recursos_productos/" + selectedFile.getName();
                    img_producto.setIcon(new ImageIcon(getClass().getResource(resourcePath)));
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
		add(btn_subirImagen);
		
		JButton btn_actualizar = new JButton("");
		btn_actualizar.setIcon(new ImageIcon(adm_producto.class.getResource("/recursos/front/front/front_elementos/admin/editar_producto/btn/btn_actualizar.png")));
		btn_actualizar.setBounds(21, 110, 89, 23);
		btn_actualizar.setBorderPainted(false);
		btn_actualizar.setContentAreaFilled(false);
		btn_actualizar.addActionListener(e -> {
			String nombre = tef_nombre.getText().trim();
			String descripcion = des_producto.getText().trim();
            int stock = Integer.parseInt(txf_stock.getText().trim()); 
            String distribuidor = txf_distribuidor.getText().trim();
            String categoria = txf_categoria.getText().trim();

            System.out.println("Nombre: " + nombre);
            System.out.println("Descripcin: " + descripcion);
            System.out.println("Stock: " + stock);
            System.out.println("distribuidor: " + distribuidor);
            System.out.println("Categoría: " + categoria);
        });
		add(btn_actualizar);
		
		JLabel h2_nombre = new JLabel("Nombre");
		h2_nombre.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_nombre.setBounds(113, 14, 46, 14);
		add(h2_nombre);
		
		JLabel h2_descripcion = new JLabel("Descripción");
		h2_descripcion.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_descripcion.setBounds(113, 34, 70, 14);
		add(h2_descripcion);
		
		JLabel h2_stock = new JLabel("Stock");
		h2_stock.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_stock.setBounds(113, 78, 46, 14);
		add(h2_stock);
		
		JLabel h2_distribuidor = new JLabel("Distribuidor");
		h2_distribuidor.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_distribuidor.setBounds(113, 97, 70, 14);
		add(h2_distribuidor);
		
		JLabel h2_categoria = new JLabel("Categoría");
		h2_categoria.setFont(new Font("Lufga SemiBold", Font.PLAIN, 11));
		h2_categoria.setBounds(113, 115, 60, 14);
		add(h2_categoria);
		
		tef_nombre = new JTextField();
		tef_nombre.setBounds(179, 9, 86, 20);
		add(tef_nombre);
		tef_nombre.setColumns(10);
		
		txf_stock = new JTextField();
		txf_stock.setColumns(10);
		txf_stock.setBounds(179, 79, 23, 14);
		add(txf_stock);
		
		txf_distribuidor = new JTextField();
		txf_distribuidor.setColumns(10);
		txf_distribuidor.setBounds(179, 98, 70, 14);
		add(txf_distribuidor);
		
		txf_categoria = new JTextField();
		txf_categoria.setBounds(179, 119, 70, 14);
		add(txf_categoria);
		txf_categoria.setColumns(10);
		
		
	}
}

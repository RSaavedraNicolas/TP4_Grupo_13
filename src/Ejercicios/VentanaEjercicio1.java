package Ejercicios;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTlf;
	private JTextField txtFecha;
	private JLabel lblDatos;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio1 frame = new VentanaEjercicio1();
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
	public VentanaEjercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		setLocation(350, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(69, 61, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(69, 86, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(69, 113, 65, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(69, 138, 65, 14);
		contentPane.add(lblFechaNac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(144, 58, 153, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(144, 83, 153, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTlf = new JTextField();
		txtTlf.setBounds(144, 107, 153, 20);
		contentPane.add(txtTlf);
		txtTlf.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(144, 132, 153, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		JButton btnAceptar = new JButton("Mostrar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*System.out.println("Nombre: " + txtNombre.getText() + ", Apellido: " + txtApellido.getText() 
				+ ", Teléfono: " + txtTlf.getText() + ", Fecha de Nacimiento: " + txtFecha.getText());*/
				
				String nombre = txtNombre.getText();
		        String apellido = txtApellido.getText();
		        String telefono = txtTlf.getText();
		        String fecha = txtFecha.getText();
		        
				if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || fecha.isEmpty()) {
					 if(nombre.isEmpty()) txtNombre.setBackground(Color.red);
				     if(apellido.isEmpty()) txtApellido.setBackground(Color.red);
				     if(telefono.isEmpty()) txtTlf.setBackground(Color.red);
				     if(fecha.isEmpty()) txtFecha.setBackground(Color.red);
				}else {
					lblDatos.setText("Datos: " + nombre + " " + apellido + ", " + telefono + ", " + fecha);
					  txtNombre.setBackground(Color.white);
					  txtApellido.setBackground(Color.white);
					  txtTlf.setBackground(Color.white);
					  txtFecha.setBackground(Color.white);
					  txtNombre.setText(null);
					  txtApellido.setText(null);
					  txtTlf.setText(null);
					  txtFecha.setText(null);
				}
				
				
			}
		});
		btnAceptar.setBounds(144, 177, 89, 34);
		contentPane.add(btnAceptar);
		
		lblDatos = new JLabel("");
        lblDatos.setBounds(34, 236, 350, 44);
        contentPane.add(lblDatos);
	}
	
    public void cambiarVisibilidad(boolean estado) {
        setVisible(true);
    }
}

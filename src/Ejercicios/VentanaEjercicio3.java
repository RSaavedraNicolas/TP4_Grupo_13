package Ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JMenu;
import java.awt.Canvas;

public class VentanaEjercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio3 frame = new VentanaEjercicio3();
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
	public VentanaEjercicio3() {
		setTitle("Seleccion Multiple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(31, 11, 454, 43);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSistema = new JLabel("Elije un sistema operativo");
		lblSistema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSistema.setBounds(10, 11, 137, 14);
		panel.add(lblSistema);
		
		JRadioButton rbtnWind = new JRadioButton("Windows");
		rbtnWind.setBounds(157, 7, 83, 23);
		panel.add(rbtnWind);
		
		JRadioButton rbtnMac = new JRadioButton("Mac");
		rbtnMac.setBounds(273, 7, 60, 23);
		panel.add(rbtnMac);
		
		JRadioButton rbtnLinux = new JRadioButton("Linux");
		rbtnLinux.setBounds(364, 7, 69, 23);
		panel.add(rbtnLinux);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setBounds(45, 110, 151, 14);
		contentPane.add(lblElijeUnaEspecialidad);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setBounds(302, 80, 124, 23);
		contentPane.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracion.setBounds(302, 106, 124, 23);
		contentPane.add(chckbxAdministracion);
		
		JCheckBox chckbxDiseoGrafico = new JCheckBox("Dise\u00F1o Grafico");
		chckbxDiseoGrafico.setBounds(302, 132, 124, 23);
		contentPane.add(chckbxDiseoGrafico);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador");
		lblCantidadDeHoras.setBounds(45, 199, 229, 14);
		contentPane.add(lblCantidadDeHoras);
		
		textField = new JTextField();
		textField.setBounds(302, 196, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	public void cambiarVisibilidad(boolean b) {
		setVisible(true);
	}
}

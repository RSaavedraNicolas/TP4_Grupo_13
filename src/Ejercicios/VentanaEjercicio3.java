package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class VentanaEjercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCantidadHoras;


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
	


	public VentanaEjercicio3() {
		setTitle("Seleccion Multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblSistema.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSistema.setBounds(10, 11, 159, 14);
		panel.add(lblSistema);
		
		JRadioButton rbtnWind = new JRadioButton("Windows");
		rbtnWind.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbtnWind.setBounds(177, 7, 83, 23);
		panel.add(rbtnWind);
		
		JRadioButton rbtnMac = new JRadioButton("Mac");
		rbtnMac.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbtnMac.setBounds(282, 7, 60, 23);
		panel.add(rbtnMac);
		
		JRadioButton rbtnLinux = new JRadioButton("Linux");
		rbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 11));
		rbtnLinux.setBounds(364, 7, 69, 23);
		panel.add(rbtnLinux);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbtnWind);
		group.add(rbtnMac);
		group.add(rbtnLinux);

		
		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxProgramacion.setBounds(302, 80, 124, 23);
		contentPane.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracion.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxAdministracion.setBounds(302, 106, 124, 23);
		contentPane.add(chckbxAdministracion);
		
		JCheckBox chckbxDiseoGrafico = new JCheckBox("Dise\u00F1o Grafico");
		chckbxDiseoGrafico.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxDiseoGrafico.setBounds(302, 132, 124, 23);
		contentPane.add(chckbxDiseoGrafico);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDeHoras.setBounds(41, 199, 229, 14);
		contentPane.add(lblCantidadDeHoras);
		
		textFieldCantidadHoras = new JTextField();
		textFieldCantidadHoras.setBounds(302, 196, 86, 20);
		contentPane.add(textFieldCantidadHoras);
		textFieldCantidadHoras.setColumns(10);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String SistemaOperativo = "";
	             String Especialidad = "";
	             
	             if (rbtnWind.isSelected()) {
	                    SistemaOperativo = "Windows";
	                } else if (rbtnMac.isSelected()) {
	                	SistemaOperativo = "Mac";
	                } else if (rbtnLinux.isSelected()) {
	                	SistemaOperativo = "Linux";
	                }

	             	
			        if (chckbxProgramacion.isSelected()) {
			        	Especialidad += "Programación - ";
	                }
	                if (chckbxAdministracion.isSelected()) {
	                	Especialidad += "Administración - ";
	                }
	                if (chckbxDiseoGrafico.isSelected()) {
	                	Especialidad += "Diseño Gráfico - ";
	                }
	                String mensaje = SistemaOperativo + " - " + Especialidad  + textFieldCantidadHoras.getText() + "Hs";
	                JOptionPane.showMessageDialog(contentPane, mensaje);
				}
		});
		
		btnAceptar.setBounds(370, 260, 89, 25);
		contentPane.add(btnAceptar);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY));
		panel_1.setBounds(31, 65, 454, 113);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblElijeUnaEspecialidad.setBounds(24, 36, 160, 14);
		panel_1.add(lblElijeUnaEspecialidad);
		
		
	}
	

	public void cambiarVisibilidad(boolean b) {
		setVisible(true);
	}
}

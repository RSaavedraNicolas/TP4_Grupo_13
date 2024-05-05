package Ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNota1;
	private JTextField textFieldNota2;
	private JTextField textFieldNota3;
	private JTextField textFieldPromedio;
	private JTextField textFieldCondición;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio2 frame = new VentanaEjercicio2();
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
	public VentanaEjercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 461, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Notas del Estudiante");
		label.setOpaque(true);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBackground(SystemColor.menu);
		label.setBounds(39, 173, 136, 29);
		contentPane.add(label);
		
		JLabel lblNotaEstudiantes = new JLabel("Notas del Estudiante");
		lblNotaEstudiantes.setOpaque(true);
		lblNotaEstudiantes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNotaEstudiantes.setBackground(SystemColor.control);
		lblNotaEstudiantes.setBounds(39, 21, 136, 29);
		contentPane.add(lblNotaEstudiantes);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.activeCaption);
		panel.setBorder(new LineBorder(new Color(153, 204, 255)));
		panel.setBounds(29, 35, 241, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1: ");
		lblNota1.setBounds(10, 24, 46, 14);
		panel.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(10, 49, 46, 14);
		panel.add(lblNota2);
		
		JLabel labelNota3 = new JLabel("Nota 3:");
		labelNota3.setBounds(10, 74, 46, 14);
		panel.add(labelNota3);
		
		JLabel labelTPS = new JLabel("TPS ");
		labelTPS.setHorizontalAlignment(SwingConstants.CENTER);
		labelTPS.setBounds(10, 99, 46, 14);
		panel.add(labelTPS);
		
		textFieldNota1 = new JTextField();
		textFieldNota1.setBounds(66, 21, 98, 20);
		panel.add(textFieldNota1);
		textFieldNota1.setColumns(10);
		
				
		
		textFieldNota2 = new JTextField();
		textFieldNota2.setColumns(10);
		textFieldNota2.setBounds(66, 46, 98, 20);
		panel.add(textFieldNota2);
	
		
		textFieldNota3 = new JTextField();
		textFieldNota3.setColumns(10);
		textFieldNota3.setBounds(66, 71, 98, 20);
		panel.add(textFieldNota3);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(66, 96, 98, 20);
		panel.add(comboBox);
		comboBox.addItem("Aprobado");
		comboBox.addItem("Desaprobado");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.activeCaption));
		panel_1.setBounds(27, 178, 243, 92);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(10, 31, 63, 14);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condici\u00F3n:");
		lblCondicion.setBounds(10, 56, 63, 14);
		panel_1.add(lblCondicion);
		
		textFieldPromedio = new JTextField();
		textFieldPromedio.setBounds(64, 28, 86, 20);
		panel_1.add(textFieldPromedio);
		textFieldPromedio.setColumns(10);
		
		textFieldCondición = new JTextField();
		textFieldCondición.setColumns(10);
		textFieldCondición.setBounds(64, 56, 86, 20);
		panel_1.add(textFieldCondición);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nota1 = textFieldNota1.getText();
				String nota2 = textFieldNota2.getText();
				String nota3 = textFieldNota3.getText();
				float total=0.0f;
				int cantidadNotas = 0;
				
				if (!nota1.isEmpty()) {
					float nota1float = Float.parseFloat(nota1);
					if(nota1float<1||nota1float>10) {
						textFieldNota1.setBackground(Color.red);
					}
					else {
						total+=nota1float;
						cantidadNotas++;
					}
				}else {
					textFieldNota1.setBackground(Color.red);
				}
				
				if (!nota2.isEmpty()) {
					float nota2float = Float.parseFloat(nota2);
					if(nota2float<1||nota2float>10||nota2.isEmpty()){
						textFieldNota2.setBackground(Color.red);
					}else {
						total+=nota2float;
						cantidadNotas++;
					}

				}
				else {
					textFieldNota2.setBackground(Color.red);
				}
				if (!nota3.isEmpty()) {
					float nota3float = Float.parseFloat(nota3);
					if(nota3float<1||nota3float>10||nota3.isEmpty()) {
						textFieldNota3.setBackground(Color.red);
					}else {
						total+=nota3float;
						cantidadNotas++;
					}
				}
				else {
					textFieldNota3.setBackground(Color.red);
				}
				
				String promedioText;
				float promedio = total / 3;
				
		        
		        if (promedio % 1 == 0) {
		            promedioText = String.format("%.0f", promedio);
		        } else {
		            promedioText = String.format("%.2f", promedio);
		        }
		        
		        if(cantidadNotas ==3) {
		        	textFieldPromedio.setText(promedioText);
		        }else {
		        	textFieldPromedio.setText("");
		        }
			}
		});
		btnCalcular.setBounds(290, 69, 112, 37);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNuevo.setBounds(290, 117, 112, 37);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(290, 167, 112, 41);
		contentPane.add(btnSalir);
	}
	
	 public void cambiarVisibilidad(boolean estado) {
	        setVisible(true);
	    }
}

package Ejercicios;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	private JButton boton;
	private JTextField txtNombre;
	

	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,300);
		
		setLocation(350,250);
		setTitle("GRUPO NRO: 13");
		setLayout(null);
		
		
		//Creación de botón Ejercicio 1
		boton = new JButton();
		boton.setText("Ejercicio 1");
		boton.setBounds(140, 50, 140, 30);
		getContentPane().add(boton);
		
		
		//Creación de botón Ejercicio 2
		boton = new JButton();
		boton.setText("Ejercicio 2");
		boton.setBounds(140, 100, 140, 30);
		getContentPane().add(boton);
		
		//Creación de botón Ejercicio 3
		boton = new JButton();
		boton.setText("Ejercicio 3");
		boton.setBounds(140, 150, 140, 30);
		getContentPane().add(boton);
		
		
		
	}

	public void cambiarvisibilidad(boolean estado) {
		
		setVisible(true);
	}
}

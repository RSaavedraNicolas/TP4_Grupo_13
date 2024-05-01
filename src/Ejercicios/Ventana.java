package Ejercicios;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,250);
		setTitle("Menu Principal");
		
	}

	public void cambiarvisibilidad(boolean estado) {
		
		setVisible(true);
	}
}

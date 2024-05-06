package Ejercicios;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private static final long serialVersionUID = 1L;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;

    public Ventana() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);

        setLocation(350, 250);
        setTitle("GRUPO NRO: 13");
        setLayout(null);

        // Creación de botón Ejercicio 1
        boton1 = new JButton();
        boton1.setText("Ejercicio 1");
        boton1.setBounds(140, 50, 140, 30);
        getContentPane().add(boton1);

        // Creación de botón Ejercicio 2
        boton2 = new JButton();
        boton2.setText("Ejercicio 2");
        boton2.setBounds(140, 100, 140, 30);
        getContentPane().add(boton2);

        // Creación de botón Ejercicio 3
        boton3 = new JButton();
        boton3.setText("Ejercicio 3");
        boton3.setBounds(140, 150, 140, 30);
        getContentPane().add(boton3);

        // ActionListener botón 1
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaEjercicio1 ventana1 = new VentanaEjercicio1();
                ventana1.cambiarVisibilidad(true);
            }
        });
        
        
        // ActionListener botón 2
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaEjercicio2 ventana2 = new VentanaEjercicio2();
                ventana2.cambiarVisibilidad(true);
            }
        });
        
     // ActionListener botón 3
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaEjercicio3 ventana3 = new VentanaEjercicio3();
                ventana3.cambiarVisibilidad(true);
            }
        });


    }

    public void cambiarVisibilidad(boolean estado) {
        setVisible(true);
    }
}

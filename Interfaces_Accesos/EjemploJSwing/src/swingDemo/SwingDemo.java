package swingDemo;

import java.awt.BorderLayout;

import javax.swing.*;

public class SwingDemo {

	public SwingDemo() {
		// Primero es crear el contenedor de alto nivel
		//Define  una ventana con todos los adornos  y la barra de titulo
		JFrame marco = new JFrame("Ejemplo de una apliaci�n Swing");
		
		//Se da al marco una dimensi�n inicial en pixeles 
		//void setSize (int width, int heigth)
		marco.setSize(300, 100);
		
		//Cuando el usuario presiona el aspa (X)  termina a apliacici�n.
		//Por defecto , cuando se cierra un aspa de alto nivel, la ventana se elimina,
		//pero la aplicaci�n sigue en marcha
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //Creaci�n de una etiqueta
		JLabel etiqueta = new JLabel("SWING es un framework para dibujar GUIs en Java");
		
		// a�adimos la etiqueta  al content pane
		// sintaxis Component add(Component comp)
		
		marco.add(etiqueta, BorderLayout.CENTER);
		
		// Hace visible la ventana
		marco.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		//Crear la apliaci�n  en el thread de despacho de eventos
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SwingDemo();
			}
		});
		
	}

}

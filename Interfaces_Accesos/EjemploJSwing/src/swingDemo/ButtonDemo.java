package swingDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonDemo  implements ActionListener{

	JLabel etiqueta;
	
	public ButtonDemo() {
		JFrame ventana = new JFrame("Ejemplo de boton");
		ventana.setLayout(new FlowLayout());
		ventana.setSize(250,100);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton arriba = new JButton("ARRIBA");
		JButton abajo = new JButton("ABAJO");
		
		arriba.addActionListener(this);
		abajo.addActionListener(this);
		
		
		// Añade los boootones al Content PAne
		ventana.add(arriba);
		ventana.add(abajo);
		
		etiqueta= new JLabel("Presionar uno de los botones");
		ventana.add(etiqueta);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
				SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new ButtonDemo();
			}
		});
				System.out.println("Fin del main");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("ARRIBA")) {
			etiqueta.setText("Has presionado el boton de ARRIBA");
		}
		if (e.getActionCommand().equals("ABAJO")) {
			etiqueta.setText("Has presionado el boton de ABAJO");
		}
	}

}

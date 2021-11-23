package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.ReverbType;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

//Campo de texto, botón y 2 etiquetas
//1 etiqueta da instrucciones al usuario para que introduzca texto en el campo de texto
//Cuando se presiona enter con el foco en el campo de texto, se extrae el texto y se muestra en la segunda etiqueta
//El boton se llama revertir Cuando se presiona el revierte al texto en el campo de texto

public class TextFieldDemo implements ActionListener {
	JLabel etiqueta1, etiqueta2;
	JTextField input;
	String texto="";
	JButton revertir;
	
	final String DEMO_TEST= "****************************";

	public TextFieldDemo() {
		JFrame ventana = new JFrame("Ejemplo de JTextField");
		ventana.setLayout(new FlowLayout());
		ventana.setSize(350,250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		revertir = new JButton("REVERTIR");
		
		revertir.addActionListener(this);
		
		
		
		// Añade los Label al COntent pane
		ventana.add(revertir);
		input = new JTextField(15);
		
		etiqueta1= new JLabel("Introduce el texto en el cuadro de texto");
		ventana.add(etiqueta1);
		ventana.setVisible(true);
		
		etiqueta2= new JLabel(DEMO_TEST);
		ventana.add(etiqueta2);
		
		ventana.add(input);
		
		ventana.setVisible(true);
		
		input.addActionListener(this);
		
		
		
	}

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new TextFieldDemo();
			}
		});
				System.out.println("Fin del main");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("REVERTIR")) {
			texto=input.getText();
			String textoaux="";		
			char ch;
			for (int i=0; i<texto.length(); i++)
		      {
		        ch= texto.charAt(i); 
		        textoaux= ch+textoaux; 
		      }
			System.out.println(textoaux);
			
			input.setText(textoaux);
		}
		if (e.getSource()==input) {
			etiqueta2.setText(input.getText());
		}
		
	}

}

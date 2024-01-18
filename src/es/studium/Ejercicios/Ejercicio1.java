package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements WindowListener, ActionListener
{
	// Variables y Objetos
	Frame ventana = new Frame("Par / Impar");
	TextField txtCalcular = new TextField(10);
	Button btnBoton = new Button("Calcular proceso");
	Label lblCalcular = new Label("                    							                    ");

	public Ejercicio1()
	{
		ventana.setTitle("Par / Impar");
		
		ventana.addWindowListener(this);
		btnBoton.addActionListener(this);

		ventana.setLayout(new FlowLayout());
		ventana.add(txtCalcular);
		ventana.add(btnBoton);
		ventana.add(lblCalcular);

		ventana.setSize(750, 70);
		ventana.setResizable(false);
		ventana.setBackground(Color.red);
		ventana.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejercicio1();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Coger el número escrito
		int numero = Integer.parseInt(txtCalcular.getText());
		// Comprobar si es par o impar
		String mensaje = "";
		if(numero % 2 == 0)
		{
			mensaje = "Es PAR";
		}
		else if (numero == 33) 
		{
			mensaje = "¿Me repites ese numerín?";
		}
		else 
		{
			mensaje = "Es IMPAR";
		}
		// Mostrar el resultado
		lblCalcular.setText(mensaje);
	}

}

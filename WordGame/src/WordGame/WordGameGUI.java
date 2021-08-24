package WordGame;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WordGameGUI extends JFrame {
	private Ficha ficha;
	private Serializacion serializador;
	private JButton boton;
	private JPanel panel;

	public WordGameGUI() {
		initGUI();
		
		this.setTitle("Word Game");
		
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Escucha tecla = new Escucha();
		addKeyListener(tecla);
	}
	
	public void initGUI() {
		panel = new JPanel();
		serializador = new Serializacion();
		
		definirGUI();
		
		boton = new JButton("a");
		add(boton, BorderLayout.CENTER);
		
	}

	private void definirGUI() {
		
		String [] opciones = {"Restaurar Ficha", "Nueva Ficha"};
		
		String opcionSeleccionada = (String)JOptionPane.showInputDialog(this, "Seleccionar", "Opciones", 
								    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
		
		if(opcionSeleccionada == null) {
			System.exit(0);
		} else if(opcionSeleccionada.equals("Restaurar Ficha")){
			ficha = serializador.deserializarObjeto();
		} else {
			ficha = new Ficha();
		}
	}
	
	private class Escucha implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			char letra = e.getKeyChar();
			

			System.out.println(letra);

			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int codigo = e.getKeyCode();
			System.out.println(codigo);
			
			String palabra = "";
			int i = 0;
			
			while(i==0) {
				palabra = palabra + e.getKeyChar();

				if(codigo == 10) {
					i = 1;
				}
			}
			System.out.println(palabra);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	
	}
 
}

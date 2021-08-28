package WordGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WordGameGUI extends JFrame {
	private Jugador jugador;
	private Serializacion serializador;
	private JButton boton;
	private JPanel panel;
	private JTextField palabras;
	private JTextArea area;


	public WordGameGUI() {
		
		initGUI();
	
		
		this.setTitle("Word Game");
		
		//this.pack();
		this.setSize(500,300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void initGUI() {
		
		Container contenedor = this.getContentPane();
		contenedor.setLayout(new FlowLayout());
		contenedor.setBackground(Color.cyan);
		

		
		serializador = new Serializacion();
		Escucha tecla = new Escucha();
		Escucha escucha = new Escucha();
		
		 
		//definirGUI();
		
		
		palabras = new JTextField(15);
		palabras.setEnabled(true);
		palabras.addKeyListener(tecla);
		contenedor.add(palabras);
		
		boton = new JButton("Guardar palabras");
		boton.setFocusable(true);
		boton.setFocusPainted(true);
		boton.addMouseListener(escucha);
		//boton.addKeyListener(tecla);
		contenedor.add(boton);
		
		area = new JTextArea(10,30);
		area.setEnabled(false);
		area.setBackground(Color.gray);
		area.setLineWrap(true);
		contenedor.add(area);
		
	}

	private void definirGUI() {
		
		String [] opciones = {"Restaurar Ficha", "Nueva Ficha"};
		
		String opcionSeleccionada = (String)JOptionPane.showInputDialog(this, "Seleccionar", "Opciones", 
								    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
		/*
		if(opcionSeleccionada == null) {
			System.exit(0);
		} else if(opcionSeleccionada.equals("Restaurar Ficha")){
			ficha = serializador.deserializarObjeto();
		} else {
			ficha = new Ficha();
		}*/
	}
	
	private class Escucha implements KeyListener, MouseListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		
			
		}

		@Override
		public void keyPressed(KeyEvent keyEvent) {
			// TODO Auto-generated method stub
			
		
		    if(keyEvent.getKeyCode()==KeyEvent.VK_ENTER) { 
		    	System.out.println("A");
		    	String a = palabras.getText();

		    	String results = a+"\n";
		    	area.setText(area.getText()+results);
		    	palabras.setText("");
		    }
		    
		    if(keyEvent.getKeyCode()==KeyEvent.VK_BACK_SPACE || keyEvent.getKeyCode()==KeyEvent.VK_DELETE) { 
		    	System.out.println("XD");
		    	palabras.setText("");
		    }
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		//Eventos del Mouse
		

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("A");
	    	String a = palabras.getText();

	    	String results = a+"\n";
	    	area.setText(area.getText()+results);
	    	palabras.setText("");
		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	
	}
 
}

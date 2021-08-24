package WordGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ficha extends JPanel {
	public final Font FUENTE = new Font(Font.DIALOG, Font.BOLD, 20); 
	private String palabra;
	
	
	public Ficha() {
		palabra = "";
		
		this.setPreferredSize(new Dimension(300,300));
		this.setBackground(Color.BLACK);
	}


	public void setPalabra(String palabra) {
		this.palabra = palabra;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setFont(FUENTE);
		g.setColor(Color.green);
		g.drawString(palabra, this.getWidth()/2, this.getHeight()/2);
	}
	
	
}


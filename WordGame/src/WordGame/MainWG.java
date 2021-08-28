package WordGame;

import java.awt.EventQueue;

public class MainWG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				WordGameGUI gui = new WordGameGUI();
			}
		});

	}

}

package WordGame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
	private FileInputStream fileInput;
	private ObjectInputStream lectura;
	private FileOutputStream fileOutput;
	private ObjectOutputStream escritura;
	
	public void serializarObjeto(Ficha ficha) {
		try {
			fileOutput = new FileOutputStream("src/objetoSerializado/fichaSerializada");
			
			escritura = new ObjectOutputStream(fileOutput);
			escritura.writeObject(ficha);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				escritura.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Ficha deserializarObjeto() {

		Ficha ficha = null;

		try {
			fileInput = new FileInputStream("src/objetoSerializado/fichaSerializada");

			lectura = new ObjectInputStream(fileInput);
			ficha = (Ficha)lectura.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ficha;
	}
	
	
}
  
package Practica7;
import java.util.Scanner;
import java.io.*;
public class Controladora {
	public static void main(String args[]) throws IOException {
		
	//WebMaker generador = new WebMaker();
		//PrintWriter escritor = new PrintWriter("index.html");
		//Scanner lector = new Scanner(new FileReader("form.txt"));
		
		//escritor.println(generador.imprimirEncabezado());
		
		//escritor.println(generador.imprimirTexto("Un pikachu.!"));
		//escritor.println(generador.insertarImagen("images.jpg"));
		
		//while(lector.hasNext()) {
			//escritor.println(lector.nextLine());
		//}
		//escritor.println(generador.imprimirCierre());
		
		//lector.close();
		//escritor.close(); 
		//DataOutputStream escritor1 = new DataOutputStream(new FileOutputStream("hola.bin"));
		
		//escritor1.writeInt(33465);
		//escritor1.writeChar('a');
		//escritor1.writeChar('z');
		//escritor1.writeShort(10);
		
		//escritor1.close();
		
		//DataInputStream lector = new DataInputStream(new FileInputStream("hola.bin"));
		//System.out.println(lector.readChar());
		//System.out.println(lector.readShort());
		//System.out.println(lector.readInt());
		//System.out.println(lector.readChar());
		
		//escritor.close();
		
		ObjectInputStream lector = new ObjectInputStream(new FileInputStream("web.obj"));
	PrintWriter escritor = new PrintWriter("main.html");
	
	WebMaker pagina = null;
	try {
		pagina = (WebMaker)(lector.readObject());
	} catch (ClassNotFoundException e) {
		 //TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		 //TODO Auto-generated catch block
		e.printStackTrace();
	}
	escritor.print(pagina.printPage());
	
	lector.close();
	escritor.close();
				
	}

}

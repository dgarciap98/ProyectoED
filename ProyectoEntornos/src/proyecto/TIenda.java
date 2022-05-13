package proyecto;

import java.io.*;
import java.util.ArrayList;

public class TIenda {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		ArrayList<Productos> listaProductos = new ArrayList<Productos>();
		String linea = "";

		try {
			fr = new FileReader("C:\\test\\productos.csv");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\test\\listado.csv");
			bw = new BufferedWriter(fw);
			
			while(br.ready()) {
				
				linea = br.readLine();
				
				// Aqui introducir las listas
				
				
				// Aqui introducir en la listaProductos el contenido de las listas
												
			}
			
			// Para quitar primera linea del fichero
			bw.newLine();
			
			for (Productos l : listaProductos) {
				System.out.println(l);
				
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		} catch (IOException ex) {
			System.out.println("Error de lectura/escritura");

		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
				}
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
				
			} catch (IOException ex) {
				System.out.println("Error al cerrar escritor/lector");
			}
			
		}
		
	}

}
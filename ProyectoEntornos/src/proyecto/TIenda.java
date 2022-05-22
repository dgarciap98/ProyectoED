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
		ArrayList<Videojuegos> listaVideojuegos = new ArrayList<Videojuegos>();
		String linea = "";
		
		ficheroInicial();

		try {
			fr = new FileReader("C:\\test\\productos.csv");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\test\\listado.csv");
			bw = new BufferedWriter(fw);
			
			while(br.ready()) {
				
				linea = br.readLine();
																
			}
			
			// Para quitar primera linea del fichero
			bw.newLine();
			
			for (Productos l : listaProductos) {
				System.out.println(l);
				
			}
			
			for (Productos v : listaVideojuegos) {
				System.out.println(v);
				bw.write(v.toString());
				
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

	public static void ficheroInicial() {
		
		File directorio = new File("C:\\test");
		FileWriter fw1 = null;
		BufferedWriter bw1 = null;
		
		if(!directorio.exists()) {
			directorio.mkdirs();
		}
		
		try {
			fw1 = new FileWriter("C:\\test\\productos.csv");
			bw1 = new BufferedWriter(fw1);
			
			bw1.write("LOTE;NOMBRE;TIPO;STOCK;FECHA/MATERIAL;PRECIO");
			bw1.newLine();
			
			bw1.write("12121;Juego1;Videojuego;4;2022-01-02;45");
			bw1.newLine();
			
			bw1.write("22414;Juego2;Videojuego;2;2022-05-02;35");
			bw1.newLine();
			
			bw1.write("3331;Manzana;Comida;50;2022-06-22;3");
			bw1.newLine();
			
			bw1.write("4553;Aguacate;Comida;34;2022-07-25;4");
			bw1.newLine();
			
			bw1.write("5643;Estanteria;Mueble;15;Plastico;85");
			bw1.newLine();
			
			bw1.write("6231;Armario;Mueble;4;Madera;350");
			bw1.newLine();
		
		} catch (IOException ex) {
			System.out.println("Error escritura archivo principal");
		}
		
		finally {
			try {
				if(bw1 != null) {
					bw1.close();
				}
				if(fw1 != null) {
					fw1.close();
				}
				
			} catch (IOException ex) {
				System.out.println("Error al cerrar escritor");
				}
		
		
		}
		
	}

}
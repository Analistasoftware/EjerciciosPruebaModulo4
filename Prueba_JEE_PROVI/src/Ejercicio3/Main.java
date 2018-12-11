package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		
		//Variables Locales
		String referencia;
	    String nombre;
	    double precio;
	    double calculo;
	    double cantidad;
         
	    System.out.println("Ingrese referencia");
	    referencia= leer.next();
	    System.out.println("Ingrese nombre");
	    nombre= leer.next();
	    System.out.println("Ingrese precio");
	    precio= leer.nextDouble();
	    System.out.println("Ingrese cantidad");
	    cantidad=leer.nextDouble();
	    Articulo a1 = new Articulo();
	    
	}

}

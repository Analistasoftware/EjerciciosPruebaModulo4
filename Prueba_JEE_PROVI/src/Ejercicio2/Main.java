package Ejercicio2;

import java.util.Scanner;

public class Main {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
        String rut; 
        String nombre; 
        String apellidos; 
        String domicilio;
        System.out.println("Ingrese rut:  ");
        rut=leer.next();
        
        System.out.println("Ingrese nombre");
        nombre=leer.next();
        
        System.out.println("Ingrese apellidos");
        apellidos= leer.next();
        
        System.out.println("Ingrese domicilio");
        domicilio= leer.next();
        
        Persona p1= new Persona(rut, nombre, apellidos, domicilio);
        System.out.println(p1.toString());
	}

}

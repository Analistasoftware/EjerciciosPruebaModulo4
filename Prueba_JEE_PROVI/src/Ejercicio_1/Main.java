package Ejercicio_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		//Scanner leer = new Scanner (System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double saldo; 
		double interes; 
		double dolar;
        int numeroCuenta;
        String nombre;
        
        System.out.println("*** Bienvenido a su cuenta de ahorro***");
        System.out.println("Ingrese su nombre");
        nombre= br.readLine();
        System.out.println("Ingrese numero de cuenta");
        numeroCuenta= br.read();
        System.out.println("Ingrese interes Cuenta:");
        interes=Double.parseDouble(br.readLine());
        System.out.println("Realice su primer abono");
        saldo=Double.parseDouble(br.readLine());
        
        CuentaAhorro c1=new CuentaAhorro(numeroCuenta, nombre, saldo, interes);
        System.out.println("Ingrese monto para realizar depósito");
        c1.deposito(br.read());
        
        System.out.println("Ingrese monto para realizar giro");
        c1.giro(br.read());
       
        c1.estado();
        c1.verSaldo();
        
        System.out.println("El interes ganado en un año es $"+ c1.interesGanado());
        System.out.println("Ingrese valor del dolar ");
        c1.convertirMoneda(br.read());
		

	}

}

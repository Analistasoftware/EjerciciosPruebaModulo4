package Ejercicio_1;

public class CuentaAhorro {
   private int numeroCuenta;
   private String titularCuenta;
   private double saldoCuenta;
   private double interesAnualCuenta;
   
   
   //Constructor con parametros
   public CuentaAhorro(int numeroCuenta, String titularCuenta,double saldoCuenta, double interesAnualCuenta) {
	this.numeroCuenta=numeroCuenta;
	this.titularCuenta=titularCuenta;
	this.saldoCuenta=saldoCuenta;
	this.interesAnualCuenta=interesAnualCuenta;
}
   //Constructor vacio
   public CuentaAhorro() {}
   
   
   //Metodos
   public int getNumeroCuenta() {
	return numeroCuenta;}
   
   public void setNumeroCuenta(int numeroCuenta) {
	this.numeroCuenta = numeroCuenta;}
   
   public String getTitularCuenta() {
	return titularCuenta;}
   
   public void setTitularCuenta(String titularCuenta) {
	this.titularCuenta = titularCuenta;}
   
   
   public double getSaldoCuenta() {
	return saldoCuenta;
}
   
   public void setSaldoCuenta(double saldoCuenta) {
	this.saldoCuenta = saldoCuenta;
}
   
   public double getInteresAnualCuenta() {
	return interesAnualCuenta;
}
   
 public void setInteresAnualCuenta(double interesAnualCuenta) {
	this.interesAnualCuenta = interesAnualCuenta;
}
 
 public boolean deposito (double deposito) {
	 if (deposito <=0) {
		System.out.println("No puede depositar valores menores o iguales a 0");
		return false;
	}
	 
	 saldoCuenta+= deposito;
	 System.out.println("Deposito exitoso socio!");
	 return true;
 }
 public boolean giro(double giro){
     if(giro<0){
         System.out.println("El giro no puede ser un monto negativo.");
         return false;
     }
     if(saldoCuenta < giro){
         System.out.println("No tiene saldo suficiente para realizar el giro");
         return false;
     }
     saldoCuenta-=giro;
     System.out.println("Giro exitoso");
     return true;
 }
 public void estado(){
     if(saldoCuenta==0){
         System.out.println("Cuenta en rojo(Saldo 0)");
     }else{
         System.out.println("Cuenta en verde");
     }
 }
 
 public void verSaldo(){
     System.out.println("Su saldo es de: $"+getSaldoCuenta());
 }
 
 public double interesGanado(){
     double saldoInteres=saldoCuenta;
     double interesCuenta = 0;
	saldoInteres*=interesCuenta;
     return saldoInteres-saldoCuenta;   
 }
 
 public void convertirMoneda(double valorDolar){
     System.out.println("Su saldo en dolares es USD$"+ (saldoCuenta/valorDolar));      
 }
}

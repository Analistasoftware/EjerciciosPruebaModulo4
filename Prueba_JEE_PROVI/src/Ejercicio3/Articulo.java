package Ejercicio3;

public class Articulo {
	private String referencia;
    private String nombre;
    private double precio;
    private double calculo;
    private double cantidad;
    
   
    
    
    public void SetAtributos(String referencia,String nombre,double precio,double calculo,double cantidad) {
    	this.referencia=referencia;
    	this.nombre=nombre;
    	this.precio=precio;
    	this.calculo=calculo;
    	this.cantidad=cantidad;
    }
    
    public String GetAtributos() {
    	return "Referencia"+referencia+"nombre:"+nombre+"precio"+precio;
    }
    
    public void calculo_Venta(String referencia){
        if(!referencia.equalsIgnoreCase(this.referencia)) {
            System.out.println("Referencia erronea");
        }else{
        	calculo=precio*cantidad;
            System.out.println("El valor de la venta es "+calculo);
        }
        
        
     }
}

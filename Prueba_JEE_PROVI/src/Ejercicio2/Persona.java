package Ejercicio2;

public class Persona {
	private String rut;
	private String nombre;
	private String apellidos;
	private String domicilio;
	
	
	public Persona(String rut,String nombre,String apellidos) {
		this.rut=rut;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public Persona(String rut,String nombre,String apellidos, String domicilio) {
		this.rut=rut;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.domicilio=domicilio;
	}
	
	@Override
	public String toString() {
		
		return "rut:"+rut+"nombre:"+nombre+"Apellidos:"+apellidos+"Domicilio:"+domicilio;
	}

}

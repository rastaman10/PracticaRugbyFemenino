package rugbyFemenino;

import java.util.Date;

public class Persona {
	
	//********* atributos ******************
	private String nombre;
	private Date fechaNacimiento;
	
	// ******* relacion = no tiene *******
	
	// ***** constructor**********
	
	public Persona(String nombre, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//********* metodos setters and getters **********

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
	
}

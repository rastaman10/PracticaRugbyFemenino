package rugbyFemenino;

import java.util.Date;

public class Jugador extends Persona{

	//******** relacion  no tiene ********
	
	// ********** atributo *********
	private Posicion posicion;

	// ******** constructor ************
	public Jugador(String nombre, Date fechaNacimiento, Posicion posicion) {
		super(nombre, fechaNacimiento);
		this.posicion = posicion;
	}

	//******** metodod ssetters and getters ************
	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	
	
	
	

}

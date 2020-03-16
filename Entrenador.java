package rugbyFemenino;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Entrenador extends Persona {
	
	//*********** atributos propios no tiene ***********
	
	//********** relacion ****************
	
	private Collection<Equipo> equipos = new ArrayList<Equipo>();
	
	
	//********** constructor ************

	public Entrenador(String nombre, Date fechaNacimiento, Collection<Equipo> equipos) {
		super(nombre, fechaNacimiento);
		this.equipos = equipos;
	}
	
	//********* Metodos setters and getters**************

	public Collection<Equipo> getEquipos() {
		return equipos;
	}


	public void setEquipos(Collection<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	
	

	
}

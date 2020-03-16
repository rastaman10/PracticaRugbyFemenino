package rugbyFemenino;

import java.util.ArrayList;
import java.util.Collection;

public class Estadio {
	
	//********** atributos ***********
	
	private String nombre;
	private int capacidad;
	private String ciudad;
	
	//********** relaciones ************
	
	private Collection<Partido> partidos = new ArrayList<Partido>();
	private Collection<Equipo> equipos = new ArrayList<Equipo>();
	
	//******** constructor *********
	public Estadio(String nombre, int capacidad, String ciudad, Collection<Partido> partidos,
			Collection<Equipo> equipos) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.ciudad = ciudad;
		this.partidos = partidos;
		this.equipos = equipos;
	}
	
	//******** metodos setters and getters***************

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Collection<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(Collection<Partido> partidos) {
		this.partidos = partidos;
	}

	public Collection<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Collection<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	

}

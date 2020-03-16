package rugbyFemenino;

import java.util.ArrayList;
import java.util.Collection;

public class Equipo {
	
	// atributos
	
	private String pais;
	
	// relaciones
	
	private Partido partido;
	public Collection<Jugador> jugadores = new ArrayList<Jugador>();
	public Collection<Entrenador> entrenan = new ArrayList<Entrenador>();
	
	//******** constructor *********
	public Equipo(String pais, Partido partido, Collection<Jugador> jugadores, Collection<Entrenador> entrenan) {
		super();
		this.pais = pais;
		this.partido = partido;
		this.jugadores = jugadores;
		this.entrenan = entrenan;
	}
	
	//******** metodos setters and getters 
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public Collection<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(Collection<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Collection<Entrenador> getEntrenan() {
		return entrenan;
	}
	public void setEntrenan(Collection<Entrenador> entrenan) {
		this.entrenan = entrenan;
	}
	
	

}

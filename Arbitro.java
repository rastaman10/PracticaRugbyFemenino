package rugbyFemenino;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Arbitro extends Persona {
	//******* atributos propios no tiene **********
	
	//******* relaciones ***********
	
	private Collection<Partido> partidos = new ArrayList<Partido>();

	// ******* Constructor *********
	public Arbitro(String nombre, Date fechaNacimiento, Collection<Partido> partidos) {
		super(nombre, fechaNacimiento);
		this.partidos = partidos;
	}

	//********* metodos setters and getters ***********
	public Collection<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(Collection<Partido> partidos) {
		this.partidos = partidos;
	}
	
	



}

package rugbyFemenino;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Torneo {
	private Date año;
	
	public void ganador() {
		
	}
	
	public void clasificacion() {
		
	}
	
	// ************ relacion *********
	private Collection<Jornada> jornadas = new ArrayList<Jornada>();

	//********** constructor**************
	public Torneo(Date año, Collection<Jornada> jornadas) {
		super();
		this.año = año;
		this.jornadas = jornadas;
	}
	
	//******* Metodo setters and getters*********+

	public Date getAño() {
		return año;
	}

	public void setAño(Date año) {
		this.año = año;
	}

	public Collection<Jornada> getJornadas() {
		return jornadas;
	}

	public void setJornadas(Collection<Jornada> jornadas) {
		this.jornadas = jornadas;
	}
	
	

	
	
	
	
}

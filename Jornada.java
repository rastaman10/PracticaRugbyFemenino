package rugbyFemenino;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Jornada {
	
	// ***** atributos ***********
	private Date fecha;
	
	//********* relacion *************
	
	
	private Collection<Torneo> torneos = new ArrayList<Torneo>();

	//******* constructor **********
	public Jornada(Date fecha, Collection<Torneo> torneos) {
		super();
		this.fecha = fecha;
		this.torneos = torneos;
	}
	
	//******** metodos setters and getters************

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Collection<Torneo> getTorneos() {
		return torneos;
	}

	public void setTorneos(Collection<Torneo> torneos) {
		this.torneos = torneos;
	}
	
	

}

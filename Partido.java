package rugbyFemenino;

import java.util.ArrayList;
import java.util.Collection;


public class Partido {
	
	//********** atributos ****************
	
	private int puntosLocal;
	private int puntosVisitantes;
	private int bonusLocal;
	private int bonusVisitante;
	
	public void resultado() {
		
	}
		
	// ********* relacion ************
	public  Collection<Equipo> visitantes = new ArrayList<Equipo>();
	public  Collection<Equipo> locales = new ArrayList<Equipo>();
	private Collection<Estadio> estadio = new ArrayList<Estadio>();

	//******* constructor ************

	public Partido(int puntosLocal, int puntosVisitantes, int bonusLocal, int bonusVisitante,
			Collection<Equipo> visitantes, Collection<Equipo> locales, Collection<Estadio> estadio) {
		super();
		this.puntosLocal = puntosLocal;
		this.puntosVisitantes = puntosVisitantes;
		this.bonusLocal = bonusLocal;
		this.bonusVisitante = bonusVisitante;
		this.visitantes = visitantes;
		this.locales = locales;
		this.estadio = estadio;
	}

	// ********** Metodos setters and getters************
	public int getPuntosLocal() {
		return puntosLocal;
	}

	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}

	public int getPuntosVisitantes() {
		return puntosVisitantes;
	}

	public void setPuntosVisitantes(int puntosVisitantes) {
		this.puntosVisitantes = puntosVisitantes;
	}

	public int getBonusLocal() {
		return bonusLocal;
	}

	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}

	public int getBonusVisitante() {
		return bonusVisitante;
	}

	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}

	public Collection<Equipo> getVisitantes() {
		return visitantes;
	}

	public void setVisitantes(Collection<Equipo> visitantes) {
		this.visitantes = visitantes;
	}

	public Collection<Equipo> getLocales() {
		return locales;
	}

	public void setLocales(Collection<Equipo> locales) {
		this.locales = locales;
	}

	public Collection<Estadio> getEstadio() {
		return estadio;
	}

	public void setEstadio(Collection<Estadio> estadio) {
		this.estadio = estadio;
	}
	
	
	
	
	
	}
	

	
	
	



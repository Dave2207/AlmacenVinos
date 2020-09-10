package logico;

import java.util.ArrayList;

public class Suministrador {
	private String nombre;
	private String pais;
	private int tiempoEntrega;
	private ArrayList<Vino> misVinos;
	
	public Suministrador(String nombre, String pais, int tiempoEntrega, ArrayList<Vino> misVinos) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.tiempoEntrega = tiempoEntrega;
		this.setMisVinos(new ArrayList<Vino>());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(int tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

	public ArrayList<Vino> getMisVinos() {
		return misVinos;
	}

	public void setMisVinos(ArrayList<Vino> misVinos) {
		this.misVinos = misVinos;
	}
	
	
}

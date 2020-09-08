package logico;

public class Suministrador {
	private String nombre;
	private String pais;
	private int tiempoEntrega;
	
	public Suministrador(String nombre, String pais, int tiempoEntrega) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.tiempoEntrega = tiempoEntrega;
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
	
	
}

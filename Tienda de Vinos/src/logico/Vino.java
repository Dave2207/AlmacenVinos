package logico;

public class Vino {
	private String id;
	private String nombre;
	private int cosecha;
	private String tipo;
	private int dispMin;
	private int dispMax;
	private int dispReal;
	
	public Vino(String id, String nombre, int cosecha, String tipo, int dispMin, int dispMax, int dispReal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cosecha = cosecha;
		this.tipo = tipo;
		this.dispMin = dispMin;
		this.dispMax = dispMax;
		this.dispReal = dispReal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCosecha() {
		return cosecha;
	}

	public void setCosecha(int cosecha) {
		this.cosecha = cosecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDispMin() {
		return dispMin;
	}

	public void setDispMin(int dispMin) {
		this.dispMin = dispMin;
	}

	public int getDispMax() {
		return dispMax;
	}

	public void setDispMax(int dispMax) {
		this.dispMax = dispMax;
	}

	public int getDispReal() {
		return dispReal;
	}

	public void setDispReal(int dispReal) {
		this.dispReal = dispReal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}

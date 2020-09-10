package logico;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Vino> vinos;
	private ArrayList<Suministrador> sums;
	private static int cantVinos;
	private static int cantSumis;
	private static Almacen alma = null;
	
	private Almacen() {
		super();
		this.vinos = new ArrayList<Vino>();
		this.sums = new ArrayList<Suministrador>();
		cantVinos = 0;
		cantSumis = 0;
	}
	
	public static Almacen getInstance() {
		if(alma == null) {
			alma = new Almacen();
		}
		return alma;
	}

	public ArrayList<Vino> getVinos() {
		return vinos;
	}

	public void setVinos(ArrayList<Vino> vinos) {
		this.vinos = vinos;
	}

	public ArrayList<Suministrador> getSums() {
		return sums;
	}

	public void setSums(ArrayList<Suministrador> sums) {
		this.sums = sums;
	}
	
	public void insertarVino(Vino miVino) {
		vinos.add(miVino);
		cantVinos++;
	}
	
	public void insertarSuministrador(Suministrador miSumi) {
		sums.add(miSumi);
		cantSumis++;
	}
	
	public Vino buscarVino(String id) {
		int i = 0;
		Vino aux = null;
		boolean found = false;
		
		while(!found && i<vinos.size()) {
			if(vinos.get(i).getId().equalsIgnoreCase(id)) {
				found = true;
				aux = vinos.get(i);
			}
		}
		return aux;
	}
	
	public Suministrador buscarSumi(String id) {
		int i = 0;
		Suministrador aux = null;
		boolean found = false;
		
		while(!found && i<sums.size()) {
			if(sums.get(i).getId().equalsIgnoreCase(id)) {
				found = true;
				aux = sums.get(i);
			}
		}
		return aux;
	}
}

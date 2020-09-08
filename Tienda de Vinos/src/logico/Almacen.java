package logico;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Vino> vinos;
	private ArrayList<Suministrador> sums;
	private static Almacen alma = null;
	
	private Almacen() {
		super();
		this.vinos = new ArrayList<Vino>();
		this.sums = new ArrayList<Suministrador>();
	}
	
	public static Almacen getInstance() {
		if(alma == null) {
			alma = new Almacen();
		}
		return alma;
	}
	
}

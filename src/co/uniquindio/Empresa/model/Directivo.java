package co.uniquindio.Empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado{

	private Categoria categoria;
	private List<Empleado>listaSubOrdinados = new ArrayList<Empleado>();

	public Directivo(String nombre, Integer edad, double saldoBruto, Categoria categoria,
			List<Empleado> listaSubOrdinados) {
		super(nombre, edad, saldoBruto);
		this.categoria = categoria;
		this.listaSubOrdinados = listaSubOrdinados;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Empleado> getListaSubOrdinados() {
		return listaSubOrdinados;
	}

	public void setListaSubOrdinados(List<Empleado> listaSubOrdinados) {
		this.listaSubOrdinados = listaSubOrdinados;
	}

	@Override
	public String toString() {
		return "Directivo [categoria=" + categoria + ", listaSubOrdinados=" + listaSubOrdinados + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((listaSubOrdinados == null) ? 0 : listaSubOrdinados.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directivo other = (Directivo) obj;
		if (categoria != other.categoria)
			return false;
		if (listaSubOrdinados == null) {
			if (other.listaSubOrdinados != null)
				return false;
		} else if (!listaSubOrdinados.equals(other.listaSubOrdinados))
			return false;
		return true;
	}


}

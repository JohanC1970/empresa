package co.uniquindio.Empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{

	private double sueldoBruto;
	private List<Directivo>listaDirectores = new ArrayList<Directivo>();

	public Empleado(String nombre, Integer edad, double saldoBruto) {
		super(nombre, edad);
		this.sueldoBruto = saldoBruto;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double saldoBruto) {
		this.sueldoBruto = saldoBruto;
	}


	public List<Directivo> getListaDirectores() {
		return listaDirectores;
	}

	public void setListaDirectores(List<Directivo> listaDirectores) {
		this.listaDirectores = listaDirectores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(sueldoBruto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Empleado other = (Empleado) obj;
		if (Double.doubleToLongBits(sueldoBruto) != Double.doubleToLongBits(other.sueldoBruto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado [saldoBruto=" + sueldoBruto + "]";
	}



}

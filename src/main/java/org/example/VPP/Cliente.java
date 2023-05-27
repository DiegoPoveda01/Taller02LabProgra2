package org.example.VPP;

public class Cliente {
	private String nombre;
	private String apellido;
	private String rut;
	private boolean pasaporte;
	private String correoElectronico;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public boolean getPasaporte() {
		return this.pasaporte;
	}

	public void setPasaporte(boolean pasaporte) {
		this.pasaporte = pasaporte;
	}
}
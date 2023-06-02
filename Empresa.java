package org.example.Buses;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private int cantidadBuses;
	private String ciudadDestino;
	private String rut;
	private String direccion;
	private String redes;
	public ArrayList<Buses> buses = new ArrayList<Buses>();
	public ArrayList<Conductores> conductores = new ArrayList<Conductores>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadBuses() {
		return this.cantidadBuses;
	}

	public void setCantidadBuses(int cantidadBuses) {
		this.cantidadBuses = cantidadBuses;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedes() {
		return this.redes;
	}

	public void setRedes(String redes) {
		this.redes = redes;
	}
}
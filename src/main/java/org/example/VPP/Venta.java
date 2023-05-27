package org.example.VPP;

public class Venta {
	private String cliente;
	private String agenteViaje;
	private CiudadDestino ciudad;

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getAgenteViaje() {
		return this.agenteViaje;
	}

	public void setAgenteViaje(String agenteViaje) {
		this.agenteViaje = agenteViaje;
	}
	public CiudadDestino getCiudad(CiudadDestino ciudad){
		return this.ciudad;
	}
	public void setCiudad(CiudadDestino ciudad){
		this.ciudad = ciudad;
	}
}
package org.example.VPP;

import java.util.ArrayList;

public class AgenciaViaje {
	private String nombre;
	private String destinos;
	private int precios;
	private String horarioAtencion;
	private String numeroTelefono;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<AgenteViaje> agentes = new ArrayList<AgenteViaje>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDestinos() {
		return this.destinos;
	}

	public void setDestinos(String destinos) {
		this.destinos = destinos;
	}

	public int getPrecios() {
		return this.precios;
	}

	public void setPrecios(int precios) {
		this.precios = precios;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public void añadirCliente(Cliente cliente) {
		String rutCliente = cliente.getRut();
		if (!buscarCliente(rutCliente)) {
			clientes.add(cliente);
			System.out.println("Cliente añadido correctamente.");
		} else {
			System.out.println("El cliente ya existe. No se puede añadir.");
		}
	}


	public void añadirVendedor(AgenteViaje agente) {
		String rutVendedor = agente.getRut();
		if (!buscarVendedor(rutVendedor)){
			agentes.add(agente);
			System.out.println("Vendedor añadido correctamente.");
		} else {
			System.out.println("El vendedor ya está ingresado.No se puede añadir nuevamente");
		}
	}

	public boolean buscarCliente(String rut) {
		for (Cliente cliente : clientes) {
			if (cliente.getRut().equals(rut)) {
				return true;
			}
		}
		return false;
	}


	public boolean buscarVendedor(String rut) {
		for (AgenteViaje agente : agentes){
			if (agente.getRut().equals(rut)){
				return true;
			}
		}
		return false;
	}

	public void eliminarVendedor(String rut) {
		AgenteViaje vendedorEncontrado = null;
		for (AgenteViaje agente : agentes) {
			if (agente.getRut().equals(rut)) {
				vendedorEncontrado = agente;
				break;
			}
		}

		if (vendedorEncontrado != null) {
			agentes.remove(vendedorEncontrado);
			System.out.println("Vendedor eliminado correctamente.");
		} else {
			System.out.println("No se encontró un vendedor con el rut especificado.");
		}
	}


	public void generarVenta() {
		if (!clientes.isEmpty() && !agentes.isEmpty()) {
			Cliente cliente = clientes.get(0);
			AgenteViaje agente = agentes.get(0);
			CiudadDestino ciudad = new CiudadDestino();
			ciudad.setNombre("Venecia");
            ciudad.setPrecio(Integer.parseInt("1000000"));
			Venta venta = new Venta();
			venta.setCliente(cliente.getNombre());
			venta.setAgenteViaje(agente.getNombre());
			venta.setCiudad(ciudad);
			System.out.println("Se generó una venta para el " + cliente.getNombre() + " con el  " + agente.getNombre() + " hacia la ciudad: " + venta.getCiudad(ciudad).getNombre() + " Con precio: " + ciudad.getPrecio());
		} else {
			System.out.println("No hay clientes o agentes disponibles para generar una venta.");
		}
	}

}
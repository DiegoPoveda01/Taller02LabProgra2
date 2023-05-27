package org.example.VPP;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializar();
    }

    public void inicializar() {
        AgenciaViaje agencia = new AgenciaViaje();


        agencia.setNombre("Agencia de Viajes");
        agencia.setDestinos("Destino1, Destino2, Destino3");
        agencia.setPrecios(100000);
        agencia.setHorarioAtencion("9:00 AM - 6:00 PM");
        agencia.setNumeroTelefono("123456789");
        Cliente cliente1 = new Cliente();
        cliente1.setRut("11111111-1");
        cliente1.setNombre("Cliente 1");
        AgenteViaje agente1 = new AgenteViaje();
        agente1.setRut("33333333-3");
        agente1.setNombre("Agente 1");
        agencia.añadirCliente(cliente1);
        agencia.añadirVendedor(agente1);
        boolean clienteEncontrado = agencia.buscarCliente("11111111-1");
        if (clienteEncontrado) {
            System.out.println("Cliente encontrado");
        } else {
            System.out.println("Cliente no encontrado");
        }
        boolean vendedorEncontrado = agencia.buscarVendedor("33333333-3");
        if (vendedorEncontrado) {
            System.out.println("Vendedor encontrado");
        } else {
            System.out.println("Vendedor no encontrado");
        }
        //agencia.eliminarVendedor("33333333-3");
        agencia.generarVenta();
    }
}


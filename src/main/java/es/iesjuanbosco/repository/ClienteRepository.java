package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Cliente;

import java.util.List;

public interface ClienteRepository {
    public void actualizarCliente (Cliente cliente);
    public void eliminarClientePorId (int id);
    public Cliente obtenerClientePorId (int id);
    public List<Cliente> mostrarTodosLosClientes ();
}

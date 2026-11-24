package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryIMPL implements ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();
    private final EntityManager em;
    public ClienteRepositoryIMPL(EntityManager em) {
        this.em = em;
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(cliente.getId())) {
                clientes.set(i, cliente);
                return;
            }
        }
    }

    @Override
    public void eliminarClientePorId(int id) {
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> mostrarTodosLosClientes() {
        String JPQL = "SELECT c FROM Cliente c WHERE c.precio > :precio";

    }


}

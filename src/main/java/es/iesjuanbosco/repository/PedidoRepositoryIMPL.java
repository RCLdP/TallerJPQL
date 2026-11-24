package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepositoryIMPL implements PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void actualizarPedido(Pedido pedido) {
        for (int i = 0; i < this.pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(pedido.getId())){
                pedidos.set(i, pedido);
                return;
            }
        }
    }

    @Override
    public void eliminarPedidoPorId(int id) {
        pedidos.removeIf(pedido -> pedido.getId().equals(id));
    }

    @Override
    public Pedido obtenerPedidoPorId(int id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null;
    }
}

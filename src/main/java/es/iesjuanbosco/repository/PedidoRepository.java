package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Pedido;

public interface PedidoRepository {
    public void actualizarPedido(Pedido pedido);
    public void eliminarPedidoPorId(int id);
    public Pedido obtenerPedidoPorId(int id);
}

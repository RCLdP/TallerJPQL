package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Producto;

public interface ProductoRepository {
    public void actualizarProducto(Producto producto);
    public void eliminarProductoPorId(int id);
    public Producto obtenerProductoPorId(int id);
}

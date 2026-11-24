package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryIMPL implements ProductoRepository {

    List<Producto> productos =  new ArrayList<>();

    @Override
    public void actualizarProducto(Producto producto) {
        for(int i = 0; i < productos.size(); i++){
            if(productos.get(i).getId().equals(producto.getId())){
                productos.set(i, producto);
                return;
            }
        }
    }

    @Override
    public void eliminarProductoPorId(int id) {
        productos.removeIf(producto -> producto.getId().equals(id));
    }

    @Override
    public Producto obtenerProductoPorId(int id) {
        for(Producto producto : productos){
            if(producto.getId().equals(id)){
                return producto;
            }
        }
        return null;
    }
}

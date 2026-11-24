package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Categoria;

public interface CategoriaRepository {
    public void actualizarCategoria (Categoria categoria);
    public void eliminarCategoriaPorId (int id);
    public Categoria obtenerCategoriaPorId (int id);
}

package es.iesjuanbosco.repository;

import es.iesjuanbosco.modelo.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositoryIMPL implements CategoriaRepository {

    private List<Categoria> categorias =  new ArrayList<>();

    @Override
    public void actualizarCategoria(Categoria categoria) {
        for (int i = 0; i < this.categorias.size(); i++) {
            if (this.categorias.get(i).getId().equals(categoria.getId())) {
                this.categorias.set(i, categoria);
                return;
            }
        }
    }

    @Override
    public void eliminarCategoriaPorId(int id) {
        categorias.removeIf(categoria -> categoria.getId().equals(id));
    }

    @Override
    public Categoria obtenerCategoriaPorId(int id) {
        for (Categoria categoria : categorias) {
            if (categoria.getId().equals(id)) {
                return categoria;
            }
        }
        return null;
    }
}

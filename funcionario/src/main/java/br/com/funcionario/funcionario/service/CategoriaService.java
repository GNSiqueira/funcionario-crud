package br.com.funcionario.funcionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.funcionario.funcionario.entity.Categoria;
import br.com.funcionario.funcionario.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deleteById(Integer id) {
        categoriaRepository.deleteById(id);
    }

    public Categoria findById(Integer id) {
        return categoriaRepository.findById(id).orElse(null);
    }
}
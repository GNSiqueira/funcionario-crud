package br.com.funcionario.funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.funcionario.funcionario.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
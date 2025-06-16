package br.com.funcionario.funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.funcionario.funcionario.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}

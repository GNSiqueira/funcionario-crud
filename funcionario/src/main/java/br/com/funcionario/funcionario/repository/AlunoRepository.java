package br.com.funcionario.funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.funcionario.funcionario.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    Object funcionario = null;
}

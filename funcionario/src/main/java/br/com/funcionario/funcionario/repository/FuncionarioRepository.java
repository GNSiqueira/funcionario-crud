package br.com.funcionario.funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.funcionario.funcionario.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
package br.com.funcionario.funcionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.funcionario.funcionario.entity.Aluno;
import br.com.funcionario.funcionario.repository.AlunoRepository;

@Service
public class AlunoService {
    // Injeção de depêndencia do repositório de alunos
    @Autowired
    private AlunoRepository alunoRepository;

    // Método para buscar todos os alunos

    public List<Aluno> findAll() {
        // Retorna todos os alunos
        return alunoRepository.findAll();

    }

    // metodo para salvar um aluno
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // metodo para excluir um aluno pelo id
    public void deleteById(Integer id) {
        alunoRepository.deleteById(id);
    }

    // metodo para buscar um aluno pelo id
    public Aluno findById(Integer id){
    //retorna o aluno com o id especificado ou null se nao existir 
    return alunoRepository.findById(id).orElse(null);

}

}

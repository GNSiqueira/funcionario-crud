package br.com.funcionario.funcionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.funcionario.funcionario.entity.Curso;
import br.com.funcionario.funcionario.repository.CursoRepository;

@Service
public class CursoService {

    // Injeção de dependência do repositório de cursos
    @Autowired
    private CursoRepository cursoRepository;

    // Método para buscar todos os cursos
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    // Método para salvar um curso
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    // Método para excluir um curso pelo id
    public void deleteById(Integer id) {
        cursoRepository.deleteById(id);
    }

    // Método para buscar um curso pelo id
    public Curso findById(Integer id) {
        return cursoRepository.findById(id).orElse(null);
    }
}

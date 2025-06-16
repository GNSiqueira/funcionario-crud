package br.com.funcionario.funcionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.funcionario.funcionario.entity.Funcionario;
import br.com.funcionario.funcionario.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void deleteById(Integer id) {
        funcionarioRepository.deleteById(id);
    }

    public Funcionario findById(Integer id){
        return funcionarioRepository.findById(id).orElse(null);
    }
}
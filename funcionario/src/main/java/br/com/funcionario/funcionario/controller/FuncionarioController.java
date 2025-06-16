package br.com.funcionario.funcionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.funcionario.funcionario.entity.Funcionario;
import br.com.funcionario.funcionario.entity.Categoria;
import br.com.funcionario.funcionario.service.FuncionarioService;
import br.com.funcionario.funcionario.service.CategoriaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired 
    private CategoriaService categoriaService;


    @GetMapping("/listar")
    public String listar(Model model) {
        List<Funcionario> funcionarios = funcionarioService.findAll();
        model.addAttribute("funcionarios", funcionarios);
        return "funcionario/listaFuncionarios";
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        List<Categoria> categorias = categoriaService.findAll();
        model.addAttribute("categorias", categorias);
        return "funcionario/formularioFuncionario";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Funcionario funcionario) {
        funcionarioService.save(funcionario);
        return "redirect:/funcionarios/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id){
        funcionarioService.deleteById(id);
        return "redirect:/funcionarios/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model){
        Funcionario funcionario = funcionarioService.findById(id);
        model.addAttribute("funcionario", funcionario);
        List<Categoria> categorias = categoriaService.findAll();
        model.addAttribute("categorias", categorias);
        return "funcionario/formularioFuncionario";
    }

}
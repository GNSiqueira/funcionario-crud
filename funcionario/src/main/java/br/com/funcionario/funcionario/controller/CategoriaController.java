package br.com.funcionario.funcionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.funcionario.funcionario.entity.Categoria;
import br.com.funcionario.funcionario.service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Categoria> categorias = categoriaService.findAll();
        model.addAttribute("categorias", categorias);
        return "categoria/listaCategorias";
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria/formularioCategoria";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Categoria categoria) {
        categoriaService.save(categoria);
        return "redirect:/categorias/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        categoriaService.deleteById(id);
        return "redirect:/categorias/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        Categoria categoria = categoriaService.findById(id);
        model.addAttribute("categoria", categoria);
        return "categoria/formularioCategoria";
    }
}
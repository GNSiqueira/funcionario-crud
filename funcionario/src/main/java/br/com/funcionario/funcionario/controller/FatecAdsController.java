package br.com.funcionario.funcionario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    @GetMapping
    public String index(Model model){
        return "/index";
    }
  
}

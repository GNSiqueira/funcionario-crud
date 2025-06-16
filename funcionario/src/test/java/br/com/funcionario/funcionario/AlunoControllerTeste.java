package br.com.funcionario.funcionario;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import br.com.funcionario.funcionario.controller.AlunoController;
import br.com.funcionario.funcionario.entity.Funcionario;
import br.com.funcionario.funcionario.service.FuncionarioService; 

@WebMvcTest(AlunoController.class)
public class AlunoControllerTeste {

    private MockMvc mockMvc;

    @MockBean
    private FuncionarioService alunoService; 

    @Test
    void testSalvarAluno() throws Exception{
        Funcionario aluno = new Funcionario();

        aluno.setNomeAluno("João");
        aluno.setEndAluno("Rua A");
        aluno.setTelAluno("1799999999");
        aluno.setRaAluno(123456);

        mockMvc.perform(post("/alunos/salvar")
            .flashAttr("aluno", aluno))
            .andExpect(status()
            .is3xxRedirection())
            .andExpect(redirectedUrl("/alunos/lista"));
    }
}

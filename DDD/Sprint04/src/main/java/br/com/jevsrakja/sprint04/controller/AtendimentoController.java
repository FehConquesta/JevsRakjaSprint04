package br.com.jevsrakja.sprint04.controller;


import br.com.jevsrakja.sprint04.model.bo.AtendimentoBO;
import br.com.jevsrakja.sprint04.model.vo.Atendimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas a Atendimentos.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/atendimento")
public class AtendimentoController {

    @Autowired
    private AtendimentoBO atendimentoBO;
    /**
     * Construtor para injetar o serviço AtendimentoBO.
     *
     * @param atendimentoBO O serviço AtendimentoBO a ser injetado.
     */
    public AtendimentoController(AtendimentoBO atendimentoBO){
        this.atendimentoBO = atendimentoBO;
    }
    /**
     * Endpoint para listar todos os Atendimentos.
     *
     * @return ResponseEntity contendo a lista de Atendimentos e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Atendimento>> listarAtendimentos(){
        return ResponseEntity.status(200).body(atendimentoBO.listarAtendimentos());
    }
    /**
     * Endpoint para criar um novo Atendimento.
     *
     * @param atendimento O Atendimento a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Atendimento recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Atendimento> criarAtendimento(@RequestBody Atendimento atendimento){
        return ResponseEntity.status(201).body(atendimentoBO.criarAtendimento(atendimento));
    }
    /**
     * Endpoint para editar um Atendimento existente.
     *
     * @param id          O ID do Atendimento a ser editado, fornecido como parte da URL.
     * @param atendimento O Atendimento atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Atendimento atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Atendimento> editarAtendimento(@RequestBody Integer id, Atendimento atendimento){
        return ResponseEntity.status(200).body(atendimentoBO.alterarAtendimento(id,atendimento));
    }
    /**
     * Endpoint para excluir um Atendimento pelo ID.
     *
     * @param id O ID do Atendimento a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirAtendimento(@PathVariable Integer id){
        atendimentoBO.excluirAtendimento(id);
        return ResponseEntity.status(204).build();
    }



}


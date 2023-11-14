package br.com.jevsrakja.sprint04.controller;


import br.com.jevsrakja.sprint04.model.bo.LocalizacaoBO;
import br.com.jevsrakja.sprint04.model.vo.Localizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas a Localizacao.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/localizacao")
public class LocalizacaoController {
    @Autowired
    private LocalizacaoBO localizacaoBO;
    /**
     * Construtor para injetar o serviço LocalizacaoBO.
     *
     * @param localizacaoBO O serviço LocalizacaoBO a ser injetado.
     */
    public LocalizacaoController(LocalizacaoBO localizacaoBO){
        this.localizacaoBO = localizacaoBO;
    }
    /**
     * Endpoint para listar todos os Localizacao.
     *
     * @return ResponseEntity contendo a lista de Localizacao e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Localizacao>> listarLocalizacao(){
        return ResponseEntity.status(200).body(localizacaoBO.listarLocalizacoes());
    }
    /**
     * Endpoint para criar um novo Localizacao.
     *
     * @param localizacao O Localizacao a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Localizacao recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Localizacao> criarLocalizacao(@RequestBody Localizacao localizacao){
        return ResponseEntity.status(201).body(localizacaoBO.criarLocalizacao(localizacao));
    }
    /**
     * Endpoint para editar um Localizacao existente.
     *
     * @param id          O ID do Localizacao a ser editado, fornecido como parte da URL.
     * @param localizacao O Localizacao atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Localizacao atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Localizacao> editarLocalizacao(@RequestBody Integer id, Localizacao localizacao){
        return ResponseEntity.status(200).body(localizacaoBO.alterarLocalizacao(id,localizacao));
    }
    /**
     * Endpoint para excluir um Localizacao pelo ID.
     *
     * @param id O ID do Localizacao a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirLocalizacao(@PathVariable Integer id){
        localizacaoBO.excluirLocalizacao(id);
        return ResponseEntity.status(204).build();
    }
}

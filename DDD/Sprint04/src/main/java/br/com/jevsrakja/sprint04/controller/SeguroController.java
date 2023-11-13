package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.SeguroBO;
import br.com.jevsrakja.sprint04.model.vo.Seguro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas ao Seguro.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/seguro")
public class SeguroController {
    @Autowired
    private SeguroBO seguroBO;
    /**
     * Construtor para injetar o serviço SeguroBO.
     *
     * @param seguroBO O serviço SeguroBO a ser injetado.
     */
    public SeguroController(SeguroBO seguroBO){
        this.seguroBO = seguroBO;
    }
    /**
     * Endpoint para listar todos os Seguros.
     *
     * @return ResponseEntity contendo a lista de Seguros e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Seguro>> listarSeguros(){
        return ResponseEntity.status(200).body(seguroBO.listarSeguros());
    }
    /**
     * Endpoint para criar um novo Seguro.
     *
     * @param seguro O Seguro a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Seguro recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Seguro> criarSeguro(@RequestBody Seguro seguro){
        return ResponseEntity.status(201).body(seguroBO.criarSeguro(seguro));
    }
    /**
     * Endpoint para editar um Seguro existente.
     *
     * @param apolice          A apolice do Seguro a ser editado, fornecido como parte da URL.
     * @param seguro O Seguro atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Seguro atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Seguro> editarSeguro(@RequestBody String apolice, Seguro seguro){
        return ResponseEntity.status(200).body(seguroBO.alterarSeguro(apolice,seguro));
    }
    /**
     * Endpoint para excluir um Seguro pelo ID.
     *
     * @param apolice O ID do Seguro a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{apolice}")
    public ResponseEntity<?> excluirSeguro(@PathVariable String apolice){
        seguroBO.excluirSeguro(apolice);
        return ResponseEntity.status(204).build();
    }


}

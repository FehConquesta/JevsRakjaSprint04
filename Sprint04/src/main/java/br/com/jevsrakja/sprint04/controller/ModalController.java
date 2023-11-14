package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.ModalBO;
import br.com.jevsrakja.sprint04.model.vo.Modal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas ao Modal.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/modal")
public class ModalController {
    @Autowired
    private ModalBO modalBO;
    /**
     * Construtor para injetar o serviço ModalBO.
     *
     * @param modalBO O serviço ModalBO a ser injetado.
     */
    public ModalController(ModalBO modalBO){
        this.modalBO = modalBO;
    }
    /**
     * Endpoint para listar todos os Modais.
     *
     * @return ResponseEntity contendo a lista de Modais e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Modal>> listarModais(){
        return ResponseEntity.status(200).body(modalBO.listarModais());
    }
    /**
     * Endpoint para criar um novo Modal.
     *
     * @param modal O Modal a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Modal recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Modal> criarModal(@RequestBody Modal modal){
        return ResponseEntity.status(201).body(modalBO.criarModal(modal));
    }
    /**
     * Endpoint para editar um Modal existente.
     *
     * @param id          O ID do Modal a ser editado, fornecido como parte da URL.
     * @param modal O Modal atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Modal atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Modal> editarModal(@RequestBody Integer id, Modal modal){
        return ResponseEntity.status(200).body(modalBO.alterarModal(id,modal));
    }
    /**
     * Endpoint para excluir um Modal pelo ID.
     *
     * @param id O ID do Modal a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirModal(@PathVariable Integer id){
        modalBO.excluirModal(id);
        return ResponseEntity.status(204).build();
    }
}

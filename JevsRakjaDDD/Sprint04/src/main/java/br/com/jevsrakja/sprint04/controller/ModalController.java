package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.ModalBO;
import br.com.jevsrakja.sprint04.model.vo.Modal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/modal")
public class ModalController {
    @Autowired
    private ModalBO modalBO;

    public ModalController(ModalBO modalBO){
        this.modalBO = modalBO;
    }

    @GetMapping
    public ResponseEntity<List<Modal>> listarModais(){
        return ResponseEntity.status(200).body(modalBO.listarModais());
    }

    @PostMapping
    public ResponseEntity<Modal> criarModal(@RequestBody Modal modal){
        return ResponseEntity.status(201).body(modalBO.criarModal(modal));
    }

    @PutMapping
    public ResponseEntity<Modal> editarModal(@RequestBody Integer id, Modal modal){
        return ResponseEntity.status(200).body(modalBO.alterarModal(id,modal));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirModal(@PathVariable Integer id){
        modalBO.excluirModal(id);
        return ResponseEntity.status(204).build();
    }
}

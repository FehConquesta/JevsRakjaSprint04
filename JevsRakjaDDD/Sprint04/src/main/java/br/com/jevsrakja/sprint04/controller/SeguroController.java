package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.SeguroBO;
import br.com.jevsrakja.sprint04.model.vo.Seguro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/seguro")
public class SeguroController {
    @Autowired
    private SeguroBO seguroBO;

    public SeguroController(SeguroBO seguroBO){
        this.seguroBO = seguroBO;
    }

    @GetMapping
    public ResponseEntity<List<Seguro>> listarSeguros(){
        return ResponseEntity.status(200).body(seguroBO.listarSeguros());
    }

    @PostMapping
    public ResponseEntity<Seguro> criarSeguro(@RequestBody Seguro seguro){
        return ResponseEntity.status(201).body(seguroBO.criarSeguro(seguro));
    }

    @PutMapping
    public ResponseEntity<Seguro> editarSeguro(@RequestBody String apolice, Seguro seguro){
        return ResponseEntity.status(200).body(seguroBO.alterarSeguro(apolice,seguro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirSeguro(@PathVariable String apolice){
        seguroBO.excluirSeguro(apolice);
        return ResponseEntity.status(204).build();
    }


}

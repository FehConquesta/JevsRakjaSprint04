package br.com.jevsrakja.sprint04.controller;


import br.com.jevsrakja.sprint04.model.bo.AtendimentoBO;
import br.com.jevsrakja.sprint04.model.vo.Atendimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/atendimento")
public class AtendimentoController {
    @Autowired
    private AtendimentoBO atendimentoBO;

    public AtendimentoController(AtendimentoBO atendimentoBO){
        this.atendimentoBO = atendimentoBO;
    }

    @GetMapping
    public ResponseEntity<List<Atendimento>> listarAtendimentos(){
        return ResponseEntity.status(200).body(atendimentoBO.listarAtendimentos());
    }

    @PostMapping
    public ResponseEntity<Atendimento> criarAtendimento(@RequestBody Atendimento atendimento){
        return ResponseEntity.status(201).body(atendimentoBO.criarAtendimento(atendimento));
    }

    @PutMapping
    public ResponseEntity<Atendimento> editarAtendimento(@RequestBody Integer id, Atendimento atendimento){
        return ResponseEntity.status(200).body(atendimentoBO.alterarAtendimento(id,atendimento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirAtendimento(@PathVariable Integer id){
        atendimentoBO.excluirAtendimento(id);
        return ResponseEntity.status(204).build();
    }



}


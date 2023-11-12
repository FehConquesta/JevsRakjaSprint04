package br.com.jevsrakja.sprint04.controller;


import br.com.jevsrakja.sprint04.model.bo.LocalizacaoBO;
import br.com.jevsrakja.sprint04.model.vo.Localizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/localizacao")
public class LocalizacaoController {
    @Autowired
    private LocalizacaoBO localizacaoBO;

    public LocalizacaoController(LocalizacaoBO localizacaoBO){
        this.localizacaoBO = localizacaoBO;
    }

    @GetMapping
    public ResponseEntity<List<Localizacao>> listarLocalizacao(){
        return ResponseEntity.status(200).body(localizacaoBO.listarLocalizacoes());
    }

    @PostMapping
    public ResponseEntity<Localizacao> criarLocalizacao(@RequestBody Localizacao localizacao){
        return ResponseEntity.status(201).body(localizacaoBO.criarLocalizacao(localizacao));
    }

    @PutMapping
    public ResponseEntity<Localizacao> editarLocalizacao(@RequestBody Integer id, Localizacao localizacao){
        return ResponseEntity.status(200).body(localizacaoBO.alterarLocalizacao(id,localizacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirLocalizacao(@PathVariable Integer id){
        localizacaoBO.excluirLocalizacao(id);
        return ResponseEntity.status(204).build();
    }
}

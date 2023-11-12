package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.ImplementoBO;
import br.com.jevsrakja.sprint04.model.vo.Implemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/implemento")
public class ImplementoController {
    @Autowired
    private ImplementoBO implementoBO;

    public ImplementoController(ImplementoBO implementoBO){
        this.implementoBO = implementoBO;
    }

    @GetMapping
    public ResponseEntity<List<Implemento>> listarImplementos(){
        return ResponseEntity.status(200).body(implementoBO.listarImplementos());
    }

    @PostMapping
    public ResponseEntity<Implemento> criarImplemento(@RequestBody Implemento implemento){
        return ResponseEntity.status(201).body(implementoBO.criarImplemento(implemento));
    }

    @PutMapping
    public ResponseEntity<Implemento> editarImplemento(@RequestBody Integer id, Implemento implemento){
        return ResponseEntity.status(200).body(implementoBO.alterarImplemento(id,implemento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirImplemento(@PathVariable Integer id){
        implementoBO.excluirImplemento(id);
        return ResponseEntity.status(204).build();
    }
}

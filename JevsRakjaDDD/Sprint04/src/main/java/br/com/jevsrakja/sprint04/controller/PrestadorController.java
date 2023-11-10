package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.PrestadorBO;
import br.com.jevsrakja.sprint04.model.vo.Prestador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/prestador")
public class PrestadorController {
    @Autowired
    private PrestadorBO prestadorBO;

    public PrestadorController(PrestadorBO prestadorBO){
        this.prestadorBO = prestadorBO;
    }

    @GetMapping
    public ResponseEntity<List<Prestador>> listarPrestador(){
        return ResponseEntity.status(200).body(prestadorBO.listarPrestador());
    }

    @PostMapping
    public ResponseEntity<Prestador> criarPrestador(@RequestBody Prestador prestador){
        return ResponseEntity.status(201).body(prestadorBO.criarPrestador(prestador));
    }

    @PutMapping
    public ResponseEntity<Prestador> editarPrestador(@RequestBody Integer id, Prestador prestador){
        return ResponseEntity.status(200).body(prestadorBO.alterarPrestador(id,prestador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirPrestador(@PathVariable Integer id){
        prestadorBO.excluirPrestador(id);
        return ResponseEntity.status(204).build();
    }
}

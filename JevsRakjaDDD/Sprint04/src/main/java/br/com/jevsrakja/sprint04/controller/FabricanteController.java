package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.EnderecoBO;
import br.com.jevsrakja.sprint04.model.bo.FabricanteBO;
import br.com.jevsrakja.sprint04.model.vo.Endereco;
import br.com.jevsrakja.sprint04.model.vo.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/fabricante")
public class FabricanteController {
    @Autowired
    private FabricanteBO fabricanteBO;

    public FabricanteController(FabricanteBO fabricanteBO){
        this.fabricanteBO = fabricanteBO;
    }

    @GetMapping
    public ResponseEntity<List<Fabricante>> listarFabricantes(){
        return ResponseEntity.status(200).body(fabricanteBO.listarFabricantes());
    }

    @PostMapping
    public ResponseEntity<Fabricante> criarFabricante(@RequestBody Fabricante fabricante){
        return ResponseEntity.status(201).body(fabricanteBO.criarFabricante(fabricante));
    }

    @PutMapping
    public ResponseEntity<Fabricante> editarFabricante(@RequestBody Integer id, Fabricante fabricante){
        return ResponseEntity.status(200).body(fabricanteBO.alterarFabricante(id,fabricante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirFabricante(@PathVariable Integer id){
        fabricanteBO.excluirFabricante(id);
        return ResponseEntity.status(204).build();
    }
}

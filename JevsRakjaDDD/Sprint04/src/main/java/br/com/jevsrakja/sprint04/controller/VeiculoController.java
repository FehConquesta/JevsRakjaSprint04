package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.VeiculoBO;
import br.com.jevsrakja.sprint04.model.vo.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoBO veiculoBO;

    public VeiculoController(VeiculoBO veiculoBO){
        this.veiculoBO = veiculoBO;
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> listarVeiculo(){
        return ResponseEntity.status(200).body(veiculoBO.listarVeiculos());
    }

    @PostMapping
    public ResponseEntity<Veiculo> criarVeiculo(@RequestBody Veiculo veiculo){
        return ResponseEntity.status(201).body(veiculoBO.criarVeiculo(veiculo));
    }

    @PutMapping
    public ResponseEntity<Veiculo> editarVeiculo(@RequestBody Integer id, Veiculo veiculo){
        return ResponseEntity.status(200).body(veiculoBO.alterarVeiculo(id,veiculo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirVeiculo(@PathVariable Integer id){
        veiculoBO.excluirVeiculo(id);
        return ResponseEntity.status(204).build();
    }
}

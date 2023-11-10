package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.EnderecoBO;
import br.com.jevsrakja.sprint04.model.vo.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoBO enderecoBO;

    public EnderecoController(EnderecoBO enderecoBO){
        this.enderecoBO = enderecoBO;
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> listarEnderecos(){
        return ResponseEntity.status(200).body(enderecoBO.listarEnderecos());
    }

    @PostMapping
    public ResponseEntity<Endereco> criarEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.status(201).body(enderecoBO.criarEndereco(endereco));
    }

    @PutMapping
    public ResponseEntity<Endereco> editarEndereco(@RequestBody Integer id, Endereco endereco){
        return ResponseEntity.status(200).body(enderecoBO.alterarEndereco(id,endereco));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirEndereco(@PathVariable Integer id){
        enderecoBO.excluirEndereco(id);
        return ResponseEntity.status(204).build();
    }


}

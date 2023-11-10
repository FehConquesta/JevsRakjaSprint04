package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.ClienteBO;
import br.com.jevsrakja.sprint04.model.vo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteBO clienteBO;

    public ClienteController(ClienteBO clienteBO){
        this.clienteBO = clienteBO;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listaClientes(){
        return ResponseEntity.status(200).body(clienteBO.listarClientes());
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(201).body(clienteBO.criarCliente(cliente));
    }

    @PutMapping
    public ResponseEntity<Cliente> editarCliente(@RequestBody Integer id, Cliente cliente){
        return ResponseEntity.status(200).body(clienteBO.alterarCliente(id,cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirCliente(@PathVariable Integer id){
        clienteBO.excluirCliente(id);
        return ResponseEntity.status(204).build();
    }
}

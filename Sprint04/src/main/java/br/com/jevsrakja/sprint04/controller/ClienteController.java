package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.ClienteBO;
import br.com.jevsrakja.sprint04.model.vo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para operações relacionadas a Clientes.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteBO clienteBO;
    /**
     * Construtor para injetar o serviço ClienteBO.
     *
     * @param clienteBO O serviço ClienteBO a ser injetado.
     */
    public ClienteController(ClienteBO clienteBO){
        this.clienteBO = clienteBO;
    }
    /**
     * Endpoint para listar todos os Clientes.
     *
     * @return ResponseEntity contendo a lista de Clientes e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Cliente>> listaClientes(){
        return ResponseEntity.status(200).body(clienteBO.listarClientes());
    }
    /**
     * Endpoint para criar um novo Cliente.
     *
     * @param cliente O Cliente a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Cliente recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(201).body(clienteBO.criarCliente(cliente));
    }
    /**
     * Endpoint para editar um Cliente existente.
     *
     * @param id          O ID do Cliente a ser editado, fornecido como parte da URL.
     * @param cliente O Cliente atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Cliente atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Cliente> editarCliente(@RequestBody Integer id, Cliente cliente){
        return ResponseEntity.status(200).body(clienteBO.alterarCliente(id,cliente));
    }
    /**
     * Endpoint para excluir um Cliente pelo ID.
     *
     * @param id O ID do Cliente a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirCliente(@PathVariable Integer id){
        clienteBO.excluirCliente(id);
        return ResponseEntity.status(204).build();
    }
}

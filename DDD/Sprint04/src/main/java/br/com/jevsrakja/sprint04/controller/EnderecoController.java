package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.EnderecoBO;
import br.com.jevsrakja.sprint04.model.vo.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas a Enderecos.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoBO enderecoBO;
    /**
     * Construtor para injetar o serviço EnderecoBO.
     *
     * @param enderecoBO O serviço EnderecoBO a ser injetado.
     */
    public EnderecoController(EnderecoBO enderecoBO){
        this.enderecoBO = enderecoBO;
    }
    /**
     * Endpoint para listar todos os Enderecos.
     *
     * @return ResponseEntity contendo a lista de Enderecos e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Endereco>> listarEnderecos(){
        return ResponseEntity.status(200).body(enderecoBO.listarEnderecos());
    }
    /**
     * Endpoint para criar um novo Endereco.
     *
     * @param endereco O Endereco a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Endereco recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Endereco> criarEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.status(201).body(enderecoBO.criarEndereco(endereco));
    }
    /**
     * Endpoint para editar um Endereco existente.
     *
     * @param id          O ID do Endereco a ser editado, fornecido como parte da URL.
     * @param endereco O Endereco atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Endereco atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Endereco> editarEndereco(@RequestBody Integer id, Endereco endereco){
        return ResponseEntity.status(200).body(enderecoBO.alterarEndereco(id,endereco));
    }
    /**
     * Endpoint para excluir um Endereco pelo ID.
     *
     * @param id O ID do Endereco a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirEndereco(@PathVariable Integer id){
        enderecoBO.excluirEndereco(id);
        return ResponseEntity.status(204).build();
    }


}

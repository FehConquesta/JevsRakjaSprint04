package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.PrestadorBO;
import br.com.jevsrakja.sprint04.model.vo.Prestador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas ao Prestador.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/prestador")
public class PrestadorController {
    @Autowired
    private PrestadorBO prestadorBO;
    /**
     * Construtor para injetar o serviço PrestadorBO.
     *
     * @param prestadorBO O serviço PrestadorBO a ser injetado.
     */
    public PrestadorController(PrestadorBO prestadorBO){
        this.prestadorBO = prestadorBO;
    }
    /**
     * Endpoint para listar todos os Prestador.
     *
     * @return ResponseEntity contendo a lista de Prestadores e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Prestador>> listarPrestador(){
        return ResponseEntity.status(200).body(prestadorBO.listarPrestador());
    }
    /**
     * Endpoint para criar um novo Prestador.
     *
     * @param prestador O Prestador a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Prestador recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Prestador> criarPrestador(@RequestBody Prestador prestador){
        return ResponseEntity.status(201).body(prestadorBO.criarPrestador(prestador));
    }
    /**
     * Endpoint para editar um Prestador existente.
     *
     * @param id          O ID do Prestador a ser editado, fornecido como parte da URL.
     * @param prestador O Prestador atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Prestador atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Prestador> editarPrestador(@RequestBody Integer id, Prestador prestador){
        return ResponseEntity.status(200).body(prestadorBO.alterarPrestador(id,prestador));
    }
    /**
     * Endpoint para excluir um Prestador pelo ID.
     *
     * @param id O ID do Prestador a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirPrestador(@PathVariable Integer id){
        prestadorBO.excluirPrestador(id);
        return ResponseEntity.status(204).build();
    }
}

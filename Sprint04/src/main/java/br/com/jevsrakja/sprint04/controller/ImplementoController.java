package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.ImplementoBO;
import br.com.jevsrakja.sprint04.model.vo.Implemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas ao Implemento.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/implemento")
public class ImplementoController {
    @Autowired
    private ImplementoBO implementoBO;
    /**
     * Construtor para injetar o serviço ImplementoBO.
     *
     * @param implementoBO O serviço ImplementoBO a ser injetado.
     */
    public ImplementoController(ImplementoBO implementoBO){
        this.implementoBO = implementoBO;
    }
    /**
     * Endpoint para listar todos os Implementos.
     *
     * @return ResponseEntity contendo a lista de Implementos e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Implemento>> listarImplementos(){
        return ResponseEntity.status(200).body(implementoBO.listarImplementos());
    }
    /**
     * Endpoint para criar um novo Implemento.
     *
     * @param implemento O Implemento a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Implemento recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Implemento> criarImplemento(@RequestBody Implemento implemento){
        return ResponseEntity.status(201).body(implementoBO.criarImplemento(implemento));
    }
    /**
     * Endpoint para editar um Implemento existente.
     *
     * @param id          O ID do Implemento a ser editado, fornecido como parte da URL.
     * @param implemento O Implemento atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Implemento atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Implemento> editarImplemento(@RequestBody Integer id, Implemento implemento){
        return ResponseEntity.status(200).body(implementoBO.alterarImplemento(id,implemento));
    }
    /**
     * Endpoint para excluir um Implemento pelo ID.
     *
     * @param id O ID do Implemento a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirImplemento(@PathVariable Integer id){
        implementoBO.excluirImplemento(id);
        return ResponseEntity.status(204).build();
    }
}

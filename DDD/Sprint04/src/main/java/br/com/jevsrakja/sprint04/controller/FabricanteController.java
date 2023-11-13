package br.com.jevsrakja.sprint04.controller;


import br.com.jevsrakja.sprint04.model.bo.FabricanteBO;
import br.com.jevsrakja.sprint04.model.vo.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas a Fabricante.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/fabricante")
public class FabricanteController {
    @Autowired
    private FabricanteBO fabricanteBO;
    /**
     * Construtor para injetar o serviço FrabricanteBO.
     *
     * @param fabricanteBO O serviço FabricanteBO a ser injetado.
     */
    public FabricanteController(FabricanteBO fabricanteBO){
        this.fabricanteBO = fabricanteBO;
    }
    /**
     * Endpoint para listar todos os Fabricantes.
     *
     * @return ResponseEntity contendo a lista de Fabricantes e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Fabricante>> listarFabricantes(){
        return ResponseEntity.status(200).body(fabricanteBO.listarFabricantes());
    }
    /**
     * Endpoint para criar um novo Fabricante.
     *
     * @param fabricante O Fabricante a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Fabricante recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Fabricante> criarFabricante(@RequestBody Fabricante fabricante){
        return ResponseEntity.status(201).body(fabricanteBO.criarFabricante(fabricante));
    }
    /**
     * Endpoint para editar um Fabricante existente.
     *
     * @param id          O ID do Fabricante a ser editado, fornecido como parte da URL.
     * @param fabricante O Fabricante atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Fabricante atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Fabricante> editarFabricante(@RequestBody Integer id, Fabricante fabricante){
        return ResponseEntity.status(200).body(fabricanteBO.alterarFabricante(id,fabricante));
    }
    /**
     * Endpoint para excluir um Fabricante pelo ID.
     *
     * @param id O ID do Fabricante a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirFabricante(@PathVariable Integer id){
        fabricanteBO.excluirFabricante(id);
        return ResponseEntity.status(204).build();
    }
}

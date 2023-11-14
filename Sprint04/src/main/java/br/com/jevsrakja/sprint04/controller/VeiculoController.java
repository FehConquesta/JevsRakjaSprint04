package br.com.jevsrakja.sprint04.controller;

import br.com.jevsrakja.sprint04.model.bo.VeiculoBO;
import br.com.jevsrakja.sprint04.model.vo.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controlador para operações relacionadas ao Veiculo.
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoBO veiculoBO;
    /**
     * Construtor para injetar o serviço VeiculoBO.
     *
     * @param veiculoBO O serviço VeiculoBO a ser injetado.
     */
    public VeiculoController(VeiculoBO veiculoBO){
        this.veiculoBO = veiculoBO;
    }
    /**
     * Endpoint para listar todos os Veiculo.
     *
     * @return ResponseEntity contendo a lista de Veiculos e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Veiculo>> listarVeiculo(){
        return ResponseEntity.status(200).body(veiculoBO.listarVeiculos());
    }
    /**
     * Endpoint para criar um novo Veiculo.
     *
     * @param veiculo O Veiculo a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Veiculo recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Veiculo> criarVeiculo(@RequestBody Veiculo veiculo){
        return ResponseEntity.status(201).body(veiculoBO.criarVeiculo(veiculo));
    }
    /**
     * Endpoint para editar um Veiculo existente.
     *
     * @param id          O ID do Veiculo a ser editado, fornecido como parte da URL.
     * @param veiculo O Veiculo atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Veiculo atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Veiculo> editarVeiculo(@RequestBody Integer id, Veiculo veiculo){
        return ResponseEntity.status(200).body(veiculoBO.alterarVeiculo(id,veiculo));
    }
    /**
     * Endpoint para excluir um Veiculo pelo ID.
     *
     * @param id O ID do Veiculo a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirVeiculo(@PathVariable Integer id){
        veiculoBO.excluirVeiculo(id);
        return ResponseEntity.status(204).build();
    }
}

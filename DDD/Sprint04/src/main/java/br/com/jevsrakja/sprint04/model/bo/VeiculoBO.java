package br.com.jevsrakja.sprint04.model.bo;


import br.com.jevsrakja.sprint04.model.dao.VeiculoDAO;
import br.com.jevsrakja.sprint04.model.vo.Veiculo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço VeiculoBO para gestão de entidades de Veiculo
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class VeiculoBO {
    /**
     * Injeção de dependencia
     */
    private VeiculoDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public VeiculoBO(VeiculoDAO repository) {this.repository = repository;}
    /**
     * Metodo para gerar uma lista com todos os Veiculos
     * @return lista de Veiculos
     */
    public List<Veiculo> listarVeiculos(){
        List<Veiculo> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Veiculo
     * @param veiculo a entidade Veiculo que será criada
     * @return o novoVeiculo criado
     */
    public Veiculo criarVeiculo(Veiculo veiculo){
        Veiculo novoVeiculo = repository.save(veiculo);
        return novoVeiculo;
    }
    /**
     * Metodo para alterar um Veiculo existente com base em um ID fornecido
     * @param id O id do Veiculo a ser atualizado
     * @param veiculo a entidade do Veiculo
     * @return veiculoAtualizado
     */
    public Veiculo alterarVeiculo(Integer id ,Veiculo veiculo){
        Optional<Veiculo> optionalVeiculo = repository.findById(id);
        if(optionalVeiculo.isPresent()){

            Veiculo veiculoDesatualizado = optionalVeiculo.get();
            veiculoDesatualizado.setAno(veiculo.getAno());
            veiculoDesatualizado.setPlaca(veiculo.getPlaca());
            veiculoDesatualizado.setRenavam(veiculo.getRenavam());
            veiculoDesatualizado.setPortas(veiculo.getPortas());
            veiculoDesatualizado.setApolice(veiculo.getApolice());
            veiculoDesatualizado.setIdFabricante(veiculo.getIdFabricante());
            veiculoDesatualizado.setIdImplemento(veiculo.getIdImplemento());
            veiculoDesatualizado.setIdCliente(veiculo.getIdCliente());

            Veiculo veiculoAtualizado = repository.save(veiculoDesatualizado);

            return veiculoAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }
    /**
     * Metodo para excluir um Veiculo com base em um id fornecido
     * @param id O id do Veiculo a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirVeiculo(Integer id){
        repository.deleteById(id);
        return true;
    }
}

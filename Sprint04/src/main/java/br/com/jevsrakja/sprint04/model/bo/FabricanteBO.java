package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.FabricanteDAO;
import br.com.jevsrakja.sprint04.model.vo.Fabricante;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço FabricanteBO para gestão de entidades de Fabricante
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class FabricanteBO {
    /**
     * Injeção de dependencia
     */
    private FabricanteDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public FabricanteBO(FabricanteDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Fabricantes
     * @return lista de Fabricantes
     */
    public List<Fabricante> listarFabricantes(){
        List<Fabricante> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Fabricante
     * @param fabricante a entidade Fabricante que será criada
     * @return o novoFabricante criado
     */
    public Fabricante criarFabricante(Fabricante fabricante){
        Fabricante novoFabricante = repository.save(fabricante);
        return novoFabricante;
    }
    /**
     * Metodo para alterar um Fabricante existente com base em um ID fornecido
     * @param id O id do Fabricante a ser atualizado
     * @param fabricante a entidade do Fabricante
     * @return fabricanteAtualizado
     */
    public Fabricante alterarFabricante(Integer id ,Fabricante fabricante){
        Optional<Fabricante> optionalFabricante = repository.findById(id);
        if(optionalFabricante.isPresent()){

            Fabricante fabricanteDesatualizado = optionalFabricante.get();
            fabricanteDesatualizado.setNome(fabricante.getNome());
            fabricanteDesatualizado.setModelo(fabricante.getModelo());

            Fabricante fabricanteAtualizado = repository.save(fabricanteDesatualizado);

            return fabricanteAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }
    /**
     * Metodo para excluir um Fabricante com base em um id fornecido
     * @param id O id do Fabricante a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirFabricante(Integer id){
        repository.deleteById(id);
        return true;
    }

}

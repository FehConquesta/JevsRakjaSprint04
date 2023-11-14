package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.SeguroDAO;
import br.com.jevsrakja.sprint04.model.vo.Seguro;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço SeguroBO para gestão de entidades de Seguro
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class SeguroBO {
    /**
     * Injeção de dependencia
     */
    private SeguroDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public SeguroBO(SeguroDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Seguros
     * @return lista de Seguros
     */
    public List<Seguro> listarSeguros(){
        List<Seguro> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Seguro
     * @param seguro a entidade Seguro que será criada
     * @return o novoSeguro criado
     */
    public Seguro criarSeguro(Seguro seguro){
        Seguro novoSeguro = repository.save(seguro);
        return novoSeguro;
    }
    /**
     * Metodo para alterar um Seguro existente com base em um ID fornecido
     * @param apolice A apolice do Seguro a ser atualizado
     * @param seguro a entidade do Seguro
     * @return seguroAtualizado
     */
    public Seguro alterarSeguro(String apolice ,Seguro seguro){
        Optional<Seguro> optionalSeguro = repository.findById(apolice);
        if(optionalSeguro.isPresent()){

            Seguro seguroDesatualizado = optionalSeguro.get();
            seguroDesatualizado.setIdCliente(seguro.getIdCliente());
            seguroDesatualizado.setNumeroApolice(seguro.getNumeroApolice());


            Seguro seguroAtualizado = repository.save(seguroDesatualizado);

            return seguroAtualizado;
        }
        else{
            System.out.println("Apolice não encontrado");
            //TODO Exceções
            return null;
        }
    }
    /**
     * Metodo para excluir um Seguro com base em uma apolice fornecido
     * @param apolice A apolice do Seguro a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirSeguro(String apolice){
        repository.deleteById(apolice);
        return true;
    }
}

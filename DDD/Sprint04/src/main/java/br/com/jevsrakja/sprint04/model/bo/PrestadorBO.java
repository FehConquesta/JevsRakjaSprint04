package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.PrestadorDAO;
import br.com.jevsrakja.sprint04.model.vo.Prestador;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço PrestadorBO para gestão de entidades de Prestador
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class PrestadorBO {
    /**
     * Injeção de dependencia
     */
    private PrestadorDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public PrestadorBO(PrestadorDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Prestadores
     * @return lista de Prestador
     */
    public List<Prestador> listarPrestador(){
        List<Prestador> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Prestador
     * @param prestador a entidade Prestador que será criada
     * @return o novoPrestador criado
     */
    public Prestador criarPrestador(Prestador prestador){
        Prestador novoPrestador = repository.save(prestador);
        return novoPrestador;
    }
    /**
     * Metodo para alterar um Prestador existente com base em um ID fornecido
     * @param id O id do Prestador a ser atualizado
     * @param prestador a entidade do Prestador
     * @return prestadorAtualizado
     */
    public Prestador alterarPrestador(Integer id ,Prestador prestador){
        Optional<Prestador> optionalPrestador = repository.findById(id);
        if(optionalPrestador.isPresent()){

            Prestador prestadorDesatualizado = optionalPrestador.get();
            prestadorDesatualizado.setCpf(prestador.getCpf());
            prestadorDesatualizado.setRg(prestador.getRg());
            prestadorDesatualizado.setNomeCompleto(prestador.getNomeCompleto());
            prestadorDesatualizado.setIdEndereco(prestador.getIdEndereco());

            Prestador prestadorAtualizado = repository.save(prestadorDesatualizado);

            return prestadorAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }
    /**
     * Metodo para excluir um Prestador com base em um id fornecido
     * @param id O id do Prestador a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirPrestador(Integer id){
        repository.deleteById(id);
        return true;
    }
}

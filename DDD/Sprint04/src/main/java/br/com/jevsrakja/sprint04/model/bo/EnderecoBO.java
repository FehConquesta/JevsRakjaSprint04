package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.EnderecoDAO;
import br.com.jevsrakja.sprint04.model.vo.Endereco;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço EnderecoBO para gestão de entidades de Endereco
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class EnderecoBO {
    /**
     * Injeção de dependencia
     */
    private EnderecoDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public EnderecoBO(EnderecoDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Enderecos
     * @return lista de Enderecos
     */
    public List<Endereco> listarEnderecos(){
        List<Endereco> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Endereco
     * @param endereco a entidade Endereco que será criada
     * @return o novoEndereco criado
     */
    public Endereco criarEndereco(Endereco endereco){
        Endereco novoEndereco = repository.save(endereco);
        return novoEndereco;
    }
    /**
     * Metodo para alterar um Endereco existente com base em um ID fornecido
     * @param id O id do Endereco a ser atualizado
     * @param endereco a entidade do Endereco
     * @return enderecoAtualizado
     */
    public Endereco alterarEndereco(Integer id ,Endereco endereco){
        Optional<Endereco> optionalEndereco = repository.findById(id);
        if(optionalEndereco.isPresent()){

            Endereco enderecoDesatualizado = optionalEndereco.get();
            enderecoDesatualizado.setCep(endereco.getCep());
            enderecoDesatualizado.setNumero(endereco.getNumero());
            enderecoDesatualizado.setLogradouro(endereco.getLogradouro());
            enderecoDesatualizado.setComplemento(endereco.getComplemento());
            enderecoDesatualizado.setReferencia(endereco.getReferencia());


            Endereco enderecoAtualizado = repository.save(enderecoDesatualizado);

            return enderecoAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }
    /**
     * Metodo para excluir um Endereco com base em um id fornecido
     * @param id O id do Endereco a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirEndereco(Integer id){
        repository.deleteById(id);
        return true;
    }
}

package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.ImplementoDAO;
import br.com.jevsrakja.sprint04.model.vo.Implemento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço ImplementoBO para gestão de entidades de Implemento
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class ImplementoBO {
    /**
     * Injeção de dependencia
     */
    private ImplementoDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public ImplementoBO(ImplementoDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Implementos
     * @return lista de Implementos
     */
    public List<Implemento> listarImplementos(){
        List<Implemento> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Implemento
     * @param implemento a entidade Implemento que será criada
     * @return o novoImplemento criado
     */
    public Implemento criarImplemento(Implemento implemento){
        Implemento novoImplemento = repository.save(implemento);
        return novoImplemento;
    }
    /**
     * Metodo para alterar um Implemento existente com base em um ID fornecido
     * @param id O id do Implemento a ser atualizado
     * @param implemento a entidade do Implemento
     * @return implementoAtualizado
     */
    public Implemento alterarImplemento(Integer id ,Implemento implemento){
        Optional<Implemento> optionalImplemento = repository.findById(id);
        if(optionalImplemento.isPresent()){

            Implemento implementoDesatualizado = optionalImplemento.get();
            implementoDesatualizado.setTipoImplemento(implemento.getTipoImplemento());

            Implemento implementoAtualizado = repository.save(implementoDesatualizado);

            return implementoAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }
    /**
     * Metodo para excluir um Implemento com base em um id fornecido
     * @param id O id do Implemento a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirImplemento(Integer id){
        repository.deleteById(id);
        return true;
    }
}

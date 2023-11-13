package br.com.jevsrakja.sprint04.model.bo;
import br.com.jevsrakja.sprint04.model.dao.ModalDAO;
import br.com.jevsrakja.sprint04.model.vo.Modal;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço ModalBO para gestão de entidades de Modal
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class ModalBO {
    /**
     * Injeção de dependencia
     */
    private ModalDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public ModalBO(ModalDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Modais
     * @return lista de Modais
     */
    public List<Modal> listarModais(){
        List<Modal> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Modal
     * @param modal a entidade Modal que será criada
     * @return o novoModal criado
     */
    public Modal criarModal(Modal modal){
        Modal novoModal = repository.save(modal);
        return novoModal;
    }
    /**
     * Metodo para alterar um Modal existente com base em um ID fornecido
     * @param id O id do Modal a ser atualizado
     * @param modal a entidade do Modal
     * @return modalAtualizado
     */
    public Modal alterarModal(Integer id ,Modal modal){
        Optional<Modal> optionalModal = repository.findById(id);
        if(optionalModal.isPresent()){

            Modal modalDesatualizado = optionalModal.get();
            modalDesatualizado.setDisponibilidade(modal.isDisponibilidade());
            modalDesatualizado.setModelo(modal.getModelo());
            modalDesatualizado.setPlaca(modal.getPlaca());
            modalDesatualizado.setIdPrestador(modal.getIdPrestador());

            Modal modalAtualizado = repository.save(modalDesatualizado);

            return modalAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }
    /**
     * Metodo para excluir um Modal com base em um id fornecido
     * @param id O id do Modal a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirModal(Integer id){
        repository.deleteById(id);
        return true;
    }
}

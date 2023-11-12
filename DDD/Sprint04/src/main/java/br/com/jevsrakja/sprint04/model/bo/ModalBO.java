package br.com.jevsrakja.sprint04.model.bo;


import br.com.jevsrakja.sprint04.model.dao.ModalDAO;
import br.com.jevsrakja.sprint04.model.vo.Modal;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class ModalBO {

    private ModalDAO repository;

    public ModalBO(ModalDAO repository) {
        this.repository = repository;
    }

    public List<Modal> listarModais(){
        List<Modal> lista = repository.findAll();
        return lista;
    }

    public Modal criarModal(Modal modal){
        Modal novoModal = repository.save(modal);
        return novoModal;
    }

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

    public Boolean excluirModal(Integer id){
        repository.deleteById(id);
        return true;
    }
}

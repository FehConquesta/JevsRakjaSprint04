package br.com.jevsrakja.sprint04.model.bo;



import br.com.jevsrakja.sprint04.model.dao.ImplementoDAO;
import br.com.jevsrakja.sprint04.model.vo.Implemento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ImplementoBO {

    private ImplementoDAO repository;

    public ImplementoBO(ImplementoDAO repository) {
        this.repository = repository;
    }

    public List<Implemento> listarImplementos(){
        List<Implemento> lista = repository.findAll();
        return lista;
    }

    public Implemento criarImplemento(Implemento implemento){
        Implemento novoImplemento = repository.save(implemento);
        return novoImplemento;
    }

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

    public Boolean excluirImplemento(Integer id){
        repository.deleteById(id);
        return true;
    }
}

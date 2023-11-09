package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.AtendimentoDAO;
import br.com.jevsrakja.sprint04.model.vo.Atendimento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtendimentoBO {

    private AtendimentoDAO repository;

    public AtendimentoBO(AtendimentoDAO repository) {
        this.repository = repository;
    }

    public List<Atendimento> listarAtendimentos(){
        List<Atendimento> lista = repository.findAll();
        return lista;
    }

    public Atendimento criarAtendimento(Atendimento atendimento){
        Atendimento novoAtendimento = repository.save(atendimento);
        return novoAtendimento;
    }

    public Atendimento alterarAtendimento(Integer id ,Atendimento atendimento){
        Optional<Atendimento> optionalAtendimento = repository.findById(id);
        if(optionalAtendimento.isPresent()){

            Atendimento atendimentoDesatualizado = optionalAtendimento.get();
            atendimentoDesatualizado.setData(atendimento.getData());
            atendimentoDesatualizado.setIdCliente(atendimento.getIdCliente());
            atendimentoDesatualizado.setPbtc(atendimento.getPbtc());
            atendimentoDesatualizado.setIdModal(atendimento.getIdModal());
            atendimentoDesatualizado.setIdVeiculo(atendimento.getIdVeiculo());
            atendimentoDesatualizado.setIdLocalizacao(atendimento.getIdLocalizacao());

            Atendimento atendimentoAtualizado = repository.save(atendimentoDesatualizado);

            return atendimentoAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirAtendimento(Integer id){
        repository.deleteById(id);
        return true;
    }









}

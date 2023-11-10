package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.LocalizacaoDAO;
import br.com.jevsrakja.sprint04.model.vo.Localizacao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LocalizacaoBO {

    private LocalizacaoDAO repository;

    public LocalizacaoBO(LocalizacaoDAO repository) {
        this.repository = repository;
    }

    public List<Localizacao> listarLocalizacoes(){
        List<Localizacao> lista = repository.findAll();
        return lista;
    }

    public Localizacao criarLocalizacao (Localizacao localizacao){
        Localizacao novaLocalizacao = repository.save(localizacao);
        return novaLocalizacao;
    }

    public Localizacao alterarLocalizacao(Integer id ,Localizacao localizacao){
        Optional<Localizacao> optionalLocalizacao = repository.findById(id);
        if(optionalLocalizacao.isPresent()){

            Localizacao localizacaoDesatualizado = optionalLocalizacao.get();
            localizacaoDesatualizado.setCep(localizacao.getCep());
            localizacaoDesatualizado.setNomeRodovia(localizacao.getNomeRodovia());
            localizacaoDesatualizado.setKm(localizacao.getKm());
            localizacaoDesatualizado.setReferencia(localizacao.getReferencia());

            Localizacao localizacaoAtualizada = repository.save(localizacaoDesatualizado);

            return localizacaoAtualizada;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirLocalizacao(Integer id){
        repository.deleteById(id);
        return true;
    }

}

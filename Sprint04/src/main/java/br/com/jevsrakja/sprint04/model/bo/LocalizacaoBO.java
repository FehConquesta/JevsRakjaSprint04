package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.LocalizacaoDAO;
import br.com.jevsrakja.sprint04.model.vo.Localizacao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço LocalizacaoBO para gestão de entidades de Localizacao
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class LocalizacaoBO {
    /**
     * Injeção de dependencia
     */
    private LocalizacaoDAO repository;
    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public LocalizacaoBO(LocalizacaoDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Localizacoes
     * @return lista de Localizacoes
     */
    public List<Localizacao> listarLocalizacoes(){
        List<Localizacao> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar uma nova Localizacao
     * @param localizacao a entidade Localizacao que será criada
     * @return a novoLocalizacao criado
     */
    public Localizacao criarLocalizacao (Localizacao localizacao){
        Localizacao novaLocalizacao = repository.save(localizacao);
        return novaLocalizacao;
    }
    /**
     * Metodo para alterar uma Localizacao existente com base em um ID fornecido
     * @param id O id da Localizacao a ser atualizado
     * @param localizacao a entidade da Localizacao
     * @return LocalizacaoAtualizado
     */
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
    /**
     * Metodo para excluir uma Localizacao com base em um id fornecido
     * @param id O id do Localizacao a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirLocalizacao(Integer id){
        repository.deleteById(id);
        return true;
    }

}

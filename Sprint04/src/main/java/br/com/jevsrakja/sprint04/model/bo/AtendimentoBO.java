package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.AtendimentoDAO;
import br.com.jevsrakja.sprint04.model.vo.Atendimento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço AtendimentoBO para gestão de entidades de Atendimento
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class AtendimentoBO {
    /**
     * Injeção de dependencia
     */
    private AtendimentoDAO repository;

    /**
     * Construtor para injeçao de dependencia
     *
     * @param repository
     */
    public AtendimentoBO(AtendimentoDAO repository) {
        this.repository = repository;
    }

    /**
     * Metodo para gerar uma lista com todos os Atendimentos
     * @return Lista de Atendimentos
     */
    public List<Atendimento> listarAtendimentos(){
        List<Atendimento> lista = repository.findAll();
        return lista;
    }

    /**
     * Metodo para criar um novo Atendimento
     * @param atendimento a entidade Atendimento que será criada
     * @return o novoAtendimento criado
     */
    public Atendimento criarAtendimento(Atendimento atendimento){
        Atendimento novoAtendimento = repository.save(atendimento);
        return novoAtendimento;
    }

    /**
     * Metodo para alterar um Atendimento existente com base em um ID fornecido
     *
     * @param id O id do Atendimento a ser atualizado
     * @param atendimento A  do Atendimento
     * @return atendimentoAtualizado
     */
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

    /**
     * Metodo para excluir um Atendimento com base em um id fornecido
     * @param id O id do Atendimento a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirAtendimento(Integer id){
        repository.deleteById(id);
        return true;
    }









}

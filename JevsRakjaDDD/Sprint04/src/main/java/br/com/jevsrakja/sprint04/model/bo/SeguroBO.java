package br.com.jevsrakja.sprint04.model.bo;



import br.com.jevsrakja.sprint04.model.dao.SeguroDAO;
import br.com.jevsrakja.sprint04.model.vo.Seguro;

import java.util.List;
import java.util.Optional;

public class SeguroBO {
    private SeguroDAO repository;

    public SeguroBO(SeguroDAO repository) {
        this.repository = repository;
    }

    public List<Seguro> listarSeguros(){
        List<Seguro> lista = repository.findAll();
        return lista;
    }

    public Seguro criarSeguro(Seguro seguro){
        Seguro novoSeguro = repository.save(seguro);
        return novoSeguro;
    }

    public Seguro alterarISeguro(String apolice ,Seguro seguro){
        Optional<Seguro> optionalSeguro = repository.findById(apolice);
        if(optionalSeguro.isPresent()){

            Seguro seguroDesatualizado = optionalSeguro.get();
            seguroDesatualizado.setId_cliente(seguro.getId_cliente());
            seguroDesatualizado.setNumero_apolice(seguro.getNumero_apolice());


            Seguro seguroAtualizado = repository.save(seguroDesatualizado);

            return seguroAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirSeguro(String apolice){
        repository.deleteById(apolice);
        return true;
    }
}

package br.com.jevsrakja.sprint04.model.bo;



import br.com.jevsrakja.sprint04.model.dao.PrestadorDAO;
import br.com.jevsrakja.sprint04.model.vo.Prestador;

import java.util.List;
import java.util.Optional;

public class PrestadorBO {
    private PrestadorDAO repository;

    public PrestadorBO(PrestadorDAO repository) {
        this.repository = repository;
    }

    public List<Prestador> listarPrestador(){
        List<Prestador> lista = repository.findAll();
        return lista;
    }

    public Prestador criarPrestador(Prestador prestador){
        Prestador novoPrestador = repository.save(prestador);
        return novoPrestador;
    }

    public Prestador alterarPrestador(Integer id ,Prestador prestador){
        Optional<Prestador> optionalPrestador = repository.findById(id);
        if(optionalPrestador.isPresent()){

            Prestador prestadorDesatualizado = optionalPrestador.get();
            prestadorDesatualizado.setCpf(prestador.getCpf());
            prestadorDesatualizado.setRg(prestador.getRg());
            prestadorDesatualizado.setNomeCompleto(prestador.getNomeCompleto());
            prestadorDesatualizado.setIdEndereco(prestador.getIdEndereco());

            Prestador prestadorAtualizado = repository.save(prestadorDesatualizado);

            return prestadorAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirPrestador(Integer id){
        repository.deleteById(id);
        return true;
    }
}

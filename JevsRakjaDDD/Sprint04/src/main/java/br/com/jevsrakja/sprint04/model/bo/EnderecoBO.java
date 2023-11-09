package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.EnderecoDAO;
import br.com.jevsrakja.sprint04.model.vo.Endereco;

import java.util.List;
import java.util.Optional;

public class EnderecoBO {

    private EnderecoDAO repository;

    public EnderecoBO(EnderecoDAO repository) {
        this.repository = repository;
    }

    public List<Endereco> listarEnderecos(){
        List<Endereco> lista = repository.findAll();
        return lista;
    }

    public Endereco criarEndereco(Endereco endereco){
        Endereco novoEndereco = repository.save(endereco);
        return novoEndereco;
    }

    public Endereco alterarEndereco(Integer id ,Endereco endereco){
        Optional<Endereco> optionalEndereco = repository.findById(id);
        if(optionalEndereco.isPresent()){

            Endereco enderecoDesatualizado = optionalEndereco.get();
            enderecoDesatualizado.setCep(endereco.getCep());
            enderecoDesatualizado.setNumero(endereco.getNumero());
            enderecoDesatualizado.setLogradouro(endereco.getLogradouro());
            enderecoDesatualizado.setComplemento(endereco.getComplemento());
            enderecoDesatualizado.setReferencia(endereco.getReferencia());


            Endereco enderecoAtualizado = repository.save(enderecoDesatualizado);

            return enderecoAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirEndereco(Integer id){
        repository.deleteById(id);
        return true;
    }
}

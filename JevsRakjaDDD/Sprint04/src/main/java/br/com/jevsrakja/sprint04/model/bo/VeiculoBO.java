package br.com.jevsrakja.sprint04.model.bo;


import br.com.jevsrakja.sprint04.model.dao.VeiculoDAO;
import br.com.jevsrakja.sprint04.model.vo.Veiculo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VeiculoBO {
    private VeiculoDAO repository;

    public VeiculoBO(VeiculoDAO repository) {this.repository = repository;}

    public List<Veiculo> listarVeiculos(){
        List<Veiculo> lista = repository.findAll();
        return lista;
    }

    public Veiculo criarVeiculo(Veiculo veiculo){
        Veiculo novoVeiculo = repository.save(veiculo);
        return novoVeiculo;
    }

    public Veiculo alterarVeiculo(Integer id ,Veiculo veiculo){
        Optional<Veiculo> optionalVeiculo = repository.findById(id);
        if(optionalVeiculo.isPresent()){

            Veiculo veiculoDesatualizado = optionalVeiculo.get();
            veiculoDesatualizado.setAno(veiculo.getAno());
            veiculoDesatualizado.setPlaca(veiculo.getPlaca());
            veiculoDesatualizado.setRenavam(veiculo.getRenavam());
            veiculoDesatualizado.setPortas(veiculo.getPortas());
            veiculoDesatualizado.setApolice(veiculo.getApolice());
            veiculoDesatualizado.setFabricante(veiculo.getFabricante());
            veiculoDesatualizado.setImplemento(veiculo.getImplemento());
            veiculoDesatualizado.setCliente(veiculo.getCliente());

            Veiculo veiculoAtualizado = repository.save(veiculoDesatualizado);

            return veiculoAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirVeiculo(Integer id){
        repository.deleteById(id);
        return true;
    }
}

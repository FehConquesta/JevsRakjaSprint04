package br.com.jevsrakja.sprint04.model.bo;



import br.com.jevsrakja.sprint04.model.dao.FabricanteDAO;
import br.com.jevsrakja.sprint04.model.vo.Fabricante;

import java.util.List;
import java.util.Optional;

public class FabricanteBO {

    private FabricanteDAO repository;

    public FabricanteBO(FabricanteDAO repository) {
        this.repository = repository;
    }

    public List<Fabricante> listarFabricantes(){
        List<Fabricante> lista = repository.findAll();
        return lista;
    }

    public Fabricante criarFabricante(Fabricante fabricante){
        Fabricante novoFabricante = repository.save(fabricante);
        return novoFabricante;
    }

    public Fabricante alterarFabricante(Integer id ,Fabricante fabricante){
        Optional<Fabricante> optionalFabricante = repository.findById(id);
        if(optionalFabricante.isPresent()){

            Fabricante fabricanteDesatualizado = optionalFabricante.get();
            fabricanteDesatualizado.setNome(fabricante.getNome());
            fabricanteDesatualizado.setModelo(fabricante.getModelo());

            Fabricante fabricanteAtualizado = repository.save(fabricanteDesatualizado);

            return fabricanteAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirFabricante(Integer id){
        repository.deleteById(id);
        return true;
    }

}

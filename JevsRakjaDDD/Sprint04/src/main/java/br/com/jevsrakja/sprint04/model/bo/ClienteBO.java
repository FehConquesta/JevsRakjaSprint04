package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.ClienteDAO;
import br.com.jevsrakja.sprint04.model.vo.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteBO {
    private ClienteDAO repository;

    public ClienteBO(ClienteDAO repository) {
        this.repository = repository;
    }

    public List<Cliente> listarClientes(){
        List<Cliente> lista = repository.findAll();
        return lista;
    }

    public Cliente criarCliente(Cliente cliente){
        Cliente novoCliente = repository.save(cliente);
        return novoCliente;
    }

    public Cliente alterarCliente(Integer id ,Cliente cliente){
        Optional<Cliente> optionalCliente = repository.findById(id);
        if(optionalCliente.isPresent()){

            Cliente clienteDesatualizado = optionalCliente.get();
            clienteDesatualizado.setCpf(cliente.getCpf());
            clienteDesatualizado.setNomeCompleto(cliente.getNomeCompleto());
            clienteDesatualizado.setRg(cliente.getRg());
            clienteDesatualizado.setEndereco(cliente.getEndereco());



            Cliente clienteAtualizado = repository.save(clienteDesatualizado);

            return clienteAtualizado;
        }
        else{
            System.out.println("ID não encontrado");
            //TODO Exceções
            return null;
        }
    }

    public Boolean excluirCliente(Integer id){
        repository.deleteById(id);
        return true;
    }
}

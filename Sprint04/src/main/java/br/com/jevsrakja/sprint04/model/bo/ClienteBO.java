package br.com.jevsrakja.sprint04.model.bo;

import br.com.jevsrakja.sprint04.model.dao.ClienteDAO;
import br.com.jevsrakja.sprint04.model.vo.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Classe de serviço ClienteBO para gestão de entidades de Cliente
 *
 * @author Luiz Felipe Biazzola Cavalcane
 */
@Service
public class ClienteBO {

    /**
     * Injeção de dependencia
     */
    private ClienteDAO repository;

    /**
     * Construtor para injeçao de dependencia
     * @param repository
     */
    public ClienteBO(ClienteDAO repository) {
        this.repository = repository;
    }

    /**
     * Metodo para gerar uma lista com todos os Clientes
     * @return lista de Clientes
     */
    public List<Cliente> listarClientes(){
        List<Cliente> lista = repository.findAll();
        return lista;
    }

    /**
     * Metodo para criar um novo Cliente
     * @param cliente a entidade Cliente que será criada
     * @return o novoCliente criado
     */
    public Cliente criarCliente(Cliente cliente){
        Cliente novoCliente = repository.save(cliente);
        return novoCliente;
    }

    /**
     * Metodo para alterar um Cliente existente com base em um ID fornecido
     * @param id O id do CLiente a ser atualizado
     * @param cliente a entidade do Cliente
     * @return clienteAtualizado
     */
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

    /**
     * Metodo para excluir um Cliente com base em um id fornecido
     * @param id O id do Cliente a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirCliente(Integer id){
        repository.deleteById(id);
        return true;
    }
}

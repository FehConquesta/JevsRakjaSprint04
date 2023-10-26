package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Cliente;
import br.com.rakja.model.vo.Endereco;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private Connection connection;

    public ClienteDAO(Connection connection){
        this.connection = connection;
    }
    public void inserirCliente(Cliente cliente){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_cliente"
            + "(id_cliente, cpf, nome_completo, rg, id_endereco)"
                    +"VALUES(?,?,?,?,?) ");
            ps.setInt(1,cliente.getIdCliente());
            ps.setString(2,cliente.getCpf());
            ps.setString(3,cliente.getNomeCompleto());
            ps.setString(4,cliente.getRg());
            ps.setInt(5,cliente.getEndereco().getIdEndereco());
            ps.execute();
            System.out.println("Cliente cadastrado com sucesso!");
        }catch (SQLException e){
            System.err.println("Erro ao inserir o cliente : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void atualizarCliente(Cliente cliente){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_cliente"
            +"SET cpf = ?, nome_completo = ?, rg = ?, id_endereco = ?"
            + "WHERE id_cliente = ?");
            ps.setString(1,cliente.getCpf());
            ps.setString(2,cliente.getNomeCompleto());
            ps.setString(3,cliente.getRg());
            ps.setInt(4,cliente.getEndereco().getIdEndereco());
            ps.execute();
            System.out.println("Cliente alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o cliente "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarCliente(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_cliente"
            +" WHERE id_cliente = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Cliente removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar o usuario "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Cliente listarPorId(int id){
        Cliente cliente = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_cliente"
            + " WHERE id_cliente = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idCliente = rs.getInt(1);
                String cpf = rs.getString(2);
                String nome = rs.getString(3);
                String rg = rs.getString(4);
                int idEndereco = rs.getInt(5);

                cliente = new Cliente(idCliente,cpf,nome,rg,idEndereco);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo cliente "+ e.getMessage());
            e.printStackTrace();
        }
        return cliente;
    }

    public List<Cliente> exibirClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_cliente");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idCliente = rs.getInt(1);
                String cpf = rs.getString(2);
                String nome = rs.getString(3);
                String rg = rs.getString(4);
                int idEndereco = rs.getInt(5);
                clientes.add(new Cliente(idCliente,cpf,nome,rg,idEndereco));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de clientes " + e.getMessage());
            e.printStackTrace();
        }
        return clientes;
    }
}

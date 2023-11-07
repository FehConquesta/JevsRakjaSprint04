package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Cliente;
import br.com.rakja.model.vo.Endereco;
import br.com.rakja.model.vo.Prestador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO {
    private Connection connection;

    public EnderecoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirEndereco (Endereco endereco){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_endereco"
                    +"(cep, logradouro, numero, complemento, referencia"
                    +"VALUES(?, ?, ?, ?, ?)");
            ps.setString(1,endereco.getCep());
            ps.setString(2,endereco.getLogradouro());
            ps.setInt(3, endereco.getNumero());
            ps.setString(4,endereco.getComplemento());
            ps.setString(5,endereco.getReferencia());
            ps.execute();
            System.out.println("Endereço cadastrado com sucesso! ");
        }catch (SQLException e ){
            System.err.println("Erro ao cadastrar o endereço "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void atualizarEndereco(Endereco endereco){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_endereco"
                    +"SET cep = ?, logradouro = ?, numero = ?, complemento = ?, referencia = ?"
                    + "WHERE id_endereco = ?");
            ps.setString(1,endereco.getCep());
            ps.setString(2,endereco.getLogradouro());
            ps.setInt(3,endereco.getNumero());
            ps.setString(4,endereco.getComplemento());
            ps.setString(5,endereco.getReferencia());
            ps.setInt(6,endereco.getIdEndereco());
            ps.execute();
            System.out.println("Endereco alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o Endereco "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarEndereco(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_endereco"
                    +" WHERE id_endereco = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Endereco removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar o Endereco "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Endereco listarPorId(int id){
        Endereco endereco = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_endereco"
                    + " WHERE id_endereco = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idEndereco = rs.getInt(1);
                String cep = rs.getString(2);
                String logradouro = rs.getString(3);
                int numero = rs.getInt(4);
                String complemento = rs.getString(5);
                String referencia = rs.getString(6);

                endereco = new Endereco(idEndereco, cep,logradouro,numero,complemento,referencia);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo endereco "+ e.getMessage());
            e.printStackTrace();
        }
        return endereco;
    }

    public List<Endereco> exibirEnderecos(){
        List<Endereco> enderecos = new ArrayList<Endereco>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_endereco");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idEndereco = rs.getInt(1);
                String cep = rs.getString(2);
                String logradouro = rs.getString(3);
                int numero = rs.getInt(4);
                String complemento = rs.getString(5);
                String referencia = rs.getString(6);

                enderecos.add(new Endereco(idEndereco,cep, logradouro,numero,complemento,referencia));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de endereços " + e.getMessage());
            e.printStackTrace();
        }
        return enderecos;
    }


}

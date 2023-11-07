package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Endereco;
import br.com.rakja.model.vo.Prestador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrestadorDAO {
    private Connection connection;

    public PrestadorDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirPrestador (Prestador prestador){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_prestador"
            +"(nome_completo, cpf, rg, id_endereco)"
            +"VALUES(?, ?, ?, ?)");
            ps.setString(1,prestador.getNomeCompleto());
            ps.setString(2,prestador.getCpf());
            ps.setString(3, prestador.getRg());
            ps.setInt(4,prestador.getIdEndereco().getIdEndereco());
            ps.execute();
            System.out.println("Prestador cadastrado com sucesso! ");
        }catch (SQLException e ){
            System.err.println("Erro ao cadastrar o prestador "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public void atualizarPrestador(Prestador prestador){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_prestador"
            + " SET nome_completo = ?, cpf = ?, rg = ?, id_endereco = ?"
            +"WHERE id_prestador = ?");
            ps.setString(1,prestador.getNomeCompleto());
            ps.setString(2,prestador.getCpf());
            ps.setString(3, prestador.getRg());
            ps.setInt(4,prestador.getIdEndereco().getIdEndereco());
            ps.setInt(5,prestador.getIdPrestador());
            ps.execute();
            System.out.println("Prestador alterado com sucesso!");
        }catch (SQLException e){
            System.err.println("Não foi possivel cadastrar o prestador "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public void deletarPrestador(int id){
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_prestador"
            + " WHERE id_prestador = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Prestador deletado com sucesso!");
        }catch (SQLException e){
            System.err.println("Não foi possivel deletar o prestador "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Prestador listarPorId( int id){
        Prestador prestador = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_prestador"
                    + " WHERE id_prestador = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idPrestador = rs.getInt(1);
                String nome= rs.getString(2);
                String cpf = rs.getString(3);
                String rg = rs.getString(4);
                Endereco idEndereco = (Endereco) rs.getObject(5);

                prestador = new Prestador(idPrestador,nome,cpf,rg,idEndereco);

        }

        }catch (SQLException e ){
            System.err.println("Erro ao buscar pelo prestador" + e.getMessage());
            e.printStackTrace();
        }
        return prestador;


    }

    public List<Prestador> exibirPrestadores(){
        List<Prestador> prestador = new ArrayList<Prestador>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_prestador");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idPrestador = rs.getInt(1);
                String nome = rs.getString(2);
                String cpf = rs.getString(3);
                String rg = rs.getString(4);
                Endereco idEndereco = (Endereco) rs.getObject(5);

                prestador.add(new Prestador(idPrestador,cpf,nome,rg,idEndereco));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de prestador " + e.getMessage());
            e.printStackTrace();
        }
        return prestador;
    }






























}



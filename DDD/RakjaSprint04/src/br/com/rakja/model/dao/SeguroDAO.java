package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Cliente;
import br.com.rakja.model.vo.Endereco;
import br.com.rakja.model.vo.Seguro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SeguroDAO {
    private Connection connection;

    public SeguroDAO(Connection connection){
        this.connection = connection;
    }

    public void inserirSeguro(Seguro seguro){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_seguro"
                    + "( numero_apolice, id_cliente)"
                    +"VALUES(?,?) ");
            ps.setString(1,seguro.getNumero_apolice());
            ps.setInt(2,seguro.getId_cliente().getIdCliente());
            ps.execute();
            System.out.println("Seguro cadastrado com sucesso!");
        }catch (SQLException e){
            System.err.println("Erro ao inserir o Seguro : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void atualizarSeguro(Seguro seguro){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_seguro"
                    +"SET numero_apolice = ?, id_cliente = ?"
                    + "WHERE numero_apolice = ?");
            ps.setString(1,seguro.getNumero_apolice());
            ps.setInt(2,seguro.getId_cliente().getIdCliente());
            ps.setString(3,seguro.getNumero_apolice());
            ps.execute();
            System.out.println("Seguro alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o Seguro "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarSeguro(String apolice){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_seguro"
                    +" WHERE numero_apolice = ?");
            ps.setString(1,apolice);
            ps.execute();
            System.out.println("Seguro removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar o Seguro "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Seguro listarPorApolice(String apolice){
        Seguro seguro = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_seguro"
                    + " WHERE numero_apolice = ?");
            ps.setString(1,apolice);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String numApolice = rs.getString(1);
                Cliente idCliente =(Cliente)rs.getObject(2);
                seguro = new Seguro(numApolice,idCliente);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo Seguro "+ e.getMessage());
            e.printStackTrace();
        }
        return seguro;
    }

    public List<Seguro> exibirSeguros(){
        List<Seguro> seguros = new ArrayList<Seguro>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_seguro");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String numApolice = rs.getString(1);
                Cliente idCliente =(Cliente) rs.getObject(2);
                seguros.add(new Seguro(numApolice,idCliente));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de seguros " + e.getMessage());
            e.printStackTrace();
        }
        return seguros;
    }




}

package br.com.rakja.model.dao;

import br.com.rakja.model.vo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeiculoClienteDAO {
    private Connection connection;

    public VeiculoClienteDAO(Connection connection){
        this.connection = connection;
    }


    public void inserirVeiculo(VeiculoCliente veiculoCliente){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_veiculo_cliente"
                    + "( placa, ano, portas, renavam, numero_apolice,id_fabricante, id_implemento,id_cliente)"
                    +"VALUES(?,?,?,?,?,?,?) ");
            ps.setString(1,veiculoCliente.getPlaca());
            ps.setInt(2,veiculoCliente.getAno());
            ps.setInt(3,veiculoCliente.getPortas());
            ps.setLong(4,veiculoCliente.getRenavam());
            ps.setString(5,veiculoCliente.getApolice().getNumero_apolice());
            ps.setInt(6,veiculoCliente.getFabricante().getId_fabricante());
            ps.setInt(7,veiculoCliente.getImplemento().getIdImplemento());
            ps.setInt(8,veiculoCliente.getCliente().getIdCliente());
            ps.execute();
            System.out.println("Veiculo cadastrado com sucesso!");
        }catch (SQLException e){
            System.err.println("Erro ao inserir o Veiculo : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void atualizarVeiculo(VeiculoCliente veiculoCliente){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_veiculo_cliente"
                    +"SET placa = ?, ano = ?,portas = ?,renavam = ?, numero_apolice = ?"
                    +",id_fabricante = ?, id_implemento = ?, id_cliente = ?"
                    + "WHERE id_cliente = ?");
            ps.setString(1,veiculoCliente.getPlaca());
            ps.setInt(2,veiculoCliente.getAno());
            ps.setInt(3,veiculoCliente.getPortas());
            ps.setLong(4,veiculoCliente.getRenavam());
            ps.setString(5,veiculoCliente.getApolice().getNumero_apolice());
            ps.setInt(6,veiculoCliente.getFabricante().getId_fabricante());
            ps.setInt(7,veiculoCliente.getImplemento().getIdImplemento());
            ps.setInt(8,veiculoCliente.getCliente().getIdCliente());
            ps.execute();
            System.out.println("Veiculo alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o Veiculo "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarVeiculo(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_veiculo_cliente"
                    +" WHERE id_veiculo = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Veiculo removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar o Veiculo "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public VeiculoCliente listarPorId(int id){
        VeiculoCliente veiculoCliente = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_veiculo_cliente"
                    + " WHERE id_veiculo = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idVeiculo = rs.getInt(1);
                String placa = rs.getString(2);
                int ano = rs.getInt(3);
                int portas = rs.getInt(4);
                long renavam = rs.getLong(5);
                Seguro apolice = (Seguro) rs.getObject(6);
                Fabricante fabricante = (Fabricante) rs.getObject(7);
                Implemento implemento = (Implemento) rs.getObject(8);
                Cliente cliente = (Cliente) rs.getObject(9);

                veiculoCliente = new VeiculoCliente(idVeiculo,placa,ano,portas,renavam,apolice,fabricante,implemento,cliente);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo Veiculo "+ e.getMessage());
            e.printStackTrace();
        }
        return veiculoCliente;
    }

    public List<VeiculoCliente> exibirVeiculos(){
        List<VeiculoCliente> veiculoClientes = new ArrayList<VeiculoCliente>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_veiculo_cliente");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idVeiculo = rs.getInt(1);
                String placa = rs.getString(2);
                int ano = rs.getInt(3);
                int portas = rs.getInt(4);
                long renavam = rs.getLong(5);
                Seguro apolice = (Seguro) rs.getObject(6);
                Fabricante fabricante = (Fabricante) rs.getObject(7);
                Implemento implemento = (Implemento) rs.getObject(8);
                Cliente cliente = (Cliente) rs.getObject(9);

                veiculoClientes.add(new VeiculoCliente(idVeiculo,placa,ano,portas,renavam,apolice,fabricante,implemento,cliente));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de veiculos " + e.getMessage());
            e.printStackTrace();
        }
        return veiculoClientes;
    }
}

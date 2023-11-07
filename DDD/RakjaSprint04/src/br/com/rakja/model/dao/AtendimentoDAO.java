package br.com.rakja.model.dao;

import br.com.rakja.model.vo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoDAO {

    private Connection connection;

    public AtendimentoDAO(Connection connection){
        this.connection = connection;
    }


    public void inserirAtendimento(Atendimento atendimento){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_atendimento"
                    + "( data, pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)"
                    +"VALUES(?,?,?,?,?,?) ");
            ps.setString(1,atendimento.getData());
            ps.setFloat(2,atendimento.getPbtc());
            ps.setInt(3,atendimento.getIdLocalizacao().getIdLocalizacao());
            ps.setInt(4,atendimento.getIdCliente().getIdCliente());
            ps.setInt(5, atendimento.getIdVeiculo().getIdVeiculo());
            ps.setInt(6,atendimento.getIdModal().getIdModal());
            ps.execute();
            System.out.println("Atendimento cadastrado com sucesso!");
        }catch (SQLException e){
            System.err.println("Erro ao inserir o Atendimento : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void atualizarAtendimento(Atendimento atendimento){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_atendimento"
                    +"SET data = ?, pbtc = ?, id_localizacao = ?, id_cliente = ?, id_veiculo = ?, id_modal = ?"
                    + "WHERE id_atendimento = ?");
            ps.setString(1,atendimento.getData());
            ps.setFloat(2,atendimento.getPbtc());
            ps.setInt(3,atendimento.getIdLocalizacao().getIdLocalizacao());
            ps.setInt(4,atendimento.getIdCliente().getIdCliente());
            ps.setInt(5, atendimento.getIdVeiculo().getIdVeiculo());
            ps.setInt(6,atendimento.getIdModal().getIdModal());
            ps.setInt(7,atendimento.getIdAtendimento());
            ps.execute();
            System.out.println("Atendimento alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o Atendimento "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarAtendimento(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_atendimento"
                    +" WHERE id_atendimento = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Atendimento removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar o atendimento "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Atendimento listarPorId(int id){
        Atendimento atendimento = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_atendimento"
                    + " WHERE id_atendimento = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idAtendimento = rs.getInt(1);
                String data = rs.getString(2);
                float pbtc = rs.getFloat(3);
                Localizacao idLocalizacao = (Localizacao) rs.getObject(4);
                Cliente idCliente = (Cliente) rs.getObject(5);
                VeiculoCliente idVeiculo = (VeiculoCliente) rs.getObject(6);
                Modal idModal = (Modal) rs.getObject(7);

                atendimento = new Atendimento(idAtendimento,data,pbtc,idLocalizacao,idCliente,idVeiculo,idModal);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo atendimento "+ e.getMessage());
            e.printStackTrace();
        }
        return atendimento;
    }

    public List<Atendimento> exibirAtendimentos(){
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_atendimento");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idAtendimento = rs.getInt(1);
                String data = rs.getString(2);
                float pbtc = rs.getFloat(3);
                Localizacao idLocalizacao = (Localizacao) rs.getObject(4);
                Cliente idCliente = (Cliente) rs.getObject(5);
                VeiculoCliente idVeiculo = (VeiculoCliente) rs.getObject(6);
                Modal idModal = (Modal) rs.getObject(7);
                atendimentos.add(new Atendimento(idAtendimento,data,pbtc,idLocalizacao,idCliente,idVeiculo,idModal));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de Atendimentos " + e.getMessage());
            e.printStackTrace();
        }
        return atendimentos;
    }
}

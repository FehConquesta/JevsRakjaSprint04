package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Fabricante;
import br.com.rakja.model.vo.Modal;
import br.com.rakja.model.vo.Prestador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModalDAO {
    private Connection connection;

    public ModalDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirModal (Modal modal){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_modal"
                    +"(modelo, placa, disponibilidade, id_prestador)"
                    +"VALUES(?, ?, ?, ?)");
            ps.setString(1,modal.getModelo());
            ps.setString(2,modal.getPlaca());
            ps.setBoolean(3,modal.isDisponibilidade());
            ps.setInt(4,modal.getIdPrestador().getIdPrestador());
            ps.execute();
            System.out.println("Modal cadastrado com sucesso! ");
        }catch (SQLException e ){
            System.err.println("Erro ao cadastrar o Modal "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void atualizarModal(Modal modal){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_modal"
                    +"SET modelo = ?, placa = ?, disponibilidade = ?, id_prestador = ?"
                    + "WHERE id_modal = ?");
            ps.setString(1,modal.getModelo());
            ps.setString(2,modal.getPlaca());
            ps.setBoolean(3,modal.isDisponibilidade());
            ps.setInt(4,modal.getIdPrestador().getIdPrestador());
            ps.setInt(5,modal.getIdModal());
            ps.execute();
            System.out.println("Modal alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o modal "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarModal(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_modal"
                    +" WHERE id_modal = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Modal removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar o Modal "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Modal listarPorId(int id){
        Modal modal = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_modal"
                    + " WHERE id_modal = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idModal = rs.getInt(1);
                String modelo = rs.getString(2);
                String placa = rs.getString(3);
                boolean disponibilidade = rs.getBoolean(4);
                Prestador idPrestador =(Prestador)rs.getObject(5);

                modal = new Modal(idModal, modelo, placa, disponibilidade, idPrestador);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo modal "+ e.getMessage());
            e.printStackTrace();
        }
        return modal;
    }

    public List<Modal> exibirModais(){
        List<Modal> modals = new ArrayList<Modal>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_modal");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idModal = rs.getInt(1);
                String modelo = rs.getString(2);
                String placa = rs.getString(3);
                boolean disponibilidade = rs.getBoolean(4);
                Prestador idPrestador =(Prestador)rs.getObject(5);

                modals.add(new Modal(idModal,modelo, placa, disponibilidade,idPrestador));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de Modais " + e.getMessage());
            e.printStackTrace();
        }
        return modals;
    }
}

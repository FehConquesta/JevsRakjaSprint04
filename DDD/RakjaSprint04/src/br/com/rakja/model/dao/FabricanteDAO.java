package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Endereco;
import br.com.rakja.model.vo.Fabricante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FabricanteDAO {

    private Connection connection;

    public FabricanteDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirFabricante (Fabricante fabricante){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_fabricante"
                    +"(nome, modelo"
                    +"VALUES(?, ?)");
            ps.setString(1,fabricante.getNome());
            ps.setString(2,fabricante.getModelo());
            ps.execute();
            System.out.println("Fabricante cadastrado com sucesso! ");
        }catch (SQLException e ){
            System.err.println("Erro ao cadastrar o fabricante "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void atualizarFabricante(Fabricante fabricante){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_fabricante"
                    +"SET nome = ?, modelo = ?"
                    + "WHERE id_fabricante = ?");
            ps.setString(1,fabricante.getNome());
            ps.setString(2,fabricante.getModelo());
            ps.setInt(3,fabricante.getId_fabricante());
            ps.execute();
            System.out.println("Fabricante alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o fabricante "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarFabricante(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_fabricante"
                    +" WHERE id_fabricante = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Fabricante removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar o Fabricante "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Fabricante listarPorId(int id){
        Fabricante fabricante = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_fabricante"
                    + " WHERE id_fabricante = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idFabricante = rs.getInt(1);
                String nome = rs.getString(2);
                String modelo = rs.getString(3);

                fabricante = new Fabricante(idFabricante,nome,modelo);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo fabricante "+ e.getMessage());
            e.printStackTrace();
        }
        return fabricante;
    }

    public List<Fabricante> exibirFabricante(){
        List<Fabricante> fabricantes = new ArrayList<Fabricante>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_fabricante");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idFabricante = rs.getInt(1);
                String nome = rs.getString(2);
                String modelo = rs.getString(3);

                fabricantes.add(new Fabricante(idFabricante,nome,modelo));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de fabricante " + e.getMessage());
            e.printStackTrace();
        }
        return fabricantes;
    }


}






package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Implemento;
import br.com.rakja.model.vo.Localizacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplementoDAO {
    private Connection connection;

    public ImplementoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirImplemento (Implemento implemento){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_implemento"
                    +"(tipo_implemento)"
                    +"VALUES(?)");
            ps.setString(1,implemento.getTipoImplemento());
            ps.execute();
            System.out.println("Implemento cadastrado com sucesso! ");
        }catch (SQLException e ){
            System.err.println("Erro ao cadastrar o Implemento "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void atualizarImplemento(Implemento implemento){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_implemento"
                    +"SET tipo_implemento = ?"
                    + "WHERE id_implemento = ?");
            ps.setString(1,implemento.getTipoImplemento());
            ps.setInt(2,implemento.getIdImplemento());
            ps.execute();
            System.out.println("Implemento alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o Implemento "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarImplemento(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_implemento"
                    +" WHERE id_implemento = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Implemento removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar a Implemento "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Implemento listarPorId(int id){
        Implemento implemento = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_implemento"
                    + " WHERE id_implemento = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idImplemento = rs.getInt(1);
                String tipoImplemento = rs.getString(2);

                implemento = new Implemento(idImplemento,tipoImplemento);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pelo implemento "+ e.getMessage());
            e.printStackTrace();
        }
        return implemento;
    }

    public List<Implemento> exibirImplementos(){
        List<Implemento> implementos = new ArrayList<Implemento>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_implemento");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idImplemento = rs.getInt(1);
                String tipoImplemento = rs.getString(2);

                implementos.add(new Implemento(idImplemento,tipoImplemento));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de Implementos " + e.getMessage());
            e.printStackTrace();
        }
        return implementos;
    }

}

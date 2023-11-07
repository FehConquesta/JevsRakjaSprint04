package br.com.rakja.model.dao;

import br.com.rakja.model.vo.Localizacao;
import br.com.rakja.model.vo.Modal;
import br.com.rakja.model.vo.Prestador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocalizacaoDAO {

    private Connection connection;

    public LocalizacaoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirLocalizacao (Localizacao localizacao){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tb_jr_localizacao"
                    +"(nome_rodovia, km, cep, referencia)"
                    +"VALUES(?, ?, ?, ?)");
            ps.setString(1,localizacao.getNomeRodovia());
            ps.setInt(2,localizacao.getKm());
            ps.setString(3,localizacao.getCep());
            ps.setString(4,localizacao.getReferencia());
            ps.execute();
            System.out.println("Localizacao cadastrado com sucesso! ");
        }catch (SQLException e ){
            System.err.println("Erro ao cadastrar a localizacao "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void atualizarLocalizacao(Localizacao localizacao){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE tb_jr_localizacao"
                    +"SET nome_rodovia = ?, km = ?, cep = ?, referencia = ?"
                    + "WHERE id_modal = ?");
            ps.setString(1,localizacao.getNomeRodovia());
            ps.setInt(2,localizacao.getKm());
            ps.setString(3,localizacao.getCep());
            ps.setString(4,localizacao.getReferencia());
            ps.setInt(5,localizacao.getIdLocalizacao());
            ps.execute();
            System.out.println("Localizacao alterado com sucesso !");
        }catch (SQLException e) {
            System.err.println("Não foi possivel alterar o localizao "+ e.getMessage());
            e.printStackTrace();
        }
    }
    public void deletarLocalizacao(int id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM tb_jr_localizacao"
                    +" WHERE id_localizacao = ?");
            ps.setInt(1,id);
            ps.execute();
            System.out.println("Localizacao removido com sucesso!");
        }catch (SQLException e ){
            System.err.println("Não foi possivel apagar a Localizacao "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public Localizacao listarPorId(int id){
        Localizacao localizacao = null;
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_localizacao"
                    + " WHERE id_localizacao = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idlocalizacao = rs.getInt(1);
                String nomeRodovia = rs.getString(2);
                int km = rs.getInt(3);
                String cep = rs.getString(4);
                String referencia = rs.getString(5);


                localizacao = new Localizacao(idlocalizacao,nomeRodovia,km,cep,referencia);

            }

        }catch (SQLException e){
            System.err.println("Erro ao buscar pela localizacao "+ e.getMessage());
            e.printStackTrace();
        }
        return localizacao;
    }

    public List<Localizacao> exibirLocalizacoes(){
        List<Localizacao> localizacoes = new ArrayList<Localizacao>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM tb_jr_localizacao");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idlocalizacao = rs.getInt(1);
                String nomeRodovia = rs.getString(2);
                int km = rs.getInt(3);
                String cep = rs.getString(4);
                String referencia = rs.getString(5);

                localizacoes.add(new Localizacao(idlocalizacao,nomeRodovia,km,cep,referencia));
            }
            System.out.println("Lista Criada!");
        }catch (SQLException e){
            System.err.println("Não foi possivel criar a lista de Localizacoes " + e.getMessage());
            e.printStackTrace();
        }
        return localizacoes;
    }

}

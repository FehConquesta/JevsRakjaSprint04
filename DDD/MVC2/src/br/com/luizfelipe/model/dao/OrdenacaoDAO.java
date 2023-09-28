package br.com.luizfelipe.model.dao;

import br.com.luizfelipe.model.vo.Ordenacao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OrdenacaoDAO {
    public void salvar(Ordenacao ordenacao) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("ordenacao.txt");
        pw.print(ordenacao);
        pw.flush(); //limpar o buffer
        pw.close(); //fecha o arquivo
    }

}

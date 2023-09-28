package br.com.luizfelipe.model.dao;

import br.com.luizfelipe.model.vo.Passos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class PassosDAO {
    /**
     * Método que recebe os passos (lista), percorre os elementos
     * dessa lista e salva-os em um arquivo.
     * @author Luiz Felipe
     * @since 01/2023
     * @param passos
     * @throws FileNotFoundException
     */
    public void salvarPassos(List<Passos> passos) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("passos.txt");

        for(Passos p : passos) {
            pw.print(p);
        }
        pw.flush();
        pw.close();
    }
}

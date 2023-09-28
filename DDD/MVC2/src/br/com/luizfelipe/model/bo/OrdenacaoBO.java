package br.com.luizfelipe.model.bo;

import br.com.luizfelipe.model.dao.OrdenacaoDAO;
import br.com.luizfelipe.model.dao.PassosDAO;
import br.com.luizfelipe.model.vo.Ordenacao;
import br.com.luizfelipe.model.vo.Passos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luiz Felipe
 * @since 27/09
 *
 *
 *
 */

public class OrdenacaoBO {


    public Ordenacao bubbleSort(int numero) throws FileNotFoundException {

        char[] digitos = String.valueOf(numero).toCharArray();

        /**
         * variavel aux para armazenar o numero antes de realizar a troca
         *
         */
        char aux;
        char[] antes;

        int qtdeTrocas = 0;

        List<Passos> passos = new ArrayList<Passos>();

        boolean continua = true;

        for (int i=0; i<digitos.length;i++){

            if(!continua){
                break;
            }
            passos.add(new Passos(null,null,"Inicio da verificação do numero"
                    .concat(String.valueOf(i))
                    .concat("\n========================\n")));

            continua = false;
            for(int j=0;j<digitos.length-1;j++){
                if(digitos[j] > digitos[j+1]){
                    //antes = String.valueOf(digitos);
                    antes = new String(digitos).toCharArray();
                    aux = digitos[j];
                    digitos[j]=digitos[j+1];
                    digitos[j+1] = aux;

                    qtdeTrocas ++;

                    passos.add(new Passos(new String(antes),new String(digitos),"Trocou o digito"
                            .concat(String.valueOf(digitos[j+1]))
                            .concat(" pelo".concat(String.valueOf(digitos[j])))));

                    continua = true;
                }
                else{
                    passos.add(new Passos(new String(digitos),new String(digitos),"Não houve troca pois o numero "
                            .concat(String.valueOf(digitos[j+1]))
                            .concat(" é menor ou igual que ")
                            .concat(String.valueOf(digitos[j]))));
                }

            }

        }
        // persiste os resultados no arquivo
        Ordenacao ordenacao = new Ordenacao(numero, new String(digitos), qtdeTrocas);
        new OrdenacaoDAO().salvar(ordenacao);
        new PassosDAO().salvarPassos(passos);

        return ordenacao;





    }
}

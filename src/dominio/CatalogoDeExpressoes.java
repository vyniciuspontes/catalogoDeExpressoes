/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;
import servicostecnicos.CatalogoDAO;

/**
 *
 * @author marcussouza
 */
public class CatalogoDeExpressoes {

    private List<Expressao> listaDeExpressoes;

    public CatalogoDeExpressoes() {
        initCatalogo();
    }

    private void initCatalogo() {
        List<String> textos = CatalogoDAO.getInstance().lerCatalogo();
        listaDeExpressoes = new ArrayList<>();
        textos.forEach((texto) -> {
            listaDeExpressoes.add(new Expressao(texto));
        });
    }

    public boolean adicionarExpressao(Expressao expressao) {

        if (contemExpressao(expressao)) {
            return false;
        }

        this.listaDeExpressoes.add(expressao);

        salvarCatalogo();
        return true;
    }

    public Boolean alterarExpressao(Expressao exp, Expressao novaExpressao) {

        if (contemExpressao(novaExpressao)) {
            return false;
        }

        Expressao found = listaDeExpressoes.stream()
                .filter(x -> exp.equals(x))
                .findAny()
                .orElse(null);

        if (found == null) {
            return null;
        }

        found.setTexto(novaExpressao.getTexto());

        salvarCatalogo();

        return true;
    }

    public boolean removerExpressao(Expressao expressao) {

        if (!contemExpressao(expressao)) {
            return false;
        }

        this.listaDeExpressoes.remove(expressao);
        salvarCatalogo();

        return true;
    }

    public List<Expressao> listarPorLetraInicial(char letra) {
        List<Expressao> arrayFinal = new ArrayList<>();
        /*for(Expressao exp: setDeExpressoes){
           if(exp.getExpressao().charAt(0) == letra){
               arrayFinal.add(exp);
           }
       }*/

        return arrayFinal;
    }

    public List<Expressao> listarExpressoes() {
        return this.listaDeExpressoes;
    }

    public List<Expressao> listarPorPalavra(String palavra) {
        List<Expressao> arrayFinal = new ArrayList<>();
        /*for(Expressao exp: setDeExpressoes){
           if(exp.getExpressao().contains(palavra)){
               arrayFinal.add(exp);
           }
       }*/

        return arrayFinal;
    }

    public List<Expressao> listarPorNumeroPalavras(int numero) {
        List<Expressao> arrayFinal = new ArrayList<>();
        /*for(Expressao exp: setDeExpressoes){
           if(exp.getExpressao().split(" ").length == numero){
               arrayFinal.add(exp);
           }
       }*/

        return arrayFinal;
    }

    public boolean contemExpressao(Expressao expressao) {
        return listaDeExpressoes.contains(expressao);
    }

    private boolean salvarCatalogo() {
        List<String> textos = new ArrayList<>();

        listaDeExpressoes.forEach((expressao) -> {
            textos.add(expressao.getTexto());
        });

        return CatalogoDAO.getInstance().salvarCatalogo(textos);

    }
}

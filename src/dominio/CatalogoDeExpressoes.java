/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
            listaDeExpressoes.add(new Expressao(texto.toLowerCase()));
        });
    }

    public boolean adicionarExpressao(String texto) {

        Expressao exp = recuperarExpressao(texto);
        
        if (exp == null) {
            return false;
        }

        this.listaDeExpressoes.add(exp);

        salvarCatalogo();
        return true;
    }

    public Boolean alterarExpressao(String textoAntigo, String novaTexto) {

        Expressao exp = recuperarExpressao(textoAntigo);
        Expressao novaExpressao = new Expressao(novaTexto);
        if (exp == null) {
            return false;
        }

        exp.setTexto(novaExpressao.getTexto());

        salvarCatalogo();

        return true;
    }

    public boolean removerExpressao(String expressao) {
        Expressao exp = recuperarExpressao(expressao);
        if (exp == null) {
            return false;
        }

        this.listaDeExpressoes.remove(exp);
        salvarCatalogo();

        return true;
    }

    public List<String> listarPorLetraInicial(char letra) {
        List<String> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().charAt(0) == letra).map(t -> t.getTexto())
                .collect(Collectors.toList());

        return result;
    }

    public List<String> listarExpressoes() {
        return this.listaDeExpressoes.stream().map(t -> t.getTexto())
                .collect(Collectors.toList());
    }

    public List<String> listarPorFraseLivre(String frase) {
        List<String> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().contains(frase)).map(t -> t.getTexto())
                .collect(Collectors.toList());

        return result;
    }

    public List<String> listarPorNumeroPalavras(int numero) {
        List<String> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().trim().split(" ").length == numero).map(t -> t.getTexto())
                .collect(Collectors.toList());

        return result;
    }

    public List<String> listarPorFraseExata(String frase) {
        List<String> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().equals(frase)).map(t -> t.getTexto())
                .collect(Collectors.toList());

        return result;
    }

    public List<String> listarPorPalavra(String palavra) {

        List<String> result = listaDeExpressoes.stream()
                .filter(expressao -> checkExpressaoContemPalavra(expressao, palavra)).map(t -> t.getTexto())
                .collect(Collectors.toList());

        return result;
    }

    private boolean checkExpressaoContemPalavra(Expressao expressao, String palavra) {

        String[] expressaoSplit = expressao.getTexto().split(" ");
        List<String> expressaoSplitList = Arrays.asList(expressaoSplit);

        return expressaoSplitList.contains(palavra);
    }
    
    public Expressao recuperarExpressao(String texto){
        return this.listaDeExpressoes.stream().filter(p -> p.getTexto().equals(texto)).findAny().orElse(null);
    }

    private boolean salvarCatalogo() {
        List<String> textos = new ArrayList<>();

        listaDeExpressoes.forEach((expressao) -> {
            textos.add(expressao.getTexto().toLowerCase());
        });

        return CatalogoDAO.getInstance().salvarCatalogo(textos);

    }
}

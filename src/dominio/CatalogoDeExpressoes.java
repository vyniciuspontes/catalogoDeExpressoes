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
import servicostecnicos.dao.CatalogoDAO;

/**
 *
 * @author marcussouza
 */
public class CatalogoDeExpressoes {

    private List<Expressao> listaDeExpressoes;
    private final CatalogoDAO catalogoDAO;

    public CatalogoDeExpressoes() {
        this.catalogoDAO = CatalogoDAO.getInstance();
        initCatalogo();
    }

    private void initCatalogo() {
        List<String> textos = catalogoDAO.lerCatalogo();
        listaDeExpressoes = new ArrayList<>();
        textos.forEach((texto) -> {
            listaDeExpressoes.add(new Expressao(texto.toLowerCase()));
        });
    }

    public boolean adicionarExpressao(String texto) {

        Expressao exp = recuperarExpressaoPorTexto(texto);

        if (exp != null) {
            return false;
        }

        this.listaDeExpressoes.add(new Expressao(texto));

        salvarCatalogo();
        return true;
    }

    public Boolean alterarExpressao(Expressao expressaoAtual, String novoTexto) {

        Expressao exp = recuperarExpressaoPorTexto(novoTexto);
        
        if (exp != null) {
            return false;
        }
        
        exp = recuperarExpressaoNaLista(expressaoAtual);

        exp.setTexto(novoTexto);

        salvarCatalogo();

        return true;
    }

    public boolean removerExpressao(Expressao expressao) {
        if (expressao == null) {
            return false;
        }

        this.listaDeExpressoes.remove(expressao);
        salvarCatalogo();

        return true;
    }

    public List<Expressao> listarPorLetraInicial(char letra) {
        List<Expressao> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().charAt(0) == letra)
                .collect(Collectors.toList());

        return result;
    }

    public List<Expressao> listarExpressoes() {
        return this.listaDeExpressoes;
    }

    public List<Expressao> listarPorFraseLivre(String frase) {
        List<Expressao> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().contains(frase))
                .collect(Collectors.toList());

        return result;
    }

    public List<Expressao> listarPorNumeroPalavras(int numero) {
        List<Expressao> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().trim().split(" ").length == numero)
                .collect(Collectors.toList());

        return result;
    }

    public List<Expressao> listarPorFraseExata(String frase) {
        List<Expressao> result = listaDeExpressoes.stream()
                .filter(expressao -> expressao.getTexto().equals(frase))
                .collect(Collectors.toList());

        return result;
    }

    public List<Expressao> listarPorPalavra(String palavra) {

        List<Expressao> result = listaDeExpressoes.stream()
                .filter(expressao -> checkExpressaoContemPalavra(expressao, palavra))
                .collect(Collectors.toList());

        return result;
    }

    private boolean checkExpressaoContemPalavra(Expressao expressao, String palavra) {

        String[] expressaoSplit = expressao.getTexto().split(" ");
        List<String> expressaoSplitList = Arrays.asList(expressaoSplit);

        return expressaoSplitList.contains(palavra);
    }

    private Expressao recuperarExpressaoPorTexto(String texto) {
        return this.listaDeExpressoes.stream().filter(p -> p.getTexto().equals(texto)).findAny().orElse(null);
    }
    
    private Expressao recuperarExpressaoNaLista(Expressao expressao) {
        return this.listaDeExpressoes.stream().filter(p -> p.equals(expressao)).findAny().orElse(null);
    }

    private boolean salvarCatalogo() {
        List<String> textos = new ArrayList<>();

        listaDeExpressoes.forEach((expressao) -> {
            textos.add(expressao.getTexto().toLowerCase());
        });

        return catalogoDAO.salvarCatalogo(textos);

    }
}

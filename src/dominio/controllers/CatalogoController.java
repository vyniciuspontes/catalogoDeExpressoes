/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.controllers;

import dominio.CatalogoDeExpressoes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author marcussouza
 */
public class CatalogoController {

    private CatalogoDeExpressoes catalogo;

    private CatalogoController() {
        this.catalogo = new CatalogoDeExpressoes();
    }

    private static CatalogoController instance;

    static public CatalogoController getInstance() {

        if (instance == null) {
            return new CatalogoController();
        } else {
            return instance;
        }
    }

    public boolean containsExpression(String exp) throws IOException, FileNotFoundException {
        //return new CatalogoDeExpressao().containsExpressao(exp);
        return false;
    }
    
    public List<String> listarExpressoes(){
        return this.catalogo.listarExpressoes();
    }

    public boolean adicionarExpressao(String exp) {
        return this.catalogo.adicionarExpressao(exp);
    }

    public boolean alterarExpressao(String anterior, String novoTexto) {
        return this.catalogo.alterarExpressao(anterior, novoTexto);
    }
    
    public List<String> listarPorLetraInicial(char letra) {
        
        return this.catalogo.listarPorLetraInicial(letra);
    }

    public List<String> listarPorPalavra(String palavra) {
        return this.catalogo.listarPorPalavra(palavra);
    }

    public List<String> listarPorNumeroPalavras(int numero) {
        return this.catalogo.listarPorNumeroPalavras(numero);
    }
    
    public boolean removerExpressao(String expressao){
        return this.catalogo.removerExpressao(expressao);
    }

    public List<String> listarPorFraseExata(String frase) {
        return this.catalogo.listarPorFraseExata(frase);
    }

    public List<String> listarPorFraseLivre(String frase) {
        return this.catalogo.listarPorFraseLivre(frase);
    }

}

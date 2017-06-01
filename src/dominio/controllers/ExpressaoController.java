/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.controllers;

import dominio.catalogos.CatalogoDeExpressoes;
import dominio.modelos.Expressao;
import java.util.List;

/**
 *
 * @author marcussouza
 */
public class ExpressaoController {

    private CatalogoDeExpressoes catalogo;

    private ExpressaoController() {
        this.catalogo = new CatalogoDeExpressoes();
    }

    private static ExpressaoController instance;

    static public ExpressaoController getInstance() {

        if (instance == null) {
            return new ExpressaoController();
        } else {
            return instance;
        }
    }
    
    public List<Expressao> listarExpressoes(){
        return this.catalogo.listarExpressoes();
    }

    public boolean adicionarExpressao(String exp) {
        return this.catalogo.adicionarExpressao(exp.trim().toLowerCase());
    }

    public boolean alterarExpressao(Expressao expressaoAtual, String novoTexto) {
        return this.catalogo.alterarExpressao(expressaoAtual, novoTexto.trim().toLowerCase());
    }
    
    public List<Expressao> listarPorLetraInicial(String letra) {
        
        return this.catalogo.listarPorLetraInicial(letra.trim().toLowerCase().charAt(0));
    }

    public List<Expressao> listarPorPalavra(String palavra) {
        return this.catalogo.listarPorPalavra(palavra.trim().toLowerCase());
    }

    public List<Expressao> listarPorNumeroPalavras(int numero) {
        return this.catalogo.listarPorNumeroPalavras(numero);
    }
    
    public boolean removerExpressao(Expressao expressao){
        return this.catalogo.removerExpressao(expressao);
    }

    public List<Expressao> listarPorFraseExata(String frase) {
        return this.catalogo.listarPorFraseExata(frase.trim().toLowerCase());
    }

    public List<Expressao> listarPorFraseLivre(String frase) {
        return this.catalogo.listarPorFraseLivre(frase.trim().toLowerCase());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.controllers;

import dominio.CatalogoDeExpressoes;
import dominio.Expressao;
import servicostecnicos.CatalogoDAO;
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
    
    public List<Expressao> listarExpressoes(){
        return this.catalogo.listarExpressoes();
    }

    public boolean adicionarExpressao(String exp) {
        Expressao novaExpressao = new Expressao(exp);
        return new CatalogoDeExpressoes().adicionarExpressao(novaExpressao);
    }

    public boolean alterarExpressao(Expressao anterior, String novoTexto) {
        Expressao novaExpressao = new Expressao(novoTexto);
        return new CatalogoDeExpressoes().alterarExpressao(anterior, novaExpressao);
    }

    public List<Expressao> listarPorLetraInicial(char letra) {
        return new CatalogoDeExpressoes().listarPorLetraInicial(letra);
    }

    public List<Expressao> listarPorPalavra(String palavra) {
        return new CatalogoDeExpressoes().listarPorPalavra(palavra);
    }

    public List<Expressao> listarPorNumeroPalavras(int numero) {
        return new CatalogoDeExpressoes().listarPorNumeroPalavras(numero);
    }
    
    public boolean removerExpressao(Expressao expressao){
        return this.catalogo.removerExpressao(expressao);
    }

}

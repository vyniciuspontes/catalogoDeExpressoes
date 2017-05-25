/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.controllers;

import dominio.CatalogoDeExpressao;
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

    private CatalogoController() {}

    private static CatalogoController instance;

    public CatalogoController getInstance() {

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

    public boolean addExpression(String exp) {
        return new CatalogoDeExpressao().adicionarExpressao(exp);
    }

    public boolean changeExpression(Expressao exp, String newExpression) {
        return new CatalogoDeExpressao().alterarExpressao(exp, newExpression);

    }

    public List<Expressao> listarPorLetraInicial(char letra) {
        return new CatalogoDeExpressao().listarPorLetraInicial(letra);
    }

    public List<Expressao> listarPorPalavra(String palavra) {
        return new CatalogoDeExpressao().listarPorPalavra(palavra);
    }

    public List<Expressao> listarPorNumeroPalavras(int numero) {
        return new CatalogoDeExpressao().listarPorNumeroPalavras(numero);
    }

    public void salvarCatalogo(CatalogoDeExpressao catalogo) {
        new CatalogoDAO().salvarCatalogo(catalogo);
    }

}

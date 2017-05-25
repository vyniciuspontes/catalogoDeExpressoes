/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author marcussouza
 */
public class Expressao implements Serializable{
    
    private String expressao;

    public Expressao(String expressao) {
        this.expressao = expressao;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    @Override
    public String toString() {
        return "Expressao { " + "expressao = " + expressao + " }";
    }
    
}

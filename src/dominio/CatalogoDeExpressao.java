/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author marcussouza
 */
public class CatalogoDeExpressao implements Serializable{
    
    private Set<Expressao> collectionExpressions;
    
    public CatalogoDeExpressao() {}
    
    public boolean adicionarExpressao(String expressao){
        /*Expressao exp = new CriadorDeExpressao().criarExpressao(expressao);
        if(collectionExpressions.contains(exp))
            return false;
        else {
            //collectionExpressions.add(exp);
            return true;
        }*/
        return false;
    } 
    
    public boolean alterarExpressao(Expressao exp, String novaExpressao){
        if(collectionExpressions.contains(exp)){
            //Expressao nova = new CriadorDeExpressao().criarExpressao(novaExpressao);
            collectionExpressions.remove(exp);
            //collectionExpressions.add(nova);
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Expressao> listarPorLetraInicial(char letra) {
       ArrayList<Expressao> arrayFinal = new ArrayList<>();
       for(Expressao exp: collectionExpressions){
           if(exp.getExpressao().charAt(0) == letra){
               arrayFinal.add(exp);
           }
       }
       
       return arrayFinal;
    }

    public ArrayList<Expressao> listarPorPalavra(String palavra) {
       ArrayList<Expressao> arrayFinal = new ArrayList<>();
       for(Expressao exp: collectionExpressions){
           if(exp.getExpressao().contains(palavra)){
               arrayFinal.add(exp);
           }
       }
       
       return arrayFinal;
    }

    public ArrayList<Expressao> listarPorNumeroPalavras(int numero) {
       ArrayList<Expressao> arrayFinal = new ArrayList<>();
       for(Expressao exp: collectionExpressions){
           if(exp.getExpressao().split(" ").length == numero){
               arrayFinal.add(exp);
           }
       }
       
       return arrayFinal;
    }

    public boolean containsExpressao(String exp) {
        return this.collectionExpressions.contains(exp);
    }
    
    
    
}

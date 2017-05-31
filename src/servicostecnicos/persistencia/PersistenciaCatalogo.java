/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicostecnicos.persistencia;

import java.util.List;

/**
 *
 * @author Vynicius
 */
public interface PersistenciaCatalogo {
    
    public List<String> lerCatalogo();
    public boolean salvarCatalogo (List<String> catalogo);
}

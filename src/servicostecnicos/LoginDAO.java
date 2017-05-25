/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicostecnicos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author marcussouza
 */
public class LoginDAO {

    private final Map<String, UsuarioDTO> mapUsers;

    private static LoginDAO instance;
    
    public static LoginDAO getInstance(){
        
        if(instance == null)
            return new LoginDAO();
        else
            return instance;
    }
    

    private LoginDAO() {
        mapUsers = new HashMap<>();
        UsuarioDTO a = new UsuarioDTO("Marcus Souza", "msouza", "123", true);
        UsuarioDTO b = new UsuarioDTO("Vynicius", "vyni", "123", true);
        UsuarioDTO c = new UsuarioDTO("Antonio Nery", "annery", "123", true);
        UsuarioDTO d = new UsuarioDTO("Otavio", "vmotavio", "123", true);
        UsuarioDTO e = new UsuarioDTO("Teresa", "teresa", "123", false);
        mapUsers.put(a.getLogin(), a);
        mapUsers.put(b.getLogin(), b);
        mapUsers.put(c.getLogin(), c);
        mapUsers.put(d.getLogin(), d);
        mapUsers.put(e.getLogin(), e);
    }

    public UsuarioDTO autenticar(String login, String senha) {
        
        UsuarioDTO usuario = this.mapUsers.get(login);
        
        if(usuario == null)
            return null;
        else if(!usuario.getPassword().equals(senha)){
            return null;
        }
            
        return usuario;
    }

}

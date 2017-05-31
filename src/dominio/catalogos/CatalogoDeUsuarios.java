/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.catalogos;

import dominio.Usuario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author marcussouza
 */
public class CatalogoDeUsuarios {

    private final Map<String, Usuario> mapUsers;

    private static CatalogoDeUsuarios instance;

    public static CatalogoDeUsuarios getInstance() {

        if (instance == null) {
            return new CatalogoDeUsuarios();
        } else {
            return instance;
        }
    }

    private CatalogoDeUsuarios() {
        mapUsers = new HashMap<>();
        Usuario a = new Usuario("Marcus Souza", "msouza", "123", true);
        Usuario b = new Usuario("Vynicius", "vyni", "123", true);
        Usuario c = new Usuario("Antonio Nery", "annery", "123", true);
        Usuario d = new Usuario("Otavio", "vmotavio", "123", true);
        Usuario e = new Usuario("Teresa", "teresa", "123", false);
        mapUsers.put(a.getLogin(), a);
        mapUsers.put(b.getLogin(), b);
        mapUsers.put(c.getLogin(), c);
        mapUsers.put(d.getLogin(), d);
        mapUsers.put(e.getLogin(), e);
    }

    public Usuario getAdministrador(String login, String senha) {

        Usuario usuario = this.mapUsers.get(login);

        if (usuario == null || !usuario.getSenha().equals(senha) || !isAdministrador(usuario)) {
            return null;
        }

        return usuario;
    }
    
    private boolean isAdministrador(Usuario usuario){
        return usuario.isAdmin();
    }

}

package dominio.controllers;

import dominio.modelos.Usuario;
import dominio.catalogos.CatalogoDeUsuarios;

/**
 *
 * @author marcussouza
 */
public class LoginController {

    private static LoginController instance;
    private final CatalogoDeUsuarios dao;
    
    private LoginController(){
        dao = CatalogoDeUsuarios.getInstance();
    }
    
    public static LoginController getInstance() {

        if (instance == null) {
            return new LoginController();
        } else {
            return instance;
        }
    }

    public Usuario fazerLogin(String login, String senha) {
        Usuario usuario = dao.getAdministrador(login, senha);
        
        return usuario;
    }
}

package dominio.controllers;

import dominio.Usuario;
import servicostecnicos.dao.LoginDAO;
import servicostecnicos.UsuarioDTO;

/**
 *
 * @author marcussouza
 */
public class LoginController {

    private static LoginController instance;
    private final LoginDAO dao;
    
    private LoginController(){
        dao = LoginDAO.getInstance();
    }
    
    public static LoginController getInstance() {

        if (instance == null) {
            return new LoginController();
        } else {
            return instance;
        }
    }

    public Usuario fazerLogin(String login, String senha) {
        UsuarioDTO dto = dao.autenticar(login, senha);
        
        if(dto != null){
            return new Usuario(dto.getNome(), dto.getLogin());
        }
        
        return null;
    }
}

package dominio.controllers;

import dominio.UsuarioVO;
import servicostecnicos.LoginDAO;
import servicostecnicos.UsuarioDTO;

/**
 *
 * @author marcussouza
 */
public class LoginController {

    private static LoginController instance;

    public static LoginController getInstance() {

        if (instance == null) {
            return new LoginController();
        } else {
            return instance;
        }
    }

    public UsuarioVO fazerLogin(String login, String senha) {
        
        UsuarioDTO dto = LoginDAO.getInstance().autenticar(login, senha);
        
        if(dto != null)
            return new UsuarioVO(dto.getNome(), dto.getLogin());
        
        return null;
    }
}

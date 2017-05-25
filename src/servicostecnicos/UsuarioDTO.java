/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicostecnicos;

/**
 *
 * @author Vynicius
 */
public class UsuarioDTO {

    private String nome;
    private String login;
    private String password;
    private boolean admin;

    public UsuarioDTO(String nome, String login, String password, boolean admin) {
        this.nome = nome;
        this.login = login;
        this.password = password;
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "nome=" + nome + ", login=" + login + ", password=" + password + ", admin=" + admin + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

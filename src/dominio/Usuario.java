/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author marcussouza
 */
public class Usuario {

    private String nome;
    private String login;

    public Usuario(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", login=" + login + '}';
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
}

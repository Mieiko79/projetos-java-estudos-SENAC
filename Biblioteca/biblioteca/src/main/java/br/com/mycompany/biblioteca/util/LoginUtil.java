/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mycompany.biblioteca.util;

import br.com.mycompany.biblioteca.model.Usuario;

/**
 *
 * @author marcos
 */
public class LoginUtil {
    
    public static boolean validarLogin(String login, String senha) {
        for (Usuario u : Dados.listaUsuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}

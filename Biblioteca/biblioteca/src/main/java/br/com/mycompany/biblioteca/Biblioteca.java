/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.mycompany.biblioteca;

import br.com.mycompany.biblioteca.util.Dados;
import br.com.mycompany.biblioteca.view.JFLogin;

/**
 *
 * @author marcos
 */
public class Biblioteca {

    public static void main(String[] args) {
        Dados.carregarDadosIniciais();
        new JFLogin().setVisible(true);
    }
}

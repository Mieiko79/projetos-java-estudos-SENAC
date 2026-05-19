/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mycompany.biblioteca.util;

import br.com.mycompany.biblioteca.model.Autor;
import br.com.mycompany.biblioteca.model.Editora;
import br.com.mycompany.biblioteca.model.Livro;
import br.com.mycompany.biblioteca.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Dados {
    
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public static ArrayList<Autor> listaAutores = new ArrayList<>();
    public static ArrayList<Editora> listaEditoras = new ArrayList<>();
    public static ArrayList<Livro> listaLivros = new ArrayList<>();
    
    public static void carregarDadosIniciais(){
        listaUsuarios.add(new Usuario("admin", "123"));
    }
}

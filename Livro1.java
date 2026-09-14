/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.sistemalivros;

/**
 *
 * @author henrique62977716
 */
public class Livro1 {

    String titulo;
    String autor;
    String genero;
    int anoPublicacao;
    int numeroPaginas;
    double preco;
    int idade;

    public Livro1(String tituloRecebido, String autorRecebido, String generoRecebido,
            int anoPublicacaoRecebido, int numeroPaginasRecebido, double precoRecebido){
        titulo = tituloRecebido;
        autor = autorRecebido;
        genero = generoRecebido;
        anoPublicacao = anoPublicacaoRecebido;
        numeroPaginas = numeroPaginasRecebido;
        preco = precoRecebido;
        idade = 0;
    }


    public void calcularIdade(){
        idade = 2026 - anoPublicacao;
    }


    public void imprimir(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Preço: " + preco);
        System.out.println("Idade: " + idade);
        System.out.println("____________________________________");
    }
}    
    
    

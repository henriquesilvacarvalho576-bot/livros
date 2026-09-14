/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.sistemalivros;

/**
 *
 * @author henrique62977716
 */
public class Sistemalivros {

   

    public static void main(String[] args) {

        // Instanciação dos novos livros
Livro1 livro1 = new Livro1("Orgulho e Preconceito", "Jane Austen", "Romance", 1813, 424, 34.90);
Livro1 livro2 = new Livro1("Admirável Mundo Novo", "Aldous Huxley", "Ficção Científica", 1932, 312, 38.90);
Livro1 livro3 = new Livro1("O Nome da Rosa", "Umberto Eco", "Mistério", 1980, 560, 59.90);
Livro1 livro4 = new Livro1("O Sol é Para Todos", "Harper Lee", "Drama", 1960, 348, 42.00);
Livro1 livro5 = new Livro1("O Apanhador no Campo de Centeio", "J.D. Salinger", "Ficção", 1951, 208, 31.90);
Livro1 livro6 = new Livro1("O Cortiço", "Aluísio Azevedo", "Naturalismo", 1890, 232, 26.50);
Livro1 livro7 = new Livro1("A Hora da Estrela", "Clarice Lispector", "Romance", 1977, 88, 22.90);
Livro1 livro8 = new Livro1("Duna", "Frank Herbert", "Ficção Científica", 1965, 680, 74.90);
Livro1 livro9 = new Livro1("Crime e Castigo", "Fiódor Dostoiévski", "Romance", 1866, 592, 62.90);
Livro1 livro10 = new Livro1("O Conde de Monte Cristo", "Alexandre Dumas", "Aventura", 1844, 1280, 89.90);
Livro1 livro11 = new Livro1("Moraes e a Ilha de Aço", "Bernardo Kucinski", "Ficção", 2014, 192, 29.90);
Livro1 livro12 = new Livro1("O Retrato de Dorian Gray", "Oscar Wilde", "Ficção Gótica", 1890, 240, 28.90);
Livro1 livro13 = new Livro1("Ensaio sobre a Cegueira", "José Saramago", "Ficção", 1995, 312, 47.90);
Livro1 livro14 = new Livro1("Quincas Borba", "Machado de Assis", "Romance", 1891, 224, 27.90);
Livro1 livro15 = new Livro1("A Teoria de Tudo", "Stephen Hawking", "Divulgação Científica", 2002, 176, 35.00);

// Cálculo da idade para todos os livros
livro1.calcularIdade();
livro2.calcularIdade();
livro3.calcularIdade();
livro4.calcularIdade();
livro5.calcularIdade();
livro6.calcularIdade();
livro7.calcularIdade();
livro8.calcularIdade();
livro9.calcularIdade();
livro10.calcularIdade();
livro11.calcularIdade();
livro12.calcularIdade();
livro13.calcularIdade();
livro14.calcularIdade();
livro15.calcularIdade();

// Impressão dos dados dos livros
livro1.imprimir();
livro2.imprimir();
livro3.imprimir();
livro4.imprimir();
livro5.imprimir();
livro6.imprimir();
livro7.imprimir();
livro8.imprimir();
livro9.imprimir();
livro10.imprimir();
livro11.imprimir();
livro12.imprimir();
livro13.imprimir();
livro14.imprimir();
livro15.imprimir();

// Desafio extra - cria um novo livro e altera uma informação depois
Livro1 livroExtra = new Livro1("O Iluminado", "Stephen King", "Terror", 1977, 464, 49.90);
livroExtra.calcularIdade();
livroExtra.imprimir();

livroExtra.preco = 41.90;
livroExtra.imprimir();
    }
}


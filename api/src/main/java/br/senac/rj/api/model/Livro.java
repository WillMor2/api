package br.senac.rj.api.model;

import jakarta.persistence.*;


@Entity
@Table(name="livros")
public class Livro {

    public Long getCodigo() {
        return codigo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )

    private Long codigo;


    private String titulo;

    private Double preco;

    public Livro() {

    }
    public Livro(String Titulo, Double Preco) {
        this.titulo = Titulo;
        this.preco = Preco;
    }

}





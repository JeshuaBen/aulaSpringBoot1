package model;

import java.util.UUID;

public class Livro {

    private String titulo;
    private String editora;
    private String autor;

    public Livro(String titulo, String editora, String autor) {
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


}

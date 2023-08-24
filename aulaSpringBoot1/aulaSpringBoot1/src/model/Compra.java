package model;

import java.util.List;

public class Compra {
    private Double value;
    private List<Livro> livros;
    private Cliente cliente;

    public Compra(Double value, List<Livro> livros, Cliente cliente) {
        this.value = value;
        this.livros = livros;
        this.cliente = cliente;
    }


    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}

package service;

import model.Livro;

public class LivroService {
    private static boolean verifyEmptyFields(String titulo, String editora, String autor) {
        return titulo.isEmpty() && autor.isEmpty() && editora.isEmpty();
    }

    public static Livro getLivro(String titulo, String editora, String autor) {
        return verifyEmptyFields(titulo, editora, autor)
                ? null
                : new Livro(titulo, editora, autor);
    }


}

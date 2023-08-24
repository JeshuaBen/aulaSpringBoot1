package controller;

public class LivroController {
    public static String cadastrarLivro(String titulo, String autor, String editora) {
        // No controller não deve haver regra de negócio dentro do controller, pois ele apenas mapeia.
        // Os métodos do controller tem que ser os menores possíveis. Dado que se isso acontecer, é necessário criar um service para isso
        return "Livro cadastrado com sucesso";
    }
}

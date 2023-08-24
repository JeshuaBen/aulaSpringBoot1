package view;

public class Application {
    public static void main(String[] args) {
        System.out.println("Ações possíveis:" +
                "\n 1- Cadastrar livro" +
                "\n 2- Remover Livro" +
                "\n 3- Cadastrar Cliente" +
                "\n 4- Remover Cliente" +
                "\n 5- Adicionar livro no compra" +
                "\n 6- Remover livro da compra" +
                "\n 7- Finalizar compra");
    }
}

/*
- Entidades ---> MODEL ( manipulação de dados )
*--Livro
*-- Cliente
*-- Compra

* - Application ---> VIEW (simular o front, nesse caso a interface com o usuário)
*
* - Controller (mapeando as requisições da VIEW para a MODEL)
* --LivroController
* --CompraController
  -- ClienteController
* */
package CondiçõesParte2;

import java.util.Scanner;
public class Desafio5 {
        public static void main(String[] args) {
        
        System.out.println("|| Sistemas de Login||");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o login: ");
        String login = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean loginValido = login.length() >= 5;
        boolean senhaValida = senha.length() >= 8;

        if (loginValido && senhaValida ) {
            System.out.println("Login e senha válidos.");
        } else {
            System.out.println("Dados inválidos:");
            if (!loginValido) {
                System.out.println("- O login deve conter pelo menos 5 caracteres.");
            }
            if (!senhaValida) {
                System.out.println("- A senha deve conter pelo menos 8 caracteres.");
            }
        }

        scanner.close();
    }
}

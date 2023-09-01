import entities.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();
        User user = new User(email, password);
        if(user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("admin123")){
            System.out.println("Autenticado com sucesso");
        }else{
            System.out.println("E-Mail e/ou Senha Inválidos");
        }
    }
}

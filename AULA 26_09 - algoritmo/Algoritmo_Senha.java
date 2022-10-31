import java.util.Scanner;

public class Algoritmo_Senha {
    public static void main(String[] args) {

        final String SENHA_CADASTRADA = "12a3b";
        final String SENHA_ADMIN = "9876";
        String senha = null;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(SENHA_CADASTRADA) ){
                System.out.println("Senha Correta!!");
                break;
            }else {
                System.out.println("Senha errada. Tente Novamente");

            }
            if (i == 2){
                System.out.println("Bloqueou Otaro!!");

                while (true){
                    System.out.println("Digite a senha do Admin: ");
                    senha = sc.nextLine();

                    if (senha.equals(SENHA_ADMIN)) {
                        System.out.println("Bem Vindo");
                        break;
                    }

                }
            }

        }
    }
}

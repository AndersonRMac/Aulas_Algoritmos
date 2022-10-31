import java.util.Scanner;

public class validacao_de_dados {
    public static void main(String[] args) {
        int idade;
        String nome_cliente;
        String nome_responsavel;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome_cliente  = sc.nextLine().trim();

        while (!(nome_cliente.isEmpty() || !nome_cliente.matches("^[a-zA-Z]+$"))){

            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();


            if (idade < 18){
                System.out.println("Cliente menor de idade!!");
                System.out.println("Digite o nome do responsável: ");
                nome_responsavel = sc.next().trim();

                //não admite a não digitação ou dígitos numéricos
                if (!(nome_responsavel.isEmpty() || !nome_responsavel.matches("^[a-zA-Z]+$"))){
                    System.out.println("Acesso do " + nome_cliente + " autorizado com responsável " + nome_responsavel + ".");
                    break;

                }else {
                    System.out.println("Nome do responsável inválido");
                }
            }else System.out.println("Usuário " + nome_cliente + " autorizado!");

        }
            System.out.println("Usuario Inválido!");




    }
}

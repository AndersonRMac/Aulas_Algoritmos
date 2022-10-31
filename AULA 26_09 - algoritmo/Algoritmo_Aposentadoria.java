import java.util.Scanner;

public class Algoritmo_Aposentadoria {
    public static void main(String[] args) {

       ///  salario = 1832.50;

        int parcelas = 0;
        double valor_digitado = 0;
        double porcentagem = 549.75;
        double valor_parcela = 0;


        Scanner entrada = new Scanner(System.in);

        valor_parcela = (valor_digitado / parcelas);

        while(true) {

            System.out.println("QDigite o valor que você quer solicitar: ");
            valor_digitado = entrada.nextDouble();
            System.out.println("Quantas parcelas?");
            parcelas = entrada.nextInt();


            if (valor_parcela < porcentagem) {
                System.out.println("Empréstimo Aprovado!");
                break;
            } else {
                System.out.println("Empréstimo não aprovado! Tente Outras condições");
            }
        }
    }
}

package Atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Do_Cpf {
    public static void main(String[] args) {
        String cpf;
        String[]vetor_cpf;
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o numero do seu CPF: ");
            cpf = entrada.nextLine();
            if (cpf == null || cpf.isEmpty()){
                System.out.println("CPF Inválidio!");
                break;
            }
            vetor_cpf = cpf.split("");

            Integer nono_digito = Integer.parseInt(vetor_cpf[8]);

            ArrayList<String> estados = new ArrayList<>();
            estados.add("Rio Grande do Sul");
            estados.add("Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins");
            estados.add("Amazonas, Pará, Roraima, Amapá, Acre e Rondônia");
            estados.add("Ceará, Maranhão e Piauí");
            estados.add("Paraíba, Pernambuco, Alagoas e Rio Grande do Norte");
            estados.add("Bahia e Sergipe");
            estados.add("Minas Gerais");
            estados.add("Rio de Janeiro e Espírito Santo");
            estados.add("São Paulo");
            estados.add("Paraná e Santa Catarina");

            switch (nono_digito) {
                case 1:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(1));
                    break;

                case 2:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(2));
                    break;

                case 3:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(3));
                    break;

                case 4:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(4));
                    break;

                case 5:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(5));
                    break;
                case 6:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(6));
                    break;
                case 7:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(7));
                    break;
                case 8:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(8));
                    break;
                case 9:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(9));
                    break;
                case 0:
                    System.out.println("Esse CPF pode ser desses possíves estados " + estados.get(0));
                    break;
            }
        }

    }

}

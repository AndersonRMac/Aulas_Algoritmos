package python;

import java.util.*;

public class Atividade_21_11_2022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        while(true) {
            if (sorteioOperacao().equals("+")) {
                int resultado1 = sorteioNumero1();
                int resultado2 = sorteioNumero2();
                System.out.println("Pense Rápido: " + resultado1 + " + " + resultado2);
                int soma = resultado1 + resultado2;

                System.out.println("Digite a Resposta: ");
                int resposta = scan.nextInt();
                if (resposta != soma) {
                    System.out.println("ERROU!");
                } else System.out.println("ACERTOU!");
            } else if (sorteioOperacao().equals("-")) {
                System.out.println("Pense Rápido: " + sorteioNumero1() + " - " + sorteioNumero2());
                int resultado1 = sorteioNumero1();
                int resultado2 = sorteioNumero2();
                int subtracao = resultado1 - resultado2;

                System.out.println("Digite a Resposta: ");
                int resposta = scan.nextInt();
                if (resposta != subtracao) {
                    System.out.println("ERROU!");
                } else System.out.println("ACERTOU!");

            } else if (sorteioOperacao().equals("/")) {
                System.out.println("Pense Rápido: " + sorteioNumero1() + " / " + sorteioNumero2());
                int resultado1 = sorteioNumero1();
                int resultado2 = sorteioNumero2();
                int divisao = resultado1 / resultado2;

                System.out.println("Digite a Resposta: ");
                int resposta = scan.nextInt();
                if (resposta != divisao) {
                    System.out.println("ERROU!");
                } else System.out.println("ACERTOU!");

            } else if (sorteioOperacao().equals("*")) {
                System.out.println("Pense Rápido: " + sorteioNumero1() + " * " + sorteioNumero2());
                int resultado1 = sorteioNumero1();
                int resultado2 = sorteioNumero2();
                int soma = resultado1 * resultado2;

                System.out.println("Digite a Resposta: ");
                int resposta = scan.nextInt();
                if (resposta != soma) {
                    System.out.println("ERROU!");
                } else System.out.println("ACERTOU!");

            }
        }
    }

    public static void forma_questao(){
        int numero_1 = sorteioNumero1();
        sorteioOperacao();
        sorteioNumero2();
        System.out.println("Pense Rápido: " + sorteioNumero1() +" "+ sorteioOperacao() +" "+ sorteioNumero2() );
    }
    public static String sorteioOperacao() {
        List<String> operacao = new ArrayList<String>();
        operacao.add("+");
        operacao.add("-");
        operacao.add("/");
        operacao.add("*");
        Collections.shuffle(operacao);
        String resultado = null;
        for (int i = 0; i < 1; i++) {
            resultado = operacao.get(i);
        }
        return resultado;
    }
    public static int sorteioNumero1() {
        List<Integer> numero_1 = new ArrayList<Integer>();
        numero_1.add(1);
        numero_1.add(2);
        numero_1.add(3);
        numero_1.add(4);
        numero_1.add(5);
        numero_1.add(6);
        numero_1.add(7);
        numero_1.add(8);
        numero_1.add(9);
        numero_1.add(10);
        Collections.shuffle(numero_1);
        int resultado = 0;
        for (int i = 0; i < 1; i++) {
            resultado = numero_1.get(i);
        }
        return resultado;
    }
    public static int sorteioNumero2() {
        List<Integer> numero_2 = new ArrayList<Integer>();
        numero_2.add(1);
        numero_2.add(2);
        numero_2.add(3);
        numero_2.add(4);
        numero_2.add(5);
        numero_2.add(6);
        numero_2.add(7);
        numero_2.add(8);
        numero_2.add(9);
        numero_2.add(10);
        Collections.shuffle(numero_2);
        int resultado = 0;
        for (int i = 0; i < 1; i++) {
            resultado = numero_2.get(i);
        }
        return resultado;
    }
}


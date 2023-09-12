package Atividades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Algoritmo_Sistema_de_Transito {
    public static void main(String[] args) {
        String placa;
        String[] vetor_placa;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
        String mes_Ano_Atual = formatter.format(new Date());
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a placa do veículo");
        placa = entrada.nextLine().toUpperCase();
        vetor_placa = placa.split("");


        ArrayList<String> venc_Boleto = new ArrayList<>();
        venc_Boleto.add("Final Placa 1. Boleto Vence em 10/03!");
        venc_Boleto.add("Final Placa 2. Boleto Vence em 10/04!");
        venc_Boleto.add("Final Placa 3. Boleto Vence em 10/05!");
        venc_Boleto.add("Final Placa 4. Boleto Vence em 10/06!");
        venc_Boleto.add("Final Placa 5. Boleto Vence em 10/07!");
        venc_Boleto.add("Final Placa 6. Boleto Vence em 10/08!");
        venc_Boleto.add("Final Placa 7. Boleto Vence em 10/09!");
        venc_Boleto.add("Final Placa 8. Boleto Vence em 10/10!");
        venc_Boleto.add("Final Placa 9. Boleto Vence em 10/11!");
        venc_Boleto.add("Final Placa 0. Boleto Vence em 10/12!");

        switch (vetor_placa[6]){
            case "1":
                System.out.println(venc_Boleto.get(0));
            break;

            case "2":
                System.out.println(venc_Boleto.get(1));
                break;

            case "3":
                System.out.println(venc_Boleto.get(2));
                break;

            case "4":
                System.out.println(venc_Boleto.get(3));
                break;

            case "5":
                System.out.println(venc_Boleto.get(4));
                break;
            case "6":
                System.out.println(venc_Boleto.get(5));
                break;
            case "7":
                System.out.println(venc_Boleto.get(6));
                break;
            case "8":
                System.out.println(venc_Boleto.get(7));
                break;
            case "9":
                System.out.println(venc_Boleto.get(8));
                break;
            case "0":
                System.out.println(venc_Boleto.get(9));
                break;
        }





    }
}

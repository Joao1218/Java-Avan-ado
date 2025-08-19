package SwitchExpression;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        //Switch Case antigo
        String resultado = "";
        Scanner sc =  new Scanner(System.in);
        String dia = sc.nextLine();
        switch (dia){
            case "Segunda":
                resultado = "Dia util";
                break;
            case "Terça":
                resultado = "Dia util";
                break;
            case "Quarta":
                resultado = "Dia util";
                break;
            case "Quinta":
                resultado = "Dia util";
                break;
            case "Sexta":
                resultado = "Dia util";
                break;
            case "Sabado":
                resultado = "Final de semana";
                break;
            case "Domingo":
                resultado = "Final de semana";
                break;
            default:
                resultado = "Dia invalido";
        }
        System.out.println(resultado);

        //Switch expression
        resultado = switch (dia){
            case "Segunda" -> "Dia util";
            case "Terça" -> "Dia util";
            case "Quarta" -> "Dia util";
            case "Quinta" -> "Dia util";
            case "Sexta" -> "Dia util";
            case "Sabado" -> "Final de semana";
            case "Domingo" -> "Final de semana";
            default -> "Dia invalido";
        };
        System.out.println(resultado);

        //Switch expression melhorado
        resultado = switch (dia){
            case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "Dia util";
            case "Sabado", "Domingo" -> "Final de semana";
            default -> "Dia invalido";
        };
        System.out.println(resultado);
        sc.close();
    }
}

////Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        //variaveis
        double area;
        double cobertura;
        double latasacomprar;
        double valorfinal;

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o tamanho da área a ser pintada");
        area = teclado.nextDouble();
        teclado.close();

        //calcular a quantidade de latas de tinta a serem compradas e o preco total

        cobertura = area/3;

        latasacomprar = Math.ceil(cobertura/18);

        valorfinal = latasacomprar * 80;

        //mostrar valor e quantidade de latas

        System.out.println("valor");
        System.out.println(valorfinal);

        System.out.println("quantidade de latas");
        System.out.println(latasacomprar);
   

    }
    
}

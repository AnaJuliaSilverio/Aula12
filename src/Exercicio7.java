import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i <vetor.length ; i++) {
            System.out.println("Digite o valor de numero "+(i+1)+ " :");
            vetor[i] = sc.nextInt();
        }
        System.out.println("---------VALORES PARES---------");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2==0){
                System.out.println(vetor[i]);
            }
        }



    }
}

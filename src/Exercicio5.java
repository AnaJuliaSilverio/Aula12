import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma=0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor"+(i+1));
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        System.out.println("O valor da soma dos valores e : "+soma);
    }
}

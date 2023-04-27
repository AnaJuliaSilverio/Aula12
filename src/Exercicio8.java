import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeItens;
        System.out.println("BOM DIA! Quantos itens deseja adicionar a lista de compras?");
        quantidadeItens = sc.nextInt();

        String[] itensDeCompra = new String[quantidadeItens];

        System.out.println("OK! E quais serao esses "+quantidadeItens+" itens?");
        for (int i = 0; i < quantidadeItens; i++) {
            System.out.println("Digite o item "+(i+1)+" :");
            itensDeCompra[i] = sc.next();
        }
        System.out.println("PRONTINHO! Sua lista de compras e ");
        for (int i = 0; i < quantidadeItens; i++) {
            System.out.println((i+1)+"-Nome : "+itensDeCompra[i]);
        }
    }
}


public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("USANDO FOR");
        int valorDesejado = 2;
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", valorDesejado,i,valorDesejado*i);
        }
        System.out.println("USANDO WHILE");
        int cont =0;
        while (cont<=10){
            System.out.printf("%d X %d = %d\n", valorDesejado,cont,valorDesejado*cont);
            cont++;
        }
        System.out.println("USANDO DO WHILE");
        int contDoWhile = 0;
        do {
            System.out.printf("%d X %d = %d\n", valorDesejado,contDoWhile,valorDesejado*contDoWhile);
            contDoWhile++;
        }while (contDoWhile<=10);
    }
}
public class Exercicio4 {
    public static void main(String[] args) {
        int n=10;
        System.out.println("USANDO FOR");
        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
        System.out.println("USANDO WHILE");
        int cont=1;
        while (cont<n){
            System.out.println(cont);
            cont++;
        }
        System.out.println("USANDO DO WHILE");
        int contDoWhile = 1;
        do {
            System.out.println(contDoWhile);
            contDoWhile++;
        }while (contDoWhile<n);

    }
}

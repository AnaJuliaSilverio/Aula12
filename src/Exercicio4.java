public class Exercicio4 {
    public static void main(String[] args) {
        int n=10;
        System.out.println("USANDO FOR");
        for (int i = 1; i < n; i++) {
            if (i%2==0){
                System.out.println(i);
            }

        }
        System.out.println("USANDO WHILE");
        int cont=1;
        while (cont<n){
            if (cont%2==0){
                System.out.println(cont);
            }
            cont++;
        }
        System.out.println("USANDO DO WHILE");
        int contDoWhile = 1;
        do {
            if (contDoWhile%2==0){
                System.out.println(contDoWhile);
            }
            contDoWhile++;
        }while (contDoWhile<n);

    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("USANDO FOR");
        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("USANDO WHILE");
        int cont=0;
        while (cont<=100){
            if (cont%2==0){
                System.out.println(cont);
            }
            cont++;
        }

        System.out.println("USANDO DO WHILE");
        int contDoWhile=0;
        do{
            if (contDoWhile%2==0){
                System.out.println(contDoWhile);

            }
            contDoWhile++;
        }while (contDoWhile<=100);
    }
}

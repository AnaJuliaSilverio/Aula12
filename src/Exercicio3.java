public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("USANDO WHILE");
        int cont=0;
        while (cont<=10){
            System.out.println(101+cont);
            cont++;
        }
        System.out.println("USANDO FOR");
        for (int i = 0; i < 10; i++) {
            System.out.println(101+i);
        }
        System.out.println("USANDO DO WHILE");
        int contDoWhile = 0;
        do {
            System.out.println(101+contDoWhile);
            contDoWhile++;
        }while (contDoWhile<=10);
    }
}

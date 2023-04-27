import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeDaBanda;
        String[] musicas = new String[3];
        System.out.println("Digite o nome da banda");
        nomeDaBanda = sc.nextLine();

        for (int i = 0; i < musicas.length; i++) {
            System.out.println("Nome da musica "+(i+1));
            musicas[i] = sc.next();
        }
        System.out.println("Nome da Banda: "+nomeDaBanda);
        for (int i = 0; i < musicas.length; i++) {
            System.out.println("Nome da Musica "+(i+1)+" : "+musicas[i]);

        }
    }
}

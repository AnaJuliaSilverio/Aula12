import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[10];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno "+(i+1));
            alunos[i] = sc.next();
        }
        System.out.println("--------------LISTA DE ALUNOS--------------");

        for (int i = 0; i < alunos.length; i++) {
            System.out.println((i+1)+" Nome: "+alunos[i]);
        }
        System.out.println("----------------------------");

    }




}

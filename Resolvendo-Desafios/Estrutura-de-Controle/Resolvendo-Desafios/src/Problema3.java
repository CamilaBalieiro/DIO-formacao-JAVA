import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        int N;

        for (int i = 0; i < C; i++) {
            nome = leitor.next();
            N = leitor.nextInt();

            if ((nome.equalsIgnoreCase("Thor") && N >= 50) ||
                (nome.equalsIgnoreCase("Hulk") && N >= 5000) ||
                (nome.equalsIgnoreCase("Tony") && N >= 1000) ||
                (nome.equalsIgnoreCase("Steve") && N >= 500)) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}


import java.util.Scanner;

public class Problema2 {
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }

        // Imprimir o terceiro nome (índice 2)
        System.out.println(nomes[2]);

        // Imprimir o sétimo nome (índice 6)
        System.out.println(nomes[6]);

        // Imprimir o nono nome (índice 8)
        System.out.println(nomes[8]);
    }
}
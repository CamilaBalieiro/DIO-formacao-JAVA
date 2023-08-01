//import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args)  {
        try{
        Scanner scanner = new Scanner (System.in).useLocale(null);
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite seu altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola me chamo " + nome.toUpperCase() + sobrenome );
        System.out.println("Tenho "+idade+ " Anos");
        System.out.println("Minha Altura é "+altura+" cm");
        scanner.close();
    }

    catch(InputMismatchException e){
        System.out.println("O campos idade e altura precisam ser numericos");
    }}
}

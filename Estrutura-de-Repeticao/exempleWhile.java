import java.util.concurrent.ThreadLocalRandom;

public class exempleWhile {
    
    public static void main(String[]args){
        double mesada = 50.0;
        while(mesada >0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("Doce do valor: "+valorDoce+" Adicionado no carinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:"+mesada);
        System.out.println("Joaozinho gastou toda a sua mesada");

       
    }
     private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2,8);
        }
}

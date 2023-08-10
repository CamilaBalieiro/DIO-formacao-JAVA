import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Case4 {
    public static void main(String[] args) {
        
        System.out.println("******Processo Seletivo******");
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        for(String candidato:candidatos){
            entrandoEmContato(candidato);

        }
   }
   static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
//Elas precisarao sofrer alterações
        atendeu=atender();
        continuarTentando =! atendeu;
        if(continuarTentando)
            tentativasRealizadas++;
        else
            System.out.println("Contato realizado com sucesso");
    }while(continuarTentando && tentativasRealizadas<3);
    if(atendeu)
    System.out.println("Conseguimos contato com "+candidato+" NA "+tentativasRealizadas);
    else
    System.out.println("Não conseguimos contato com "+candidato+" numero maximo de tentativas "+tentativasRealizadas);
   }

    //Metodo atender
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
            String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
            System.out.println("Imprimir na tela a lista de candiddos informando o indice do elemento");
        for(int indice =0; indice < candidatos.length;indice++){
            System.out.println("O candidado de n "+(indice+1)+" é "+candidatos[indice]);
        }    
        System.out.println("Forma abreviada de interação for each");
        for(String candidato:candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
        }    

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionado = 0;
        int candidatoatual =0;
        double salarioBase=2000.0;
        while(candidatosSelecionado <5 && candidatoatual < candidatos.length){
         String candidato = candidatos[candidatoatual];
         double salarioPretendido = valorPretendido();   
         System.out.println("O candidado "+candidato+" Solicitou este valor de salario "+salarioPretendido);
         if(salarioBase>= salarioPretendido){
            System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
            candidatosSelecionado++;
         }
         candidatoatual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguarda resultado demais");
        }

    }
}

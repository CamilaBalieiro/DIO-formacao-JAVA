import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        
        System.out.println("******Processo Seletivo******");
        selecaoCandidatos();
    
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

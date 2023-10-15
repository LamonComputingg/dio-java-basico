import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args){
        System.out.println("(Processo Seletivo)");
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecaoCandidatos(); 
    }
    static void imprimirSelecionados(){
         String [] candidatos = {
            "Lamon",
            "Limon",
            "Santos",
            "Karina",
            "Florentino",
            "Carmelia",
            "Laerson",
            "Romão",
            "Silva",
            "Souza"
        };
        System.out.println("Imprimindo a lsita de candidatos'/as' informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato'/a' de número " + (indice+1) + " é o " + candidatos[indice]);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {
            "Lamon",
            "Limon",
            "Santos",
            "Karina",
            "Florentino",
            "Carmelia",
            "Laerson",
            "Romão",
            "Silva",
            "Souza"
        };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato(a) " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato(a) " + "foi selecionado(a) para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA 'O/A' CANDIDATO(A)!!");

        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA 'O/A' CANDIDATO(A) COM CONTRA PROPOSTA!!!");
        }
        else{
            System.out.println("AGUARDANDO 'O/A' RESULTADO DOS DEMAIS CANDIDATOS(AS)!!!!");
        }
    }
}
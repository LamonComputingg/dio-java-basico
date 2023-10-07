public class Operadores{
    public static void main(String[] args){
        String nomeCompleto = "Lamon" + "Santos";
        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        System.out.println("concatenacao");
        String concatenacao ="?"; 
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
    }
}
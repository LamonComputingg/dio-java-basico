public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status da TV -> Ligada? " + smartTv.ligada); //10:42 assistir aula
        smartTv.desligar();
        System.out.println("Novo Status da TV -> Ligada? " + smartTv.ligada);
    }
}

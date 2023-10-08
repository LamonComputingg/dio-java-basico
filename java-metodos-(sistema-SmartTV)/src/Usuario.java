public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(19);
        System.out.println("Novo status de canal: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Status da TV -> Ligada? " + smartTv.ligada); //10:42 assistir aula
        smartTv.desligar();
        System.out.println("Novo status da TV -> Ligada? " + smartTv.ligada);
    }
}

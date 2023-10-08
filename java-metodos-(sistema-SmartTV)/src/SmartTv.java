public class SmartTv {
        boolean ligada=false;
        int canal=1;
        int volume =25;

        public void aumentarCanal(){
            // canal = canal + 1;
            canal++;
            System.out.println("Aumentou de canal para: " + canal);
        }
        
        public void aumentarVolume(){
            //volume = volume + 1;
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
        public void diminuirVolume(){
            //volume = volume - 1;
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
        public void ligar(){
            ligada=true;
        }
        public void desligar(){
            ligada=false;
        }
}


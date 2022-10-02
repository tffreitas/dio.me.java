public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV esta ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();

        smartTV.mudarCanal(11);
        System.out.println("Canal atual: " + smartTV.canal);
    }
}

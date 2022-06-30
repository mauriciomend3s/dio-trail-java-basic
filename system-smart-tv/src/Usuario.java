public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? : " + smartTv.canal);
        System.out.println("Volume atual? : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        ////////////////////////////////////////////////////
        smartTv.aumentarVolume();
        System.out.println("Volume atual? : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual? : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual? : " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual? : " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Aumenta? : " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Diminui atual? : " + smartTv.canal);

        smartTv.inserirCanal(22);
        System.out.println("Canal atual? : " + smartTv.canal);

    }
}

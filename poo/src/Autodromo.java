public class Autodromo {
    public static void main(String[] args) {

        Carro jeepRenegado = new Carro();
        jeepRenegado.ligar();

        jeepRenegado.setChassi("koiof09fg");
        System.out.println("CHASSI CARRO: " + jeepRenegado.getChassi());

        Moto cg150 = new Moto();
        cg150.setChassi("kjkjd988");
        System.out.println("CHASSI MOTO: " + cg150.getChassi());

    }

}

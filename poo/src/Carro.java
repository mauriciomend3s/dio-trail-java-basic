public class Carro extends Veiculo {

    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível...");
    }

    private void confereCambio() {
        System.out.println("Câmbio iniciado em P...");
    }
}
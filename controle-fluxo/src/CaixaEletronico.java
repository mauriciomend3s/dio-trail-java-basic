public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }else{
            System.out.println("Saldo insuficiente!");
        }

        System.out.println(saldo);
    }
}
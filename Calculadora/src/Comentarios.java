public class Comentarios {
    public static void main(String[] args) {
    // ola, eu sou um comentario em uma unica linh

    /*
     * ola,
     * eu sou um comentario
     * que posso ser mais detalhado
     * quando necessario
     */

    /*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade de somar ou multiplicar
     * dois números
     */
    }
    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { // M= multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;

    }

    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */
    public void metodo() {

    }
}

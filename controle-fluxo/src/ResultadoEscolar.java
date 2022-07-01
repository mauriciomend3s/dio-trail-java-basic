import org.omg.Messaging.SyncScopeHelper;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        int nota2 = 5;
        String resultado = nota2 >= 6 ? "Aprovado" : nota2 < 6 && nota2 >= 4 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }

}

package escola;

public class Escola {

    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Neto");
        felipe.setIdade(8);

        System.out.println("o aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
    
}

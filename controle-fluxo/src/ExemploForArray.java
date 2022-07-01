public class ExemploForArray {
    public static void main(String[] args) {
     
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno "+alunos[i]);

        }
        System.out.println("**********");
        for (String aluno : alunos) {
            System.out.println("Aluno "+aluno);
            
        }
    }   
}

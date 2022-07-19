public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos","04442200548");

        marcos.setEndereco("Rua dos colibris");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());

    }
    
}

public enum EstadoBrasileiro{
    
SAO_PAULO("SP","São Paulo",12),
RIO_JANEIRO("RJ","Rio de Janeiro",34),
PIAU("PI","Piauí",25),
MARANHAO("MA","Maranhão",78),
CEARA("CE","Ceará",15);

private String nome;
private String sigla;
private int ibge;

private EstadoBrasileiro(String sigla, String nome, int ibge){
    this.sigla=sigla;
    this.nome=nome;
    this.ibge=ibge;
}
public String getSigla(){
    return sigla;
}

public String getNome(){
    return nome;
}

public int getIbge(){
    return ibge;
}

public String getNomeMaiusculo(){
    return nome.toUpperCase();
}

}
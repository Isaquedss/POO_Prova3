package br.edu.iftm.Prova3;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    public void fazerAniversarioNaInstituicao() { //Fazer aniversario de mais um ano trabalhando/Inscrito na instituição
        String identidade = pegarID();
            System.out.printf("%s Completou mais um ano! \n", identidade);
       
    }

    protected String pegarID(){
        if (sexo.equalsIgnoreCase("Masculino")){
            return String.format("O %s", nome);
        } else {
            return String.format("A %s", nome); 
        } 
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getSexo(){
        return sexo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    
}

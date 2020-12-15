package br.edu.iftm.Prova3;

public class Aluno extends Pessoa{
    private int cpf;
    private String curso;

    public Aluno(String nome, int idade, String sexo , int cpf, String curso) {
        super(nome, idade, sexo);
        this.cpf = cpf;
        this.curso = curso;
    }

    public void cancelarInscricao(){
        String identidade = pegarID();
        System.out.printf("%s cancelou sua incrição no curso de %s com o cpf %d  \n" , identidade , curso, cpf );
    }

   public int getCpf(){
       return cpf;
   }
   
   public String getCurso(){
       return curso;
   }

   public void setCpf(int cpf){
       this.cpf = cpf;
   }

   public void setCurso(String curso){
       this.curso = curso;
   }

}

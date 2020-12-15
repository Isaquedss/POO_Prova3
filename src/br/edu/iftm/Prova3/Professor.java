package br.edu.iftm.Prova3;

public class Professor extends Pessoa{
    private String Materia;
    private float salario;

    public Professor(String nome, int idade, String sexo, String materia, float salario) {
        super(nome, idade, sexo);
        this.Materia = materia;
        this.salario = salario;

    }   
    public void aumentarSalario(){
        salario += 125;
        String identidade = pegarID();
        System.out.printf("%s teve um aumento de salario", identidade );
        System.out.printf(", e seu novo salario é R$%.2f \n", salario);
    }

    public String getMateria(){
        return Materia;
    }

    public float getSalario(){
        return salario;
    }

    public void setMateria(String materia){
        this.Materia = materia;
    }
    
    public void setSalario(Float salario){
        this.salario = salario;
    }
}

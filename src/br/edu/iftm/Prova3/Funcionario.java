package br.edu.iftm.Prova3;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando = true;


    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void trabalho(){
        String identidade = pegarID();
        if (trabalhando == true){
            System.out.printf("%s esta trabalhando normalmente \n", identidade);
        } else {
            System.out.printf("%s foi demitido(a) \n", identidade);
        }
    }


    public String getSetor(){
        return setor;
    }

    public boolean isTrabalhando(){
        return trabalhando;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setTrabalhando(Boolean trabalhando){
        this.trabalhando = trabalhando;
    }

    
}

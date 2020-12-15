package br.edu.iftm.Prova3;

public final class Instituicao {
    private String nome;

    public Instituicao(String nome){
        this.nome = nome;
    }

    public void nomeInstituicao(){
            System.out.format("A instituição se chama %s", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

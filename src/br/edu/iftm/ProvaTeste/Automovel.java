package br.edu.iftm.ProvaTeste;

public abstract class Automovel {
    private String modelo;
    private int quantidadeDeRodas;
    private int velocidade;

    public Automovel(String modelo, int quantidadeDeRodas){
        this.modelo = modelo;
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public abstract void andar();

    public int velocidadeMedia(int tempo, int espaco) { //O tempo seria em formato de horas
        return espaco / tempo; 
    }

    public float velocidadeMedia(Float tempo, Float espaco) {
        return espaco / tempo; 
    }

    public double velocidadeMedia(double tempo, double espaco) {
        return espaco / tempo; 
    }

    public void buzinar(){
        String model = pegarModelo();
        System.out.printf("%sbuzinou: \n", model);
    }

    public final void acidente(){
        String model = pegarModelo();
        System.out.printf("%ssofreu um acidente \n" , model);
    }

    protected void andarPosicaoKM(int correr){
        this.velocidade = correr;
    }

    protected String pegarModelo(){
        if (modelo.equalsIgnoreCase("Carro")){
           return String.format("O %s ", modelo);
        } else {
            return String.format("A %s ", modelo);
        }
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public String getModelo() {
        return modelo;
    }

   public void setQuantidadeDeRodas(int quantidadeDeRodas) {
       this.quantidadeDeRodas = quantidadeDeRodas;
   }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString() {
        String informacao = String.format("%s de Professor/Funcionario", modelo ); //Depende do seu cargo
        return informacao;
    }
    
}

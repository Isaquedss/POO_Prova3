package br.edu.iftm.ProvaTeste;

public class Carro extends Automovel {

    public Carro() {
        super("Carro", 4);
        
    }

    @Override
    public void andar() {
        String model  = pegarModelo();
        andarPosicaoKM(100);
        System.out.printf("%scomeçou a andar a uma velocidade de 100Km/h \n", model);

    }

    @Override
    public void buzinar(){
        super.buzinar();
        System.out.println("Paaaaaaaaaaaannn " );
    }
    
}

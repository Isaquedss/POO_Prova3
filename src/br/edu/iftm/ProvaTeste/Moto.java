package br.edu.iftm.ProvaTeste;

public class Moto extends Automovel{

    public Moto() {
        super("Moto", 2);
        
    }

    @Override
    public void andar() {
        String model = pegarModelo();
        andarPosicaoKM(80);
        System.out.printf("%scomeçou a andar a uma velocidade de 80Km/h \n", model);
    }

    @Override
    public void buzinar(){
        super.buzinar();
        System.out.println("beeeeeeeeeeep ");
    }
    
}

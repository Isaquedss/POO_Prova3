package br.edu.iftm.Prova3;

import br.edu.iftm.ProvaTeste.Carro;
import br.edu.iftm.ProvaTeste.Moto;

public class Teste {
    public static void main(String[] args) {
        Instituicao instituto = new Instituicao ("IFTM");
        instituto.nomeInstituicao();
        System.out.println();

        Pessoa pessoa = new Pessoa("Fernando", 17 , "Masculino");
        pessoa.fazerAniversarioNaInstituicao();
        System.out.println();

        Aluno aluno = new Aluno("Maria", 18, "Feminino", 1458763, "ADS");
        aluno.fazerAniversarioNaInstituicao();
        aluno.cancelarInscricao();
        System.out.println();
    
        Funcionario funcionario = new Funcionario("Matheus", 25, "Masculino", "Gerente", true);
        funcionario.trabalho();
        System.out.println(funcionario.getNome() + " possui um automovel do tipo: ");

        Moto moto = new Moto();
        System.out.println(moto);
        moto.andar();
        moto.buzinar();
        System.out.println();

        Professor professor = new Professor("Pat", 35, "Feminino", "Matematica", 1200);
        professor.aumentarSalario();
        System.out.println(professor.getNome() + " possui um automovel do tipo: ");

        Carro carro = new Carro();
        System.out.println(carro);
        carro.andar();
        carro.buzinar();
        carro.acidente();
        System.out.println("A velocidade média do veiculo era : " + carro.velocidadeMedia(0.7, 100) + "km/h");
        

    }
    
}

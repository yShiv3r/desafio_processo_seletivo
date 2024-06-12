package org.example;

public class CaseOne extends Intermediario {
    public static String ligando(double salarioBase, double pretencaoSalarial) {
        System.out.println(valorPretendido());
        if (salarioBase < pretencaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase >= pretencaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATS");
        }
        return null;
    }
}

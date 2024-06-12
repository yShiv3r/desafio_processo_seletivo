package org.example;

import java.util.ArrayList;

public class CaseTwo extends Intermediario {
    public static void selecaoDeCandidatos() {
        String[] candidatos = {"FELIPE", "NATALIA", "GABRIEL", "ISABELLE", "CAMILA", "EDUARDO", "TOMAS", "VITORIA", "MARCIO"};
        int cadidatosSelecionados = 0;
        int candidatoAtual = 0;
        ArrayList<String> selecionados = new ArrayList<String>();
        double salarioBase = 2000.00;

        while (cadidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            candidatoAtual++;
            if (salarioPretendido <= salarioBase) {
                System.out.println("O candidato " + candidato + " pretente receber R$" + salarioPretendido);
                cadidatosSelecionados++;
                selecionados.add(candidato);
            }
        }
        System.out.println(selecionados);
    }
}

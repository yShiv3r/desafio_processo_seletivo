package org.example;

import java.util.ArrayList;

public class CaseFour extends Intermediario {
    public static void entrandoEmContato() {
        int tentativas = 0;
        boolean continuarTentanto = true;
        boolean atendeu = false;
        int cadidatosSelecionados = 0;
        int candidatoAtual = 0;
        String[] candidatos = {"FELIPE", "NATALIA", "GABRIEL", "ISABELLE", "CAMILA", "EDUARDO", "TOMAS", "VITORIA", "MARCIO"};
        ArrayList<String> selecionados = new ArrayList<String>();
        do {
            atendeu = atender();
            continuarTentanto = !atendeu;
            if (continuarTentanto) {
                tentativas++;
            }
        } while (continuarTentanto && tentativas <= 3);

        while (cadidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            candidatoAtual++;
            if (salarioPretendido <= 2000) {
                cadidatosSelecionados++;
                selecionados.add(candidato);
                if (atendeu) {
                    System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + selecionados.get(cadidatosSelecionados-1) + " NA " + tentativas + "° TENTATIVA");
                } else {
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ selecionados.get(cadidatosSelecionados-1) +", NUMERO MAXIMO DE TENTATIVAS CONCLUIDO ");
                }
            }
        }
    }
}

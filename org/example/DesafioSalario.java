package org.example;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;
public class DesafioSalario {
    public static void main(String[] args) {
        //  TESTE CASE 01
        CaseOne.ligando(2000, Intermediario.valorPretendido());
        //  TESTE CASE 02
        CaseTwo.selecaoDeCandidatos();
        //  TESTE CASE 04
        CaseFour.entrandoEmContato();
    }
}
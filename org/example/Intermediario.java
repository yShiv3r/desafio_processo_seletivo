package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Intermediario {

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}

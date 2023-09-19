package org.example;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInicioIntervalo = 0;
        do {
            System.out.println("Escribe el número inicial (0 para salir)");
            numInicioIntervalo = sc.nextInt();
            if (numInicioIntervalo == 0){
                System.exit(0);
            }
                System.out.println("Introduce el número final:");
                int numFinalIntervalo = sc.nextInt();
                int contador = 0;

                System.out.println("Buscando primos...");
                System.out.println("Números primos en el intervalo:");

                for (int i = numInicioIntervalo; i <= numFinalIntervalo; i++) {
                    if (esPrimo(i)) {
                        contador++;
                        System.out.println(i);
                    }
                }
                System.out.println("Se han encontrado " + contador + " números primos.");
            } while (numInicioIntervalo != 0) ;
        }
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}

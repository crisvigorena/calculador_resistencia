package com.inforcap.main;

import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res1, res2, res3, resnesima, restotal;
        System.out.println("Calculador de resistencia total V2.0");
        System.out.println("Ingrese solo valores positivos");
        do {
            System.out.println("Ingrese el valor de resistencia 1: ");
            res1 = sc.nextDouble();
            if (res1 < 1)
                System.out.println("Valor erroneo. Intente nuevamente");
        }
        while (res1 <= 0);
        do {
            System.out.println("Ingrese el valor de resistencia 2: ");
            res2 = sc.nextDouble();
            if (res2 < 1)
                System.out.println("Valor erroneo. Intente nuevamente");
        }
        while (res2<=0);
        do {
            System.out.println("Ingrese el valor de resistencia 3: ");
            res3 = sc.nextDouble();
            if (res3 < 1)
                System.out.println("Valor erroneo. Intente nuevamente");
        }
        while (res3<=0);
        resnesima=1/(1-0);
        restotal=(1/(1/res1)+(1/res2)+(1/res3)+(1/resnesima));
        System.out.printf("El valor de la resistencia total es : %.1f",restotal);



    }
}

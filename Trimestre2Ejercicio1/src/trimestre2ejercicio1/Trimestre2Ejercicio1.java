/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestre2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Trimestre2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        double notaf = 0;

        System.out.println("Introduce la nota del primer examen: ");
        nota1 = entrada.nextDouble();

        System.out.println("¿Qué nota quieres sacra en el primer trimestre?");
        notaf = entrada.nextDouble();
        if (nota1 > 0 && nota1 < 11 && notaf > 0 && notaf <= 10) {

            nota2 = ((notaf * 100) - (nota1 * 40)) / 60;
            System.out.println("Si quieres sacar un " + notaf + "en la nota final, necesitas sacar un " + nota2 + " en la segunda nota del examen");
        } else {
            System.out.println("Has introducido una nota invalida");
        }

    }

}

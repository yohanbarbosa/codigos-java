package com.mycompany.matriz;


import java.util.Scanner;



/**
 *
 * @author SCIS3-03
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño");
       
         long startTime = System.nanoTime();
        int size = 30;
        int matriz[][] = new int[size][size];
        llenarmatriz(matriz);
        long endTime = System.nanoTime()- startTime;
        System.out.println("time: " + endTime);
    }

    public static void llenarmatriz(int matriz[][]) {

        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[f].length; c++) {

                matriz[f][c] = (int) (Math.random() * 100) + 1;
            }
        }
        
//        
//         for (int f = 0; f < matriz.length; f++) {
//            
//            for (int c = 0; c < matriz[f].length; c++) {
//
//                 System.out.print(matriz[f][c] + "  " );
//            }
//             System.out.println();
//        }

    }
}

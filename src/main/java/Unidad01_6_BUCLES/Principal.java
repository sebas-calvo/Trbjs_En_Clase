/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_6_BUCLES;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {
    public static void main(String[] args) {
        
        var lectura=new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas que tendrá la matriz");
        var filas=lectura.nextInt();
        System.out.println("Ingrese el numero de columnas que tendrá la matriz");
        var columnas=lectura.nextInt();
        
        var mat=new int[filas][columnas];
        
        
        for (int j = 0; j < filas; j++) {
            for (int k = 0; k < columnas; k++) {
                System.out.println("Ingrese el dato en la fila "+ (j+1)+" y columna "+ (k+1));
                mat[j][k]=lectura.nextInt();
                
            }
            
        }
        
        System.out.println("La matriz ingresada es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mat[i][j]+"  ");
                
            }
            System.out.println("  ");
            
        }
        
        
        
    }
}

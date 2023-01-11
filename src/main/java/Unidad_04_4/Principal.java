/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_04_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {

        var finaliza = false;
        while (finaliza == false) {

            try {
                int vector[] = new int[2];
                System.out.println("Ingrese un numero");
                var numero = new Scanner(System.in).nextInt();
                vector[0] = numero;
                System.out.println("numero= " + 100 / numero);
                finaliza = true;

            } catch (InputMismatchException el) {

                System.out.println("Error en el ingreso " + el.toString());

            } catch (ArithmeticException el) {
                System.out.println("Error: Division para 0 " + el.toString());

            } catch (ArrayIndexOutOfBoundsException el) {
                System.out.println("Error: valor fuera del vector " + el.toString());
            }
        }

    }

}

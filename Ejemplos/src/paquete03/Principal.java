/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

//import paqueteuno.Operador;
import paquete04.*;

/**
 *
 * @author DELL
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = operadorUno.obtenerNumero();
        int valorB = operadorUno.obtenerNumero();
        int suma = operadorDos.obtenerSuma(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n",
                valorA,
                valorB,
                suma);

    }
}

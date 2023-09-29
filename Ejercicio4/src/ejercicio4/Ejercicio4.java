/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author AngieGonzalez
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

 public static void main(String[] args) {
        // Crear una lista para almacenar los objetos ValorContable
        List<ValorContable> listaValores = new ArrayList<>();

        // Crear 12 objetos ValorContable y almacenarlos en la lista
        listaValores.add(new ValorContable(1, 1000, '+'));
        listaValores.add(new ValorContable(2, 1500, '-'));
        listaValores.add(new ValorContable(3, 500, '+'));
        listaValores.add(new ValorContable(4, 200, '-'));
        listaValores.add(new ValorContable(5, 3000, '+'));
        listaValores.add(new ValorContable(6, 700, '-'));
        listaValores.add(new ValorContable(7, 800, '+'));
        listaValores.add(new ValorContable(8, 250, '-'));
        listaValores.add(new ValorContable(9, 1200, '+'));
        listaValores.add(new ValorContable(10, 450, '-'));
        listaValores.add(new ValorContable(11, 1800, '+'));
        listaValores.add(new ValorContable(12, 950, '-'));

        // Inicializar las variables para almacenar los totales
        double totalPositivo = 0;
        double totalNegativo = 0;

        // Recorrer la lista y calcular los totales
        for (ValorContable valor : listaValores) {
            if (valor.getSigno() == '+') {
                totalPositivo += valor.getValor();
            } else if (valor.getSigno() == '-') {
                totalNegativo += valor.getValor();
            }
        }

        // Comparar los totales y emitir un mensaje
        if (totalPositivo > totalNegativo) {
            System.out.println("El total positivo es mayor que el total negativo.");
        } else if (totalPositivo < totalNegativo) {
            System.out.println("El total negativo es mayor que el total positivo.");
        } else {
            System.out.println("El total positivo y el total negativo son iguales.");
        }
    }
}
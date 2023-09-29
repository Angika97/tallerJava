/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto1;

import java.util.ArrayList;
import java.util.List;

public class Punto1 {
    public static void main(String[] args) {
        // Crear una lista de palabras
        List<String> palabras = new ArrayList<>();
        palabras.add("Manzana");
        palabras.add("Computadora");
        palabras.add("Elefante");
        palabras.add("Montaña");
        palabras.add("Refrigerador");

        // Crear una lista para almacenar las palabras mayores a 10 letras
        List<String> palabrasMayoresDe10Letras = new ArrayList<>();

        // Recorrer la lista de palabras y validar cuáles son mayores a 10 letras
        for (String palabra : palabras) {
            if (palabra.length() > 10) {
                palabrasMayoresDe10Letras.add(palabra);
            }
        }

        // Emitir un mensaje con las palabras mayores de 10 letras encontradas
        if (!palabrasMayoresDe10Letras.isEmpty()) {
            System.out.println("Palabras mayores de 10 letras encontradas:");
            for (String palabra : palabrasMayoresDe10Letras) {
                System.out.println(palabra);
            }
        } else {
            System.out.println("No se encontraron palabras mayores de 10 letras.");
        }
    }
}

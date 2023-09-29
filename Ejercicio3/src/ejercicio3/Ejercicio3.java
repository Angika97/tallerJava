/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 *
 * @author AngieGonzalez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Crear un mapa con clave Integer y valor Estado
        Map<Integer, Estado> mapaEstados = new HashMap<>();

        // Agregar 10 registros al mapa
        mapaEstados.put(1, new Estado(1, "activo"));
        mapaEstados.put(15, new Estado(15, "activo"));
        mapaEstados.put(3, new Estado(3, "inactivo"));
        mapaEstados.put(5, new Estado(5, "activo"));
        mapaEstados.put(11, new Estado(11, "inactivo"));
        mapaEstados.put(14, new Estado(14, "activo"));
        mapaEstados.put(16, new Estado(16, "activo"));
        mapaEstados.put(8, new Estado(8, "inactivo"));
        mapaEstados.put(18, new Estado(18, "activo"));
        mapaEstados.put(6, new Estado(6, "inactivo"));
        mapaEstados.put(7, new Estado(7, "activo"));

        // ID a buscar
        int idABuscar = 88;

        // Buscar el estado en el mapa
        Estado estadoEncontrado = mapaEstados.get(idABuscar);

        // Verificar si el estado existe
        if (estadoEncontrado != null) {
            // Verificar si el estado es 'activo'
            if (estadoEncontrado.getEstado().equals("activo")) {
                System.out.println("Proceso exitoso.");
            } else {
                System.out.println("Error: El estado con ID " + idABuscar + " está inactivo.");
            }
        } else {
            System.out.println("Error: El estado con ID " + idABuscar + " no existe.");
        }
    }
}
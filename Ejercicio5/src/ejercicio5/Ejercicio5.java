/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author AngieGonzalez
 */
import java.util.ArrayList;
import java.util.List;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
 


    public static void main(String[] args) {
        // Crear listas de ciudades y estados
        List<String> ciudades = new ArrayList<>();
        ciudades.add("cali");
        ciudades.add("medellin");

        List<String> estados = new ArrayList<>();
        estados.add("activo");

        // Crear objetos Empresa
        Empresa empresa1 = new Empresa(1, "evergreen", "cali", "activo", 12123L);
        Empresa empresa2 = new Empresa(2, "acme", "bogota", "inactivo", 45678L);
        Empresa empresa3 = new Empresa(3, "xyz", "medellin", "activo", 98765L);
        Empresa empresa4 = new Empresa(4, "abc", "cali", "activo", 11111L);
        Empresa empresa5 = new Empresa(5, "test", "bogota", "activo", 22222L);

        // Validar los objetos Empresa
        validarEmpresa(empresa1, ciudades, estados);
        validarEmpresa(empresa2, ciudades, estados);
        validarEmpresa(empresa3, ciudades, estados);
        validarEmpresa(empresa4, ciudades, estados);
        validarEmpresa(empresa5, ciudades, estados);
    }

    public static void validarEmpresa(Empresa empresa, List<String> ciudades, List<String> estados) {
        if (!ciudades.contains(empresa.getCiudad())) {
            System.out.println("Error: La ciudad de la empresa no se encuentra en la lista de ciudades.");
            return;
        }

        if (!estados.contains(empresa.getEstado())) {
            System.out.println("Error: El estado de la empresa no se encuentra en la lista de estados.");
            return;
        }

        if (!empresa.getEstado().equals("activo")) {
            System.out.println("Error: El estado de la empresa no es 'activo'.");
            return;
        }

        System.out.println("Empresa correcta.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author AngieGonzalez
 */
public class Ejercicio2 {
    

  public static void main(String[] args) {
        // Solicita la fecha al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha (formato día/mes/año): ");
        String fechaStr = scanner.nextLine();
        
        // Llama a la función de validación y muestra el mensaje correspondiente
        if (validarFechaActual(fechaStr)) {
            System.out.println("La fecha ingresada es el año y mes actuales.");
        } else {
            System.out.println("La fecha ingresada no es el año y mes actuales o tiene un formato inválido.");
        }
        
        scanner.close();
    }

    public static boolean validarFechaActual(String fechaStr) {
        // Obtén la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        
        // Convierte la fecha ingresada a un objeto Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaIngresada;
        
        try {
            fechaIngresada = sdf.parse(fechaStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Debe ser 'día/mes/año'.");
            return false;
        }
        
        // Convierte la fecha ingresada a un objeto Calendar para comparar año y mes
        Calendar fechaIngresadaCal = Calendar.getInstance();
        fechaIngresadaCal.setTime(fechaIngresada);
        
        // Compara el año y el mes de la fecha ingresada con la fecha actual
        if (fechaIngresadaCal.get(Calendar.YEAR) == fechaActual.get(Calendar.YEAR) &&
            fechaIngresadaCal.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)) {
            return true;
        } else {
            System.out.println("La fecha ingresada no es el año y mes actuales.");
            return false;
        }
    }
}
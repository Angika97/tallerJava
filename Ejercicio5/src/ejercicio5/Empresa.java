/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author AngieGonzalez
 */
public class Empresa {
    private int id;
    private String nombre;
    private String ciudad;
    private String estado;
    private long nit;

    public Empresa(int id, String nombre, String ciudad, String estado, long nit) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estado = estado;
        this.nit = nit;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public long getNit() {
        return nit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

}
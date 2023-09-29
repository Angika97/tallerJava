/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;


public class ValorContable {
    private int id;
    private double valor;
    private char signo;

    public ValorContable(int id, double valor, char signo) {
        this.id = id;
        this.valor = valor;
        this.signo = signo;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public char getSigno() {
        return signo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }
}
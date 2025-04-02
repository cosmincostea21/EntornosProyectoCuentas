/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornoscuentas;

/**
 *
 * @author usutarde
 */
public class Cuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public Cuenta() {
    }

    public Cuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public double estado() {
        return this.saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        } else {
            this.saldo = this.saldo + cantidad;
        }
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        
        if (this.estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        
        this.saldo = this.saldo - cantidad;
    }
}

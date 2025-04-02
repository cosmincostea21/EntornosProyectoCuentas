/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornoscuentas;

/**
 *
 * @author usutarde
 */
public class EntornosCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta miCuenta;
        double saldoActual;
        
        miCuenta = new Cuenta("Cosmin Costea", "1000-2365-45-123456789",5000.0,1.0);
        saldoActual = miCuenta.estado();
        
        System.out.println("El saldo actual es: " + saldoActual);
        
        
        try{
            
            miCuenta.retirar(2300);
            miCuenta.ingresar(695);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}

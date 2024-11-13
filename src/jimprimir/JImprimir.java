/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jimprimir;

/**
 * Un ejemplo donde se lanza a impresora el contenido de un JFrame
 * @author Sergio Teacher
 */
public class JImprimir {

    /**
     * @param args el array de parámetros
     */
    public static void main(String[] args) {
        System.out.println("Iniciando Impimir ...");
        VentanaImprimir VPrint = new VentanaImprimir();
        VPrint.setVisible(true);
    }
    
}

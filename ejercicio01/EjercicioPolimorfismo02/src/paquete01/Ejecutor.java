/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        AutomovilGasolina autoG = new AutomovilGasolina("Felipe Jiménez", 
                "LBB-1102", 20, 3.0);
        autoG.calcularValor();
        
        
        AutomovilDiesel autoD = new AutomovilDiesel("Lionel Messi", 
                "LCD-1102", 20, 2.0);
        autoD.establerDescuento(10);
        autoD.calcularLitros();
        autoD.calcularValor();
        
        System.out.println(autoG);
        System.out.print(autoD);
        
    }
}

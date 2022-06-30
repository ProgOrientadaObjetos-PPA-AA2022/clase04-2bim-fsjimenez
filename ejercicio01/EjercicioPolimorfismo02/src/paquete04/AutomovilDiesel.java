/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    private int numeroLitros;
    private double costoLitro;
    private double descuento;
    private double litrosNetos;
    
    public AutomovilDiesel(String name, String p, int n, double c){
        super(name, p);
        numeroLitros = n;
        costoLitro = c;
    }
    
    public void establerDescuento(double d){
        descuento = d;
    }
    
    public void calcularLitros(){
       litrosNetos = (numeroLitros * descuento) / 100;
    }
    
    @Override
    public void calcularValor(){
        valor = costoLitro * (numeroLitros - litrosNetos);
    }
    
    public int obtenerNumeroLitros(){
        return numeroLitros;
    }
    
    public double obtenerCostoLitro(){
        return costoLitro;        
    }
    
    public double obtenerLitrosNetos(){
        return litrosNetos;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sNumero de Litros: %d\nCosto por Litros: "
                + "%.2f\nPorcentaje del cupon: %.2f\nLitros netos: %.2f\n"
                + "Costo Total: %.2f",
                super.toString(),
                numeroLitros,  costoLitro,
                descuento, litrosNetos, valor);
        return cadena;
    }
}

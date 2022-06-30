/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil{
    private int numeroGalones;
    private double costoGalon;
    private int iva = 10;
    
    public AutomovilGasolina(String name, String p, int n, double c){
        super(name, p);
        numeroGalones = n;
        costoGalon = c;
    }
    
    @Override
    public void calcularValor(){
        valor = (costoGalon * numeroGalones) + ((costoGalon * numeroGalones * iva) / 100);
    }
    
    public int obtenerNumeroGalones(){
        return numeroGalones;
    }
    
    public double obtenerCostoGalon(){
        return costoGalon;
    }
    
    public int obtenerIVA(){
        return iva;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sNumero de galones: %d\nCosto por Galon: "
                + "%.2f\nIVA: %d\nCosto Total: %.2f\n",
                super.toString(),
                numeroGalones,  costoGalon,
                iva, valor);
        return cadena;
    }
}

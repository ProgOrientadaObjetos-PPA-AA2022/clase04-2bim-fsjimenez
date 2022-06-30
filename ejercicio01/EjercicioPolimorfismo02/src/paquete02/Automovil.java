/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombre;
    protected String placa;
    protected double valor;
    
    public Automovil(String n, String p){
        nombre = n;
        placa = p;
    }
    
    public abstract void calcularValor();
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerPlaca(){
        return placa;
    }
    
    public double obtenerValor(){
        return valor;
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("Datos del Automóvil: \nNombre: %s\n"
                + "Placa: %s\n", nombre, placa);
        return cadena;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author dani_
 */
public class Electrodomestico {
    
    private double precio;
    private String color;
    private char consumoEnerhetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnerhetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnerhetico = consumoEnerhetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnerhetico() {
        return consumoEnerhetico;
    }

    public void setConsumoEnerhetico(char consumoEnerhetico) {
        this.consumoEnerhetico = consumoEnerhetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}

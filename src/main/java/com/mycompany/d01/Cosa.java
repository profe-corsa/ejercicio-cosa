/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.d01;
import java.time.LocalDate;
/**
 *
 * @author crist
 */
public class Cosa {
    private int entero;
    private String cadena;
    private LocalDate fecha;
    
    public void establecerValor(int valor){
        this.entero = valor;
    }
    public void establecerValor(String valor){
        this.cadena = valor;
    }
    public void establecerValor(LocalDate valor){
        this.fecha = valor;
    }
    
    public String mostrar(){
        return "Entero: " + this.entero + " - cadena: " + this.cadena + " - fecha:" + this.fecha;
    }
    
    public static String mostrar(Cosa unaCosa){
        return "Entero: " + unaCosa.entero + " - cadena: " + unaCosa.cadena + " - fecha:" + unaCosa.fecha;
    }
}

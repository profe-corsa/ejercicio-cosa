/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.d01;
import java.time.LocalDate;
/**
 *
 * @author crist
 */
public class D01 {

    public static void main(String[] args) {
        Cosa c1 = new Cosa();
        System.out.println(c1.mostrar());
        c1.establecerValor(10);
        c1.establecerValor("Una cadena");
        c1.establecerValor(LocalDate.now());
        System.out.println(c1.mostrar());
        System.out.println("----------------------------------------------------");
        System.out.println(Cosa.mostrar(c1));
    }
}

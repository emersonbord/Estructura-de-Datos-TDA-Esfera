/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tda.esfera;

import java.util.Scanner;

/**
 *
 * @author Emerson Borda
 */
public class TDAEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double numero = sc.nextDouble();
        
        EsferaTDA esfera = new EsferaTDA(numero);
        
        System.out.println("Radio: " + esfera.getRadio());
        System.out.println("Diámetro: " + esfera.getDiametro());
        System.out.println("Circunferencia: " + esfera.getCircunferencia());
        System.out.println("Área: " + esfera.getArea());
        System.out.println("Volúmen: " + esfera.getVolumen());
    }
    
}

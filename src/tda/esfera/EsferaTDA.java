/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.esfera;

/**
 *
 * @author Emerson Borda
 */
public class EsferaTDA {
    
    private double radio;
    //Constructor encargado de inicializar nuestro radio
    public EsferaTDA(double radioInicial) {
        if (radioInicial>0) {
            this.radio=radioInicial;
        }else{
        this.radio= 0.0;
        }
    }
    //Métodos u operaciones
    public  double getRadio(){
        return this.radio;
    }
    
    public double getDiametro(){
        return (radio*2);
    }
    
    public double getCircunferencia(){
        return (Math.PI*getDiametro());
    }
    
    public double getArea(){
        return (4*Math.PI*getDiametro());
    }
    
    public double getVolumen(){
        return (4*Math.PI*Math.pow(radio, 3))/3;
    }
    
}

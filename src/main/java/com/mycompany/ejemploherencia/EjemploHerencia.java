/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploherencia;

/**
 *
 * @author labctr
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println ("Ingrese el valor del radio");
        double radio,base,altura;
        radio=leer.nextDouble();
        Circulo circulo1=new Circulo(radio);
        
        System.out.println("El area del circulo es:"+circulo1.CalcularArea());
        
        //crear un objeto de la clase Triangulo
        Triangulo triangulo1=new Triangulo(base,altura);
        //imprimir el valor del area 
        System.out.println("El area del triangulo es:"+triangulo1.CalcularArea());
        
        //crear un objeto de la clase Rectangulo
        Rectangulo rectangulo1=new Rectangulo(base,altura);
        //imprimir el valor del area 
        System.out.println("El area del rectangulo es:"+rectangulo1.CalcularArea());
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author JuanPablo
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //declaramos las variables
        int tarifa_basica = 3;
        int mensajes;
        double cargoPagar = 0;
        double precioPagar = 0;
        double iva = 0;
        double precioFinal = 0;
        
        //pedimos por teclado los mensajes que ahn enviado
        System.out.println("Ingrese la cantidad de mensajes enviados");
        mensajes = entrada.nextInt();
        
        //validamos los mensajes y calculamos el precio a pagar sin iva
        if(mensajes <= 40){
            precioPagar = tarifa_basica;
        }else{
            if(mensajes > 40 && mensajes <= 200){
                mensajes -= 40;
                System.out.println(mensajes);
                cargoPagar = mensajes * 0.05;
                precioPagar = tarifa_basica + cargoPagar;
            }else{
                if(mensajes > 200){
                    mensajes -= 40;
                    System.out.println(mensajes);
                    cargoPagar = mensajes * 0.10;
                    precioPagar = tarifa_basica + cargoPagar;
                }
            }
        }
        //calculamos el iva
        iva = precioPagar * 0.12;
        //calculamos el precio final ya con iva
        precioFinal = precioPagar + iva;
        
        //mostramos el resultado
        System.out.printf("El valor final a pagar es de: %.2f", precioFinal);
    }   
    
}
